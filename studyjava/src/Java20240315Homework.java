import java.util.Arrays;

public class Java20240315Homework {
        public static void main(String[] args) {

            // 아래 문자열의 모음과 자음의 갯수를 각각 count 하시오
            // 모음은 a e i o u
            // 스페이스는 문자 아님
            String str = "This is a really simple sentence";
            str = str.toUpperCase();

            char[] chr = str.toCharArray();
            int count1 = 0;
            int count2 = 0;

            for(int i = 0; i < chr.length; i++) {
                if ((int)chr[i] >= 65 && (int)chr[i] < 91){
                    switch(chr[i]){
                        case 'A':
                        case 'E':
                        case 'I':
                        case 'O':
                        case 'U': count1 = count1 + 1; break;
                        default: count2 = count2 + 1;
                    }

                }
            }

            System.out.println(str);
            System.out.println("모음 " + count1 + "개");
            System.out.println("자음 " + count2 + "개");
        }
}
