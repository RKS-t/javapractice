package chapter2.interitance;

public class Parents {


    public String familyName = "스파르타";
    public int honor = 10 ;

    public void Parent(){
        System.out.println("부모 생성자");
    }

    public void introFamily(){
        System.out.println("우리 " + this.familyName + "가문");
    }


}
