import java.lang.reflect.Array;
import java.util.Arrays;

public class Java20240305 {
    public static void main(String[] args) {
        //break = 제어문의 중괄호를 탈출시키는 키워드
        for(int i = 0; i < 10; i++){
            System.out.println(i);
            if (i > 5) {
                break;
            }
        }
        System.out.println();

        //이중 for 문에서의 break 사용법
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++) {
                if (j == 3) {
                    i = 99999;  //매우 큰 수를 세팅해서 바깥 for 문 탈출
                    break;
                }
                System.out.println(i + ", " + j);
                //(i, j) = ((0, 0), (0, 1), (0, 2), (1, 0),(1, 1), ..., (9, 2),
            }
        }
        System.out.println();

        //바깥 for 문 까지 탈출하는 다른 방법
        out: //'out' 은 어떤 이름이든 상관 없다
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    break out; //'out' 은 어떤 이름이든 상관 없다
                }
                System.out.println(i + ", " + j);
                //(i, j) = ((0, 0), (0, 1), (0, 2), (1, 0),(1, 1), ..., (9, 2),
            }

        }
        System.out.println();

        // continue 사용법
        for(int i = 0; i < 10; i++){
            if (i % 2 == 1){
                continue;
                //break;
            }
            System.out.println(i);
        }
        System.out.println();

        //이중 for 문에서의 continue
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (j == 3){
                    continue;
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();

        //배열의 선언법
        int[] intArray1; //자바 스타일
        int intArray2[]; //C언어 스타일이고 쓰이지 않음

        //배열 객체 생성
        int[] intArray3 = new int[5]; //메모리에 5개의 빈 저장소를 만듦

        //배열 객체에 값 입력
        intArray3[0] = 10;
        intArray3[1] = 20;
        intArray3[2] = 30;
        intArray3[3] = 40;
        intArray3[4] = 50;
        for (int i = 0; i < 5; i++){
            System.out.print(intArray3[i] + " ");
        }
        System.out.println();

        //배열의 선언, 생성, 입력을 한번에 수행하는 코드
        int[] intArray4 = {10, 20, 30, 40, 50};
        for(int i = 0; i < 5; i++){
            System.out.println(intArray4[i] + " ");
        }

        //배열의 값 대입 방법 1
        int[] array1 = new int[3];
        array1[0] = 3;
        array1[1] = 4;
        array1[2] = 5;
        System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);

        int[] array2;
        array2 = new int[3];
        array2[0] = 3;
        array2[1] = 4;
        array2[2] = 5;
        System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);

        //배열의 값 대입 방법 2
        int[]array3 = new int[]{3, 4, 5};
        System.out.println(array3[0] + " " + array3[1] + " " + array3[2]);

        int[] array4;
        array4 = new int[]{3, 4, 5};
        System.out.println(array4[0] + " " + array4[1] + " " + array4[2]);

        //배열의 값 대입 방법 4
        int[] array5 = {3, 4, 5};
        System.out.println(array5[0] + " " + array5[1] + " " + array5[2]);

        //배열의 선언과 객체 대입을 분리 불가능
//        int[] array6;
//        array6 = {3, 4, 5}; // 불가능
//        System.out.println(array6[0] + " " + array6[1] + " " + array6[2]);
        System.out.println();

        int[] intList = new int[3];
        float[] floatList = new float[3];
        boolean[] boolList = new boolean[3];
        char[] charList = new char[3];
        String[] strList = new String[3];
        System.out.println(Arrays.toString(intList));
        System.out.println(Arrays.toString(floatList));
        System.out.println(Arrays.toString(boolList));
        System.out.println(Arrays.toString(charList));
        System.out.println(Arrays.toString(strList));
    }
}
