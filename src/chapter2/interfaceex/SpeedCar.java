package chapter2.interfaceex;

public class SpeedCar implements Car{
    @Override
    public void drive() {
        System.out.println("SpeedCar drive");
    }

    @Override
    public void stop() {
        System.out.println("SpeedCar stop");
    }



    //   void drive(){
 //       System.out.println("SpeedCar drive");
  //  }
}
