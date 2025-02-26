package assignment1.Calculator1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //양의 정수(0포함)를 입력받기
        Scanner value = new Scanner(System.in);

        while(true) {
            try {
                System.out.print("첫번째 양의 정수(0포함)를 입력해주세요: ");
                int num1 = value.nextInt();
                value.nextLine(); //줄바꿈제거

                System.out.print("두번째 양의 정수(0포함)를 입력해주세요: ");
                int num2 = value.nextInt();
                value.nextLine(); //줄바꿈제거

                //사직연산 기호를 입력받기
                System.out.print("사직연산 기호(+,-,*,/)중 하나를 입력해 주세요: ");
                char sign = value.next().charAt(0);
                value.nextLine(); //줄바꿈제거


                //위의 값을 가지고 연산 결과값 출력하기
                if (sign == '+') {
                    int sum = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");
                } else if (sign == '-') {
                    int sub = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + sub + "입니다.");
                } else if (sign == '*') {
                    int mul = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + mul + "입니다.");
                } else if (sign == '/') {
                    if (num2 != 0) {
                        int div = num1 / num2;
                        int remain = num1 % num2;
                        System.out.println(num1 + " / " + num2 + " = " + div + "이고 나머지는" + remain + "입니다.");
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                    }
                } else {
                    System.out.println("잘못된 문자입니다.");
                }
            }catch (InputMismatchException e) {
                System.out.println("올바른 숫자가 아닙니다."); //양의 정수가 아닌 문자가 입력되었을 때 예외 처리
            }

            System.out.print("계산기 종료를 원하시면 'exit'를 아니면 아무키나 입력해주세요.: ");
            String exit = value.nextLine();
            value.nextLine();
            if(exit.equals("exit")){
                break;
            }
        }

    }
}
