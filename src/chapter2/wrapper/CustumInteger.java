package chapter2.wrapper;

public class CustumInteger {
    //속성
    int value;

    //생성자
    CustumInteger(int value){
        this.value = value;
    }
    //기능 -자동으로 문자열 변환
    // toString() 오버라이딩 (값을 출력할 수 있도록)
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
