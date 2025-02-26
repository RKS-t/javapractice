package assignment1.Calculator2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {


    //계산 과정을 저장하는 컬렉션 추가
    private ArrayList<Calculator> calData = new ArrayList<>();

    //속성 변수 선언
    public int num1;
    public int num2;
    public int sign;
    private int[] result;

    //생성자
    public Calculator(int num1, int num2, char sign, int[] result) {
        this.num1 = num1;
        this.num2 = num2;
        this.sign = sign;
        this.result = result;
    }

    //매서드 함수 생성
    int[] Cal(int num1, int num2, char sign) {
        int[] result = null;
        //위의 값을 가지고 연산 결과값 출력하기
        if(sign == '+'){
            result = new int[]{num1 + num2, 0};
        } else if(sign == '-'){
            result = new int[]{num1 - num2, 0};
        } else if(sign == '*'){
            result = new int[]{num1 * num2, 0};
        } else if(sign == '/'){
            result = new int[]{num1 / num2, num1 % num2};
        }

        //연산 후 그 값을 저장
        calData.add(new Calculator(num1, num2, sign, result));
        return result;
    }

    public List<Calculator> getData(){
        return new ArrayList<>(calData);
    }

    public int[] getResult(){
        return result;
    }

    public void setData(List<Calculator> calData){
        this.calData=new ArrayList<>(calData);
    }



    }


