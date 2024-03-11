import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Java20240308_2 {
    public static void main(String[] args) {
        //메소드 호출
        int[] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
        int[] numberList2 = {123, 345, 235, 3223, 143, 556};
        getSumAvg(numberList);
        getSumAvg(numberList2);

        int[] intArray = new int[10];
        Scanner intScan = new Scanner(System.in);
        ArrayList<Integer> triList = new ArrayList<Integer>();

        for (int i = 0; i < intArray.length; i++){
            System.out.print("양의 정수를 10개 입력해주세요 (" + (i + 1) + "/10) : ");
            intArray[i] = intScan.nextInt();
            if (intArray[i] <= 0){
                System.out.println("양수를 입력해주세요");
                i = i - 1;
            }
            else if (intArray[i] % 3 == 0){
                triList.add(intArray[i]);
            }
        }
        int[] triArray = new int[triList.size()];
        for (int i = 0; i < triArray.length; i++){
            triArray[i] =  triList.get(i);
        }
        System.out.println("3의 배수 : " + Arrays.toString(triArray));
    }

    static void getSumAvg(int[] numberList){
        float addNumber = 0f;
        float averageNumber = 0f;

        for (int i = 0; i < numberList.length; i++){
            addNumber = addNumber + numberList[i];
        }
        averageNumber = addNumber / numberList.length;

        System.out.println("numberList 의 총합은 " + (int)addNumber + " 이고");
        System.out.println("numberList 의 평균은 " + averageNumber + " 입니다.");
        System.out.println();
    }
}
