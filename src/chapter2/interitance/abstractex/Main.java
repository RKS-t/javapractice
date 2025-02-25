package chapter2.interitance.abstractex;

public class Main {
    public static void main(String[] args) {
        //추상클래스는 추상화 불가능
//        Animal animal = new Animal(); 불가능
        Cat cat = new Cat();
        cat.name = "cat";
        cat.sleep();
        cat.eat();
    }
}
