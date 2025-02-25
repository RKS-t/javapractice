package chapter2.clas1;

public class Person {
    //1. 속성-변수 선언
    String name;
    int age;
    String address;

    //2.생성자
    // 기본 생성자 : Preson() {}
    //1. 클래스와 이름 동일
    //2. 반환타입 존재 x
    //3. 여러개 존재 가능
    Person(String name, int age) {
        this.name/*위쪽 변수*/ = name;/*이 함수 내 변수*/
        this.age = age;

    }

    //3.기능(method)
    int sum(int val1,int val2){
        return val1 + val2;
    }

    //게터
    String getName(){
        return name;
    }

    //세터
    void setAddress(String address){
        this.address = address;
    }
}
