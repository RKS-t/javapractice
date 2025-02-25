package chapter1.loop;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("원하는 구구단 숫자를 입력하세요 : ");
        int n = num.nextInt();
        if(n>=10){
            System.out.println("잘못된 숫자입니다. 2~9 사이의 숫자를 입력해주세요.");
        } else {
            System.out.println("====="+n+"단 입니다=====");
            for (int i=1;i<=9;i++) {
                System.out.println(n+"x"+i+"="+(i*n));
            }
        }



    }
}
