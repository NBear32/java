import java.awt.*;
import java.util.Arrays;

public class Java20240306 {
    public static void main(String[] args) {
        String[] arrayTest1 = new String[5];
        for(int i = 0; i < arrayTest1.length; i++){
            arrayTest1[i] = String.valueOf(i + 1);
            System.out.println(arrayTest1[i]);
        }
        System.out.println();

        //문자열의 길이
        String str1 = "Hello Java!";
        String str2 = "안녕하세요! 반갑습니다.";
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println();

        //문자열 검색
        System.out.println(str1.charAt(1));
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.lastIndexOf('a'));
        System.out.println(str1.indexOf('a', 8));

        String apple = "apple basket";
        int appleNumber = 0;
        int charNumber = 0;

       while (true){
            int i = apple.indexOf('a', charNumber);

            if (i < 0){
                System.out.println("// a는 총 " + appleNumber + " 개");
                break;
            }else{
                System.out.print(i + " ");
                appleNumber = appleNumber + 1;
                charNumber = i + 1;
            }
        }
        System.out.println();

        //문자열 변환 및 연결
        String str3 = String.valueOf(2.3);
        String str4 = String.valueOf(false);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println();

        //문자열 연결
        String str5 = str3.concat(str4);
        System.out.println(str5);
        System.out.println();

        String str8 = "Hello Java!";
        String str9 = "안녕하세요";
        //문자열 byte 변환
        byte[] array1 = str8.getBytes();
        byte[] array2 = str9.getBytes();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
