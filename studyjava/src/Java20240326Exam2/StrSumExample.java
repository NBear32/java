package Java20240326Exam2;

public class StrSumExample {
    //  문자열 1, 2, 3, 4, 5의 각 자리에 있는 숫자를 더하는 코드를 완성하시오

    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            sum = sum + Character.getNumericValue(str.charAt(i));
        }

        System.out.println(sum);
    }
}
