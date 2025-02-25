package chapter2.interfaceex;

public class LuxuryCar implements Car{
    @Override
    public void drive() {
        System.out.println("LuxuryCar move");
    }

    @Override
    public void stop() {
        System.out.println("LuxuryCar stop");
    }

//    void move(){
//        System.out.println("LuxuryCar move");
//    }
//
//    void stop(){
//        System.out.println("LuxuryCar stop");
//    }
}
