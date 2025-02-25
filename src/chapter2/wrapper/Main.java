package chapter2.wrapper;

public class Main {
    public static void main(String[] args) {

        //기본형 변수
        int a = 1;
        System.out.println("a = "+ a);

        //참조형 변수
        Person personA = new Person();
        System.out.println("personA = "+ personA);

        //배열도 참조형 변수다   int[] arr = { 1, 3, 4 };

        //래퍼클래스 (기본형 변수를 감싸고 있는 클래스)
        //참조형 변수
        Integer num = 100;
        System.out.println("num = "+ num);
        String number = num.toString();
        System.out.println("number = "+ number);

        //직접만든 래퍼클래스
        CustumInteger myInteger = new CustumInteger(10);
        String num1 = myInteger.toString();

        //오토박싱
        Integer num2 = 10034;
        //Integer num2 =Integer,valueOf(10);

        //오토언박싱
        int num3 = num2;
        //int num3 = num2.intValue()

    }
}
