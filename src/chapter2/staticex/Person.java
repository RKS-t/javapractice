package chapter2.staticex;

public class Person {
    //변수
    static int populantion = 0;

    Person(){
        populantion++;
    }

    //인스턴스 변수
    String name;

    //매서드
    static void prtintPo(){
        System.out.println("현재 인구 수: " + populantion);
    }

    //인스턴스 매서드
    void printname(){
        System.out.println("나의 이름은" + this.name);
    }
}
