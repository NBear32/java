import java.util.ArrayList;
import java.util.Scanner;

public class Java20240313Homework {
    public static void main(String[] args) {

        // 아래 배열중에 짝수만 출력
            int [] arr = new int [] {1, 2, 3, 4, 5};
        ArrayList <Integer> aList = new ArrayList<Integer>();


            for(int i = 0; i < arr.length; i++){
                if ((arr[i] % 2) == 0){
                    aList.add(arr[i]);
                }
            }
        System.out.println(aList.toString());

        // 아래 문자열의 글자수를 카운트
        // 스페이스는 카운트하지 마시오
        String string = "The best of both worlds";
        int count = 0;
        char[] charCount = string.toCharArray();
        for (int i = 0; i < charCount.length; i++){
            if (charCount[i] != ' '){
                count = count + 1;
            }
        }
        System.out.println(count);


        //해석
      /*  int [] arr2 = new int [] {1, 2, 3, 4, 5};

        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 : ");
        int n = scan.nextInt();

        System.out.println("Original array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");  //arr2 출력
        }

        for(int i = 0; i < n; i++){ // n값이 3이므로 3번 반복됨
            int j, first;  // int 형 변수 j 와 first 생성. 아래 for 문을 빠져나와도 j 값이 저장됨

            first = arr2[0];  // 포인트 1  //1열 값 저장
            for(j = 0; j < arr2.length-1; j++){
                arr2[j] = arr2[j+1];  //2~5열 값을 1~4열로 한칸씩 앞으로 옮김
            }
            arr2[j] = first;  // 포인트 2 // 변경전의 1열 값을 5열로 옮김
        }
        System.out.println();

        System.out.println("New array: ");
        for(int i = 0; i< arr2.length; i++){
            System.out.print(arr2[i] + " ");  //변경된 arr2 값 출력
        }*/

        int [] arr2 = new int [] {1, 2, 3, 4, 5};

        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 : ");
        int n = scan.nextInt();

        System.out.println("Original array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        for(int i = 0; i < n; i++){
            int j, last;

            last = arr2[arr2.length - 1];  // 포인트 1
            for(j = arr2.length - 1; j > 0; j--){
                arr2[j] = arr2[j-1];
            }
            arr2[j] = last;  // 포인트 2
        }
        System.out.println();

        System.out.println("New array: ");
        for(int i = 0; i< arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

    }
}
