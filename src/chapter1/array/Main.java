package chapter1.array;

public class Main {
    public static void main(String[] args) {

        //1.배열 선언
//        int[] arr;

        //2.배열 길이 할당
//        arr = new int[5];
        // arr = [] [] [] [] []

        //3. 배열 선언과 같이 동시에 할당
//        int[] arr = new int[5];
        // arr = [] [] [] [] []

        //4. 배열 선언과 동시에 배열의 요소 할당
//        int[] arr = {10, 20, 30, 40, 50};
        //[10] [20] [30] [40] [50]

        //배열의 길이
//        int arrLength = arr.length;
//        System.out.println(arrLength);

        //문자열 배열
//        String[] strArr = new String[5];

        //논리형 배열 선언
//        boolean[] boArr = new boolean[5];

        //배열의 요소에 접근: 인덱스 활용 방법
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("배열의 1번째 요소 접근" + arr[0]);
        System.out.println("배열의 2번째 요소 접근" + arr[1]);
        System.out.println("배열의 3번째 요소 접근" + arr[2]);
        arr[0]=3000;
        System.out.println("배열의 1번째 요소 접근" + arr[0]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("인덱스: "+ i + ", 값" + arr[i]);
        }

        for(int a : arr){
            System.out.println("값: " + a);
        }

        //2차원 배열 행렬
        boolean[][] board = {
                {true, false},
                {false, true}
        };
        System.out.println(board[1][0]);
    }
}
