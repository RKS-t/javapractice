package chapter2.clas1;

public class Car {
    //속성 변수 선언
    int carSpeed;

    //생성자
    Car(int carSpeed){
        this.carSpeed = carSpeed;
    }

    //기능
    public void accelerate(int accel){
        System.out.println(accel + "만큼 가속하여" + carSpeed + accel + "의 속도로 주행합니다.");
    }

    public void drive(){
        System.out.println("현재" + carSpeed + "의 속도로 유지하여 주행합니다.");
    }


}
