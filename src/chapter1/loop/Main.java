package chapter1.loop;

public class Main {
    public static void main(String[] args) {

        //for문
        for (int i = 1; i <= 10; i++) {
            if (i == 5 ) {
                break;
            }
            if (i == 2){
                continue;
            }
            System.out.println("i= "+ i);
        }
        //while 문
        int j=1;
        while (j<=10){
            System.out.println("j= "+ j);
            j++;
        }

        //do while 문
        int k=1;
        do {
            System.out.println("k= "+ k);
            k++;
        } while(k<=10);
    }
}
