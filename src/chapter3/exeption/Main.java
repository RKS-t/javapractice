package chapter3.exeption;

public class Main {
    public static void main(String[] args) {

        //의도하지 않은 예외
//        int ret =10 / 0;
//        System.out.println("ret = " + ret);
//        System.out.println("프로그램 종료");
//        예외시 예외 발생 후 코드는 실행되지 않는다.

        //의도적인 예외
        int age = 10;
        if (age < 18) {
            throw new IllegalArgumentException("미성년자는 접근 할 수 없습니다.");
        }
        System.out.println("프로그램 종료");


    }
}
