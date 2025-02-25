package assignment1.Calculator2;

public class Calculator {

    private int result;


    //매서드 함수 생성
    int Cal(int num1, int num2, char sign) {
        int result = 0;
            //위의 값을 가지고 연산 결과값 출력하기
            if(sign == '+'){
                int sum = num1 + num2;
                result = sum ;
            } else if(sign == '-'){
                int sub = num1 - num2;
                result = sub ;
            } else if(sign == '*'){
                int mul = num1 * num2;
                result = mul ;
            } else if(sign == '/'){
                    int div = num1 / num2;
                    result = div ;
                }



        return result;

        }

    }


