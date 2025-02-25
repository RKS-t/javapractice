package chapter1.operater;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        // 기본 사칙연산
        int sum = a + b;
        System.out.println("sum = " + sum);

        int sub = a - b;
        System.out.println("sub = " + sub);

        int mul = a * b;
        System.out.println("mul = " + mul);

        //나눗셈

        int div = a / b;
        System.out.println("div = " + div);

        double div2 = a / 3.0;
        System.out.println("div2 = " + div2);

        //모듈러 연산자(나머지 연산)-%
        int mod = a % b;
        System.out.println("mod = " + mod);

        int mod2 = 15 % 4;
        System.out.println("mod2 = " + mod2);

        //시간 연산
        int mod3 = (10 + 9) % 12 ;
        System.out.println("mod3 = "+ mod3);

        //대입 연산자
        int num = 5;

        //복함 대입 연산자
        num += 3; //num = num + 3;
        System.out.println("num = " + num);

        num -= 2;
        System.out.println("num = " + num);

        num *= 2;
        System.out.println("num = " + num);

        num /= 3;
        System.out.println("num = " + num);

        num %= 3;
        System.out.println("num = " + num);

        //증감 연산사

        num = 1;
        num++;
        System.out.println("num = " + num);

        //전위 연산 (++i) 연산 후 값이 활용.
        int var = 5;
        System.out.println("(++var) = " + (++var));

        //후위 연산 (i++) 연산 전 값이 활용
        int var2 = 5;
        System.out.println("(var2++) = " + (var2++));
        System.out.println("var2 = " + var2);
        //비교연산자
        //같음 연산자 같음 true 다름 false
        System.out.println("10 == 10: "+ (10 == 10));

        //다름연산자 다름 true 같음 false
        System.out.println("10 != 5: "+ (10 != 5));

        //크기비교연산자
        System.out.println("10 < 5: "+ (10 < 5));
        System.out.println("10 >= 10: "+ (10 >= 10));
        System.out.println("10 < 10: "+ (10 < 10));

        // 논리연산자
        // AND 연산 (&&) - 두 조건이 모두 참일때 true 반환
        System.out.println("(true && true: )"+ (true && true)); //true
        System.out.println("(true && false: )"+ (true && false));//false

        //OR 연산 (||) - 두 조건 하나만 참이여도 true 반환
        System.out.println("true || false : "+ (true || false)); //true
        System.out.println("false || false : "+ (false || false));

        //NOT 연산 (!) 참이면 false 거짓이면 true
        System.out.println("!true = "+ (!true));
        System.out.println("!false = "+ (!false));

        boolean flag = 10 + 5 > 12 && true;
        System.out.println(flag);
        // 실행 순서: (10 + 5) > 12 && true : 산술
        // → 15 > 12 && true : 비교
        // → true && true : 논리
        // → flag = true 대입

        //논리 연산자 우선순위 (! -> && -> ||)
        boolean result = true || false && false ;
        System.out.println("result = " + result);

        boolean result2 = true || false && !false ;
        System.out.println("result2 = " + result2);

        //문자열 비교
        String text = "hello";
        String text2 = "Hello";
        // 나쁜 예 (text == text2)
        boolean isEqual = text.equals(text2);
        System.out.println("isEqual = " + isEqual);

    }
}
