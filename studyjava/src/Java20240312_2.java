import java.util.Arrays;

public class Java20240312_2 {


        int a = 20;
        static int b = 30;
    public static void main(String[] args) {
//        print(a);
        print(b);

        //아래 배열의 모든 값들을 다른 배열에 복사하기
        int[] intArray = {1, 2, 3, 4, 5};
        int[] intArray2;
        intArray2 = new int [intArray.length];
        ArrayCopy(intArray, intArray2);
        print(intArray);
        print(intArray2);
    }

    public static void print(){
        System.out.println("Hello World!");
    }

    public static void print(int x){
        System.out.println(x);
    }

    public static void print(int[] intArray){
        System.out.println(Arrays.toString(intArray));
    }

    public static int[] ArrayCopy (int[] array1, int[] array2){
        for (int i = 0; i < array1.length; i++){
            array2[i] = array1[i];
//            System.out.print(array1[i]);
//            System.out.print(" " + array2[i]);
//            System.out.println();
        }
        return array2;
    }
}
