package chapter1.io;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner scanP = new Scanner(System.in);

        System.out.print("이름을 입력해주세요 : ");
        String name = scanP.nextLine();
        System.out.print("나이를 입력해주세요 : ");
        int age = scanP.nextInt();
        System.out.println("출력 결과: ");
        System.out.println("이름:" + name);
        System.out.println("나이: " + age);



    }
}
