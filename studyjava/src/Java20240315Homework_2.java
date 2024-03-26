import java.util.Arrays;

public class Java20240315Homework_2 {
        static void bubble(int[] arr) {
            int n = arr.length;  //7
            int temp = 0;
            for (int i = 0; i < n; i++) {       // 배열의 길이(7) 만큼 반복
                for (int j = 1; j < (n - i); j++) {
                    if (arr[j - 1] > arr[j]) {  // arr[j-1] 이 arr[j]보다 크다면
                        temp = arr[j - 1];    // arr[j - 1]의 값을 temp 에 옮기고
                        arr[j - 1] = arr[j];  // arr[j - 1]의 값을 arr[j] 값으로 바꾼 뒤
                        arr[j] = temp;      // arr[j]의 값을 temp 로 바꾼다 (결과적으로 arr[j - 1]과 arr[j]의 값을 서로 바꾼다)
                    }
                }
            }
        }

        public static void main(String[] args) {
            int arr[] = {3, 60, 35, 2, 45, 320, 5};

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");  //초기 배열 값을 출력
            }
            System.out.println();

            bubble(arr);  //값 바꾸기 메소드 실행

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");  //변경된 배열 값을 출력
            }
        }
    }
