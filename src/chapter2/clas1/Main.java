package chapter2.clas1;

public class Main {
    public static void main(String[] args) {
        //객체 생성(인스턴스화)
        Person personA = new Person("RKS", 30);
        Person personB = new Person("Paul",50);

        //속성에 직접 접근
//        System.out.println("personA.name= " + personA.name);
//        personA.name = "RKS";
//        personB.name = "Paul";
//        System.out.println("personA.name= " + personA.name);

        //기능 활용
        int result1 = personA.sum(4,5);
        int result2 = personB.sum(2,4);

        //게터 활용
        String name = personA.getName();
        System.out.println("name= " + name);

        //세터 활용
        System.out.println("personA 의 주소: " + personA.address);
        personA.setAddress("서울");
        System.out.println("personA 의 주소: " + personA.address);
    }
}
