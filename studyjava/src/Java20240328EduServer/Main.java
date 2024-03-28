package Java20240328EduServer;

import Java20240328EduServerSample.LectureRegistration;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int nowUserNumber = 0;

    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        User tom = new User("Tom", "tom123", "12345", "tom123@user.com");
        User jake = new User("Jake", "jake_", "23456", "jake_@user.com");
        User michel = new User("Michel", "michel111", "34567", "michel111@user.com");
        User jay = new User("Jay", "jayjay", "45678", "jayjay@user.com");
        User suzy = new User("Suzy", "io12", "56789", "io12@user.com");

        userList.add(new User());
        userList.add(tom);
        userList.add(jake);
        userList.add(michel);
        userList.add(jay);
        userList.add(suzy);

        ArrayList<Lecture> lectureList = new ArrayList<>();
        Lecture javasc = new Lecture("자바스크립트", 30, "초급", "프로그래밍", 1);
        lectureList.add(javasc);
        Lecture java = new Lecture("자바 프로그래밍", 50, "중급", "프로그래밍", 2);
        lectureList.add(java);
        Lecture spring = new Lecture("스프링", 30, "초급", "프로그래밍", 3);
        lectureList.add(spring);

        ArrayList<LectureRegi> lecUserArray = new ArrayList<>();
        LectureRegi one = new LectureRegi("tom123", 1);
        lecUserArray.add(one);
        LectureRegi two = new LectureRegi("jake_", 3);
        lecUserArray.add(two);
        LectureRegi three = new LectureRegi("jayjay", 1);
        lecUserArray.add(three);
        LectureRegi four = new LectureRegi("tom123", 2);
        lecUserArray.add(four);
        LectureRegi five = new LectureRegi("io02", 3);
        lecUserArray.add(five);
        LectureRegi six = new LectureRegi("michel111", 1);
        lecUserArray.add(six);



        Scanner scanData = new Scanner(System.in);
        System.out.println("환영합니다.");

        while (true) {
            System.out.println();
            System.out.println("1. 강의 조회 / 2. 유저 조회 / 3. 수강생 이메일 // 종료하시려면 이외의 아무 키나 눌러주세요");
            int select = scan.nextInt();

            if (select == 1) {
                FindId(userList, lecUserArray);
            } else if (select == 2) {
                FindLec(userList, lecUserArray, lectureList);
            } else if (select == 3) {
                FindEmail(userList, lecUserArray, lectureList);
            } else {
                System.out.println("조회를 종료합니다.");
                break;
            }

        }
    }



    public static void FindId(ArrayList<User> userList, ArrayList<LectureRegi> lecUserArray){
        Scanner scan = new Scanner(System.in);
        System.out.println("조회를 원하시는 강의의 번호를 입력해주세요: ");
        int select = scan.nextInt();
        System.out.println("강의 " + select + "번 수강생 아이디 목록");
        for (int i = 1; i < userList.size(); i++) {
            for (int j = 0; j < lecUserArray.size(); j++) {
                if ((userList.get(i).getUserid().equals(lecUserArray.get(j).userid)) &&
                        (lecUserArray.get(j).lectureid == select)) {
                    System.out.println(userList.get(i).getUserid());
                }
            }
        }
    }

    public static void FindLec
            (ArrayList<User> userList, ArrayList<LectureRegi> lecUserArray, ArrayList<Lecture> lectureList){
        Scanner scan = new Scanner(System.in);
        System.out.println("등록된 유저의 아이디를 입력해주세요: ");
        String id = scan.nextLine();
        boolean boolid = false;
        for (int i = 1; i < userList.size(); i++){
            if (userList.get(i).getUserid().equals(id)){
                boolid = true;
            }
        }
        if (boolid == true) {
            System.out.println(id + " 유저가 수강하는 강의 목록: ");
            for (int i = 0; i < lecUserArray.size(); i++) {
                for (int j = 0; j < lectureList.size(); j++) {
                    if (id.equals(lecUserArray.get(i).userid) &&
                            lecUserArray.get(i).lectureid == lectureList.get(j).getLectureNum()) {
                        System.out.println(lectureList.get(j).getLecName());
                    }
                }
            }
        }else{
            System.out.println("등록되지 않은 아이디입니다.");
        }
    }

    public static void FindEmail
            (ArrayList<User> userList, ArrayList<LectureRegi> lecUserArray, ArrayList<Lecture> lectureList){
        Scanner scan = new Scanner(System.in);
        System.out.println("조회를 윈하시는 강의명을 입력해주세요: ");
        String id = scan.nextLine();
        System.out.println(id + " 강의를 듣는 수강생의 이메일: ");

        for (int i = 0; i < lectureList.size(); i++) {
            if(id.equals(lectureList.get(i).getLecName())) {
                for (int j = 0; j < lecUserArray.size(); j++) {
                    if (lectureList.get(i).getLectureNum() == lecUserArray.get(j).getLectureid()) {
                        for (int k = 0; k < userList.size(); k++) {
                            if (lecUserArray.get(j).userid.equals(userList.get(k).getUserid())) {
                                System.out.println(userList.get(k).getEmail());
                            }
                        }
                    }
                }
            }
        }
    }


   /* public static void Login(ArrayList<User> userList) {

        Scanner scanData = new Scanner(System.in);
        System.out.print("아이디를 입력해주세요: ");
        String id = scanData.nextLine();
        System.out.print("비밀번호를 입력해주세요: ");
        String pw = scanData.nextLine();

        int first = 0;
        int last = userList.size() - 1;

        for (int i = 1; i < userList.size(); i++) {
            if (userList.get(i).getUserid().equals(id) && userList.get(i).getPassword().equals(pw)) {
                nowUserNumber = i;
                System.out.println(userList.get(i).getName() + "님 환영합니다");
                break;
            }
        }
    }*/

}
