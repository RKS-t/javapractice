package chapter2.interitance;

public class Main {
    public static void main(String[] args) {
        Parents parents = new Parents();
        Child child = new Child();
        System.out.println("가문이름: " + child.familyName);
        System.out.println("명예: " + child.honor);
        child.supurTest();
        child.introFamily();
        parents.introFamily();
        child.introFamily();

    }
}
