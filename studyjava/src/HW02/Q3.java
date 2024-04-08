package HW02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {
        // 사용자로부터 문자열 5개를 입력받아 컬렉션 구현체에 저장하고
        // 저장된 문자열들을 화면에 출력하시오.
        // 단, 중복 문자열은 저장하지 말아야 함

        // 여기 코드 작성 !!

        Set<String> strSet = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.println("문자열을 입력해주세요 " + (i + 1) + "/5 : ");
            strSet.add(scan.nextLine());
        }
        System.out.println(strSet);
    }
}
