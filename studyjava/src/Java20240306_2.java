import java.util.Arrays;
import java.util.Scanner;

public class Java20240306_2 {
    public static void main(String[] args) {
        //문자열 수정
        // @toLowerCase(), toUpperCase()
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        // @replace()
        System.out.println(str1.replace("study", "공부"));

        // @substring()
        System.out.println(str1.substring(0, 5)); // 0 <= 인덱스 < 5 의 문자열

        // @split()
        //split 메소드의 리턴형은 String[] 문자열의 배열이다
        String[] strArray = "abc/def-ghi jkl".split("/|-| ");
        System.out.println(Arrays.toString(strArray));

        // @trim
        String strTrim = "   abc def   ";
        System.out.println(strTrim.trim());
        //모든 공백 지우기
        System.out.println(strTrim.replaceAll(" ", ""));
        System.out.println();

        // 문자열의 내용 비교
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");

        // @stack 메모리 비교(==): 위치(번지) 비교
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str4 == str2);

        // @equals(), @equalsIgnoreCase: 내용 비교
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));

        int[] arrayTen_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arrayTen_1));

        int[] arrayTen_2 = new int[10];
        arrayTen_2[0] = 1;
        arrayTen_2[1] = 2;
        arrayTen_2[2] = 3;
        arrayTen_2[3] = 4;
        arrayTen_2[4] = 5;
        arrayTen_2[5] = 6;
        arrayTen_2[6] = 7;
        arrayTen_2[7] = 8;
        arrayTen_2[8] = 9;
        arrayTen_2[9] = 10;
        System.out.println(Arrays.toString(arrayTen_2));

        int[] arrayTen_3 = new int[10];
        for (int i = 0; i < arrayTen_3.length; i++) {
            arrayTen_3[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrayTen_3));

        String[] fruitList = {"배", "사과", "바나나", "딸기", "사과", "수박"};
        int count = 0;
        for (int i = 0; i < fruitList.length; i++) {
            if (fruitList[i] == "사과") {
                count = count + 1;
            }
        }
        System.out.println(count);

        //자바에서 입력값을 받는 방법
       /* Scanner newScan = new Scanner(System.in);
        System.out.print("0부터 6까지 숫자를 입력해주세요: ");
        int inputNumber = newScan.nextInt();

        if (inputNumber >= 0 && inputNumber <= 6){
            System.out.println(inputNumber);
        }else{
            System.out.println("잘못 입력하셨습니다.");
        }*/

        //자바에서 문자열을 입력받는 방법
        /*Scanner newScan2 = new Scanner(System.in);
        System.out.print("이름을 입력해주세요: ");
        String inputNumber2 = newScan2.nextLine();
        System.out.println(inputNumber2);*/

        // 사용자로부터 1~7 까지 숫자를 입력받아 아래 배열에 해당하는 요일을 출력
      /*  char[] week = {'월', '화', '수', '목', '금', '토', '일'};
        Scanner scan = new Scanner(System.in);
        System.out.print("1부터 7까지 숫자를 입력해주세요: ");
        int num = scan.nextInt();

        if (num >= 1 && num <= 7) {
            System.out.println(week[num - 1]);
            break;
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }*/

        String[] members = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Annie"};
        Scanner memberName = new Scanner(System.in);
        System.out.print("이름을 입력해주세요: ");
        String memNum = memberName.nextLine();

        /*for (int i = 0; i < members.length; i++){
            if (members[i].equalsIgnoreCase(memNum)){
                System.out.println(members[i] + "님 환영합니다.");
                break;
            }
            if (i == members.length - 1){
                    System.out.println("회원가입해주세요.");
            }
        }*/

        int k = 0;
        for ( ; k < members.length; k++){
            if (members[k].equalsIgnoreCase(memNum)){
                System.out.println(members[k] + "님 환영합니다.");
                break;
            }
        }
        if (k == members.length){
            System.out.println("회원가입해주세요.");
        }
    }
}
