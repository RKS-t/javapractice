package chapter2.polymorphism;

public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("meat eat");
    }

    @Override
    public void exist() {
        System.out.println("dog exist");
    }

    public void pow(){
        System.out.println("pow");
    }
}
