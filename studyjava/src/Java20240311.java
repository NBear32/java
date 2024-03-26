import java.util.Arrays;

public class Java20240311 {

    static int a = 1;
    static int b = 2;
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3};
        modifyData(array);
        printArray(array);

        System.out.println(plusNums());
        System.out.println(plusNums(4, 5));
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println(plusNums(intArray));
        System.out.println(plusNums(1, 2, 3, 4, 5, 6));
    }

    public static void modifyData(int[] a){
        a[0] = 4;
        a[1] = 5;
        a[2] = 6;
    }

    public static void printArray(int[] a){
        System.out.println(Arrays.toString(a));
    }

    public static int plusNums(){
        return a + b;
    }

    public static int plusNums(int x, int y){
        return x + y;
    }

//    public static int plusNums(int[] intArray, int length){
//        int sum = 0;
//        for (int i=0; i< intArray.length; i++) {
//            sum = sum + intArray[i];
//        }
//        return sum;
//    }
//
//    public static int plusNums(int a, int b, int c, int d, int e){
//        return a + b + c + d + e;
//    }

    public static int plusNums(int... values){
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum = sum + values[i];
        }
        return sum;
    }
}
