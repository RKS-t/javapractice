package chapter2.interitance;

public class Child extends Parents{

    public String familyName = "RKS";

    public Child(){
        super();
        System.out.println("자식생성자");
    }

    public void supurTest(){
        System.out.println(super.familyName);
    }

    @Override
    public void introFamily(){
        System.out.println("오버라이드");
    }

}
