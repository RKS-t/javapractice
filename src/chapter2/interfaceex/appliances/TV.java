package chapter2.interfaceex.appliances;

public class TV implements OnOff {
    @Override
    public void turnOn() {
        System.out.println("TV ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV OFF");
    }
}
