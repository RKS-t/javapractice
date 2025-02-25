package chapter1.operater;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해 주세요: ");
        int num1 = num.nextInt();
        System.out.print("두번째 숫자를 입력해 주세요: ");
        int num2 = num.nextInt();

        //더하기
        int sum = num1 + num2;
        System.out.println("덧셈 결과 = " + sum);

        //빼기
        int sub = num1 - num2;
        System.out.println("뺄셈 결과 = " + sub);

        //곱하기
        int mul = num1 * num2;
        System.out.println("곱셈 결과 = " + mul);

        //나누기

        int div = num1 / num2;
        System.out.println("나눗셈 = " + div);

        //나머지
        int mod = num1 % num2;
        System.out.println("나머지 = " + mod);


    }
}
