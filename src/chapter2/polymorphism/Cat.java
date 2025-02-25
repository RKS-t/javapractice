package chapter2.polymorphism;

public class Cat implements Animal {




    @Override
    public void eat() {
        System.out.println("fish eat");
    }

    @Override
    public void exist() {
        System.out.println("cat exist");
    }

    public void meow() {
        System.out.println("meow");
    }


}
