package chapter2.polymorphism;

public class Main {
    public static void main(String[] args) {

        //다향성 활용
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.eat();
        animal2.eat();
        animal1.exist();
        animal2.exist();

        //업캐스팅 주의사항 자식의 기능 사용 불가

        //다운캐스팅
        Cat cat = (Cat) animal1;
        cat.meow();
        Dog dog = (Dog) animal2;
        dog.pow();

        //잘못된 다운캐스팅 문제
//        Cat cat2 = (Cat) animal2;
//        cat2.meow();
//
        //다운캐스팅 시 instanceof 활용 방법
        if (animal1 instanceof Cat) {
            Cat cat2 = (Cat) animal1;
            cat2.meow();
        }else {
            System.out.println("고양이가 아닙니다.");
        }
    }
}
