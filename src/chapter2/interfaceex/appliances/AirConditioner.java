package chapter2.interfaceex.appliances;

public class AirConditioner implements OnOff {
    @Override
    public void turnOn() {
        System.out.println("Air Conditioner ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Air Conditioner OFF");
    }
}
