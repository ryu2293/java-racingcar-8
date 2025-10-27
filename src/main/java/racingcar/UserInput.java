package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class UserInput {

    public static List<String> inputCarName(){
        System.out.println("자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.");
        String input = Console.readLine();
        checkCarName(input);
        var name = input.split(",");
        return List.of(name);
    }

    public static int tryCount(){
        System.out.println("시도할 횟수를 입력하세요.(1이상의 정수)");
        String input = Console.readLine();
        checkTryCount(input);
        return Integer.parseInt(input.trim());
    }

    public static void checkCarName(String input){
        String[] names = input.split(",", -1);
        for(String name : names){
            String trimName = name.trim();
            if(trimName.isEmpty() || trimName.length() > 5){
                throw new IllegalArgumentException("자동차 이름은 1~5자인 경우만 가능하다.");
            }
        }
    }

    public static void checkTryCount(String input){
        int count;
        try{
            count = Integer.parseInt(input.trim());
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("시도 횟수는 숫자만 입력 가능하다");
        }

        if(count < 1){
            throw new IllegalArgumentException("시도 횟수는 1이상");
        }
    }
}
