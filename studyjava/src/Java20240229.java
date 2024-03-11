import java.util.Scanner;
public class Java20240229 {
    public static void main(String[] args) {
        boolean x = true;
        if(x){
            System.out.println("테스트중");
        }
        if(!x){
            System.out.println("이건 안보일걸");
        }
        //if~else
        if (x) {
            System.out.println("x는 true");
        }
        else{
            System.out.println("x는 false");
        }

        //if~else 중복
        boolean a = false;
        boolean b = false;
        boolean c = true;
        if (a) {
            System.out.println("a가 true");
        }
        else if (b) {
            System.out.println("a는 false, b가 true");
        }
        else if (c) {
            System.out.println("a,b는 false, c가 true");
        }
        else {
            System.out.println("a,b,c는 false");
        }

        //학점 코드 (범위를 나타내는 조건식)
        //조건식에 사용된 범위가 전체를 100% 커버해야한다
        Scanner scan = new Scanner(System.in);
        int score;
//        System.out.print("점수를 입력해주세요: ");
//        score = scan.nextInt();
        score = 90;
        if (score >= 90){
            System.out.println("A 학점");
        }
        else if (score >= 80 && score < 90){
            System.out.println("B 학점");
        }
        else if (score >= 70 && score < 80){
            System.out.println("C 학점");
        }
        else if (score >= 60 && score < 70){
            System.out.println("D 학점");
        }
        else{
            System.out.println("F 학점");
        }

        System.out.println("\n**********\n");

        //관계가 없는 조건을 if else로 설정하면 안됨
        int num = 4;
        if (num > 0){
            System.out.println("num 은 양수");
        }else if(num % 2 == 0){
            System.out.println("num 은 짝수");
        }
        //독립적인 if 문으로 만드는 것이 좋다
        if (num > 0){
            System.out.println("num 은 양수");
        }if(num % 2 == 0){
            System.out.println("num 은 짝수");
        }

        //if 속에 if문
        if (true) {
            if (true){
                if (true){
                    System.out.println("if문 속에 if문");
                }
            }

        }

        //switch case
        int number = 4;
        switch (number){
            case 1:
                System.out.println("A");
                break; //항상 break 키워드와 함께 쓰자
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
                break;

        }
        String abc = (3 < 2)? "yes" : "no";
        System.out.println(abc);
    }
}
