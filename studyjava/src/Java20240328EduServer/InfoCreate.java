package Java20240328EduServer;

public class InfoCreate {
    public static void createInfos() {

        Main.userList.add(new User());
        User tom = new User("Tom", "tom123", "12345", "tom123@user.com");
        Main.userList.add(tom);
        User jake = new User("Jake", "jake_", "23456", "jake_@user.com");
        Main.userList.add(jake);
        User michel = new User("Michel", "michel111", "34567", "michel111@user.com");
        Main.userList.add(michel);
        User jay = new User("Jay", "jayjay", "45678", "jayjay@user.com");
        Main.userList.add(jay);
        User suzy = new User("Suzy", "io12", "56789", "io12@user.com");
        Main.userList.add(suzy);


        Teacher billy = new Teacher("billy530", "Billy");
        Main.teacherArray.add(billy);
        Teacher jackson = new Teacher("js001", "Jackson");
        Main.teacherArray.add(jackson);
        Teacher anne = new Teacher("annne77", "Anne");
        Main.teacherArray.add(anne);

        Lecture javasc = new Lecture("자바스크립트", 30, Difficultly.EASY,
                Category.PROGRAMMING, 1);
        Main.lectureList.add(javasc);
        Lecture java = new Lecture("자바 프로그래밍", 50, Difficultly.NORMAL,
                Category.PROGRAMMING, 2);
        Main.lectureList.add(java);
        Lecture spring = new Lecture("스프링", 30, Difficultly.EASY,
                Category.PROGRAMMING, 3);
        Main.lectureList.add(spring);
        Lecture cProgamming = new Lecture("C 프로그래밍", 30, Difficultly.HARD,
                Category.PROGRAMMING, 4);
        Main.lectureList.add(cProgamming);
        Lecture photoshop = new Lecture("포토샵", 30, Difficultly.NORMAL,
                Category.PROGRAMMING, 5);
        Main.lectureList.add(photoshop);


        LectureRegi one = new LectureRegi("tom123", 1);
        Main.lecUserArray.add(one);
        LectureRegi two = new LectureRegi("jake_", 3);
        Main.lecUserArray.add(two);
        LectureRegi three = new LectureRegi("jayjay", 1);
        Main.lecUserArray.add(three);
        LectureRegi four = new LectureRegi("tom123", 2);
        Main.lecUserArray.add(four);
        LectureRegi five = new LectureRegi("io02", 3);
        Main.lecUserArray.add(five);
        LectureRegi six = new LectureRegi("michel111", 1);
        Main.lecUserArray.add(six);

        LectureTeacher tOne = new LectureTeacher("billy530", 1);
        Main.lecTeacherArray.add(tOne);
        LectureTeacher tTwo = new LectureTeacher("js001", 2, 4);
        Main.lecTeacherArray.add(tTwo);
        LectureTeacher tThree = new LectureTeacher("annne77", 3, 5);
        Main.lecTeacherArray.add(tThree);


        Review riviewOne = new Review(10, "좋은 강의였어요", "tom123", 1);
        Review.createReview(riviewOne);
        Review riviewTwo = new Review(10, "만족합니다", "jake_", 3);
        Review.createReview(riviewTwo);
        Review riviewThree = new Review(1, " 별로였어요", "michel111", 3);
        Review.createReview(riviewThree);
        Review riviewFour = new Review(10, "좋은 강의였어요", "tom123", 1);
        Review.createReview(riviewFour);


    }
}
