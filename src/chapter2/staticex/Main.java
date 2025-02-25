package chapter2.staticex;

public class Main {
    public static void main(String[] args) {
        //스태틱 변수 매서드
        System.out.println("static 변수 활용: " + Person.populantion);
        Person.prtintPo();

        //인스턴스 멤버 활용
        Person p1 = new Person();
        p1.name = "RKS";
        p1.printname();

    }
}
