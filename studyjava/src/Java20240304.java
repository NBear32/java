import java.util.Arrays;
import java.util.Scanner;
import java.util.WeakHashMap;

public class Java20240304 {
    public static void main(String[] args) {
        int q = 3;
        int w = 5;
        int e = (q <= w) ? q : w;
//        System.out.println(e);
        String d = new String("apple");
//        System.out.println(d);

        for (int i = 0; i < 5; i = i + 1) {
//            System.out.println(i);
        }

        //무한루프
//        for(int i = 0; i >= 0; i++){
//            System.out.println(i);
//        }

        int a;
        for (a = 0; a < 3; a++) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0, j = 0; i < 10; i++, j++) {
            System.out.print(i + j + " ");
        }
        System.out.println();

        /*
        for(int i = 0; ; i++){
            System.out.print(i + " ");
        }
        for(;;){
            System.out.print("무한 루프");
        }
        */
        System.out.println();

        //무한 루프 탈출
        for (int i = 0; ; i++) {
            if (i > 10) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.print("무한 루프 탈출");
        System.out.println();

        //for 문 변형하기
        int i = 0;
        for (; ; ) {
            if (i < 5) {
                System.out.print(i + " ");
                i++;
            } else {
                break;
            }
        }
        System.out.println();

        //멀티 조건식
        for (int y = 0, j = 0; y < 5 || j < 5; y++, j++) {
            System.out.print(y + "_" + j + " ");
        }
        System.out.println();

        //while 문
        int count = 0; //초기식
        while (count < 5) {
            System.out.print(count + " ");
            count++; //증감식
        }
        System.out.println();
        //의도적인 무한루프에서 while문은 자주 쓰임
       /* while (true){
            //무한루프
            //유저가 버튼 클릭할 때 까지 대기
            //if (esc 버튼 클릭)
            //   break;
        } */
        //do~while 문
        int cnt = 5; //초기식
        do {
            System.out.print(cnt + " ");
            cnt++;
        } while (cnt < 5);
        System.out.println();
        //아래 while 문과 비교하면
        //반복문의 조건이 처음부터 false 인 경우,
        //do~while 문은 실행코드가 1회 실행되는 반면, while 문은 실행되지 않음
        int cnt2 = 5;
        while (cnt2 < 5) {
            System.out.print(cnt2 + " ");
            cnt2++;
        }
        System.out.println();

        for (int k = 0; k < 3; k++) {
            for (int g = 0; g < 5; g++) {
                System.out.print("[k=" + k + ", g=" + g + "]");
                if (k == g) {
                    System.out.print(" k = g");
                }
                System.out.println();
            }
        }

        String[] colorList = {"black", "green", "white"};
        System.out.println(colorList[0]);

        String[] studentlist = {"1", "2", "3"};

        for (int name = 1; name < 3; name++) {
            studentlist[name] = colorList[name];
            System.out.println(studentlist[name]);
        }

        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println(intArray[0]);

        int[] intArray2 = new int[50];
        //int[] intArray3 = 가변의 길이를 가진 배열을 저장함
//        intArray2 = {1, 2, 3, 4, 5}; //오류
        for (int arrayNumber = 0; arrayNumber < intArray2.length; arrayNumber++) {
            intArray2[arrayNumber] = arrayNumber + 1;
            System.out.print(intArray2[arrayNumber] + " ");
        }
        System.out.println();

        int[] intArray4 = new int[]{1, 2, 3, 4, 5};
        System.out.println(intArray4[0]);

        //배열의 복사 ( = 참조복사)
        String[] str1 = {"black", "red", "blue"};
        String[] str2 = str1;
        System.out.println("1" + str2[0]);
        str2[0] = "white";
        System.out.println("2" + str2[0]);
        System.out.println("3" + str1[0]);

        //기본자료형의 복사 (값복사)
        int numA = 3;
        int numB = numA;
        System.out.println("1. " + numB);
        numB = 6;
        System.out.println("2. " + numB);
        System.out.println("3. " + numA);

    }
}
