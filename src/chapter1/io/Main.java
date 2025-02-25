package chapter1.io;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //println 사용
        System.out.println("hello");
        System.out.println("java");

        //print 사용
        System.out.print("안녕");
        System.out.print("자바");

        //개행문자포함 출력
        System.out.println("\n나\n다시");

        // 입력(Scanner)
        Scanner scanner = new Scanner(System.in);

        //문자열 입력받기
        System.out.print("좋아하는 문장을 입력하세요: ");
        String sen = scanner.nextLine();
        System.out.println("sen = " + sen);

        //정수형 입력받기
        System.out.print("정수(int)를 입력하세요: ");
        int intbox = scanner.nextInt();
        System.out.println("intbox = " + intbox);

        System.out.print("정수(long)를 입력하세요: ");
        long longbox = scanner.nextLong();
        System.out.println("longbox = " + longbox);

        //소수점
        System.out.print("소수점(Double)을 입력하세요: ");
        double doublebox = scanner.nextDouble();
        System.out.println("doublebox = " + doublebox);


    }
}
