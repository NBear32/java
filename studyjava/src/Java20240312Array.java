import java.util.Arrays;

public class Java20240312Array {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] fr = new int[arr.length];  //arr 길이만큼의 배열 fr 생성
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            if (fr[i] == visited){
            continue;
        }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) { // fr[i] 와 fr[i+1]부터 순차적으로 비교
                    count++;
                    fr[j] = visited; //서로 같으면 count 를 1 늘리고 fr[j] 를 -1로 변환
                }
            }
            if (fr[i] != visited)
                fr[i] = count; // fr[i]가 -1이 아니면 fr[i]를 count 로 변환
            System.out.println(Arrays.toString(fr));
        }

        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + fr[i]); //fr[i]가 -1이 아닐경우 출력

            /*fr 8 = -1
            fr 456 = -1;

            1 2
            2 4
            8 1
            3 1
            5 1

             */
        }
    }
}

