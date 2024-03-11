import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Java20240307 {
    public static void main(String[] args) {
    /*    String str1 = "   Jhon   ";
        String str2 = "Alex";

        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.trim());
        System.out.println(str1.replace("Jhon", str2));
        System.out.println(str1.concat(str2));

    */

        //0~10중 하나의 수를 입력받아 그 수보다 큰 값을 출력
        int[] intList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scan = new Scanner(System.in);
        int[] arrayLargeNumber = new int[intList.length];
        int largeNumberCount = 0;
//        System.out.print("0~10 까지 숫자를 입력해주세요: ");
//        int num = scan.nextInt();

        /*for (int i = 0; i < intList.length; i++) {
            if (intList[i] > num) {
                System.out.print(intList[i] + " ");
                arrayLargeNumber[largeNumberCount] = intList[i];
                largeNumberCount = largeNumberCount + 1;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arrayLargeNumber));*/

        /*ArrayList<Integer> intList3 = new ArrayList<Integer>();
        for (int i = 0; i < intList.length; i++){
            if (intList[i] > num) {
                intList3.add(intList[i]);
            }
        }
        System.out.println(intList3.toString());*/

        //아래 배열의 총합과 평균을 출력하시오
        /*int[] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
        float addNumber = 0f;
        float averageNumber = 0f;

        for (int i = 0; i < numberList.length; i++){
            addNumber = addNumber + numberList[i];
        }
        averageNumber = addNumber / numberList.length;

        System.out.println("numberList 의 총합은 " + (int)addNumber + " 이고");
        System.out.println("numberList 의 평균은 " + averageNumber + " 입니다.");
        System.out.println();

        //사용자로부터 문자열을 입력받아서 입력받은 문자열을 거꾸로 출력
        Scanner scan1 = new Scanner(System.in);
        System.out.print("문자를 입력해주세요: ");
        String scanChar = scan1.nextLine();
//        char[] stringLine = new char[scanChar.length()];
        char[] stringLine = scanChar.toCharArray();

//        for(int i = 0; i < scanChar.length(); i++){
//              stringLine[i] = scanChar.charAt(i);
//        }

        System.out.print("거꾸로 출력: ");
        for(int i = 0; i < stringLine.length; i++){
            System.out.print(stringLine[(stringLine.length - 1) - i]);
        }
        System.out.println();*/

        //난수생성법, Random 숫자 만드는법
        /*Random rd = new Random();
        int randNum = rd.nextInt(10) + 1;
        System.out.println(randNum);*/

        // 1~45까지의 랜덤한 정수를 length 가 6인 배열에 넣으시오
        // 단, 중복 숫자는 허용하지 않음

        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++){
            Random lottoNum = new Random();
            lotto[i] = lottoNum.nextInt(6) + 1;
            for (int j = 0; j < lotto.length; j++) {
                if ((lotto[i] == lotto[j]) && i != j) {
                    lotto[i] = lottoNum.nextInt(6) + 1;
                    j = -1;
                }
            }
        }
        System.out.println(Arrays.toString(lotto));
        System.out.println();


//        int[] lotto = new int[6];
//
//        for (int i = 0; i < lotto.length; i++){
//            Random lottoNum = new Random();
//            lotto[i] = lottoNum.nextInt(6) + 1;
//            for (int j = 0; j < i; j++){
//                if ((lotto[i] == lotto[j]))
//                {
//                    i = i - 1;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(lotto));

        //제어문 배열 스트링 (4 5장)
    }
}
