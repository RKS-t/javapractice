package chapter2.interfaceex.appliances;

public class Computer implements OnOff {
    @Override
    public void turnOn() {
        System.out.println("Computer ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Computer OFF");
    }
}
