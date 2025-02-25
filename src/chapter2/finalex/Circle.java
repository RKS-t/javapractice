package chapter2.finalex;

public class Circle {

    //속성
    final static double PI = 3.14159265358979323846;
    double radius;


    //생성자
    Circle(double radius) {
        this.radius = radius;
    }

    //기능
    //내부상태변경
    Circle changeR(double newR) {
        return new Circle(newR);
    }
}
