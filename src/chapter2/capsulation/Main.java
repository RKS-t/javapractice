package chapter2.capsulation;

public class Main {
    public static void main(String[] args) {

        //생성자 호출
        Person person = new Person("RKS");

        //인스턴스 변수 접근
//        person.name = "RKS" ; 첫번째 지정후 접근 불가능
       // person.secret = "???";

        //매서드
//        person.methodA();
//        person.methodB(); 작동x


        //게터
        String name = person.getName();
        System.out.println("Name: " + name);


        //세터
        person.setName("Paul");
        String name2 = person.getName();
        System.out.println("Name2: " + name2);

    }
}
