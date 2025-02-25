package chapter1.variable;

public class Main {
    public static void main(String[] args) {

        //[자료형] [변수이름];

        // 정수형
        int a;
        a = 1;
        a = 2;
        System.out.println("a = " + a);

        //논리형
        boolean booleanBox = true;
        System.out.println("booleanBox = " + booleanBox);

        //문자형
        char charBox = 'a';
        charBox = 'b' ;
        System.out.println("charBox = " + charBox);

        //큰 정수형

        long longBox = 1;
        longBox = 2;
        System.out.println("longBox = " + longBox);

        //실수형
        float floatBox = 0.1325235f;  //더블을 자주써서 프로그램이 더블로 바꾸는 것 방지 ->f
        System.out.println("floatBox = " + floatBox);


        double doubleBox = 0.13252352234;
        System.out.println("doubleBox = " + doubleBox);

        //캐스팅 (Casting)
        // 다운캐스팅: 큰 데이터를 -> 작은 상자
        double bigBox = 10.123;
        int smallBox = (int) bigBox;
        System.out.println("smallBox = " + smallBox);

        //업캐스팅 : 작은데이터 -> 큰 상자
        int smallBox2 = 10;
        double bigBox2 = smallBox2;
        System.out.println("bigBox2 = " + bigBox2);

        //문자열 데이터
        char a1 = 'a';
        String str = "안녕하세요!";

        //정수형 int, long +논리형 boolean +문자열 char string 암기


    }
}
