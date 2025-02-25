package chapter2.finalex;

public class Main {
    public static void main(String[] args) {

        System.out.println("상수 활용" + Circle.PI);

        //불변객체 활용
        final Circle c1 = new Circle(2);
        //참조 변경은 막지만 내부 상태 변경은 안막음
        // c1 = new Circle(5); 참조 상태 변경
        // c1.radius = 5; 내부 상태 변경 -> 막고싶을 시 radius 변수에 final 사용

        //불변 객체 내부 상태 변경
        Circle c2 = new Circle(8);
        Circle c3 = c2.changeR(4);
    }
}
