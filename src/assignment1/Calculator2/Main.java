package assignment1.Calculator2;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //초기값
        Calculator cal = new Calculator(0, 0, '+', new int[]{0, 0});
        Scanner value = new Scanner(System.in);
        //
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


                if (sign == '/' && num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    int[] result = cal.Cal(num1, num2, sign);
                    if (sign == '/') {
                        System.out.println(num1 + " / " + num2 + " = " + result[0] + "이고 나머지는" + result[1] + "입니다.");
                    } else if (sign == '*' || sign == '+' || sign == '-') {
                        System.out.println(num1 + " " + sign + " " + num2 + " = " + result[0] + "입니다.");
                    } else {
                        System.out.println("잘못된 문자입니다.");
                        value.nextLine();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("올바른 숫자가 아닙니다."); //양의 정수가 아닌 문자가 입력되었을 때 예외 처리
                value.nextLine();
            }

            System.out.print("계산기 종료를 원하시면 'exit'를 아니면 아무키나 입력해주세요. 다른키를 누르면 종료됩니다.: ");
            String exit = value.nextLine();
            if(exit.equals("exit")){
                //계산기를 종료할 때 세터로 calData의 값을 전부 초기화 해주기
                break;
            }

        }
        System.out.print("계산 내역을 출력하시겠습니까? 출력을 원하시면 y를 누르세요: ");
        String historyYN = value.nextLine();
        if(historyYN.equals("y")){
            List<Calculator> history = cal.getData();
            int[] result = cal.getResult();
            //향상된 for문 사용하여 history 읽기
            for (Calculator data : history) {
                if(data.sign == '/'){
                    System.out.println(data.num1 + " " + data.sign + " " + data.num2 + " = " + result[0] + " 나머지: " + result[1]);
                }else{
                    System.out.println(data.num1 + " " + data.sign + " " + data.num2 + " = " + result[0]);
                }
            }
            //삭제 반복문

            while(true) {
                System.out.print("가장 오래된 계산 내역을 삭제하시겠습니까? 삭제하고 싶으시면 'y' 를 눌러주세요. 'n'을 누르면 종료됩니다.");
                String removeYN = value.nextLine();

                try {
                    if (removeYN.equals("y")) {
                        //세터로 가장 오래된 정보 삭제

                        cal.setData();

                        //삭제 후 데이터 불러오기(꼭 해야되는 것인가?)
                        List<Calculator> reHistory = cal.getData();
                        int[] reResult = cal.getResult();
                        //삭제 후 히스토리 읽기
                        for (Calculator data : reHistory) {
                            if (data.sign == '/') {
                                System.out.println(data.num1 + " " + data.sign + " " + data.num2 + " = " + reResult[0] + " 나머지: " + reResult[1]);
                            } else {
                                System.out.println(data.num1 + " " + data.sign + " " + data.num2 + " = " + reResult[0]);
                            }
                        }
                    } else if (removeYN.equals("n")) {
                        break;
                    }
                } catch (IndexOutOfBoundsException n) {
                    System.out.println("더 이상 삭제 할 수 없습니다. 계산기를 종료합니다.");
                    break;
                }

            }
        }

    }
}

