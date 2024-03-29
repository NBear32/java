package Java20240328EduServer;

public class InfoCreate {
    public static void createInfos() {
        User tom = new User("Tom", "tom123", "12345", "tom123@user.com");
        User jake = new User("Jake", "jake_", "23456", "jake_@user.com");
        User michel = new User("Michel", "michel111", "34567", "michel111@user.com");
        User jay = new User("Jay", "jayjay", "45678", "jayjay@user.com");
        User suzy = new User("Suzy", "io12", "56789", "io12@user.com");

        Main.userList.add(new User());
        Main.userList.add(tom);
        Main.userList.add(jake);
        Main.userList.add(michel);
        Main.userList.add(jay);
        Main.userList.add(suzy);

        Lecture javasc = new Lecture("자바스크립트", 30, Difficultly.EASY, Category.PROGRAMMING, 1);
        Main.lectureList.add(javasc);
        Lecture java = new Lecture("자바 프로그래밍", 50, Difficultly.NORMAL, Category.PROGRAMMING, 2);
        Main.lectureList.add(java);
        Lecture spring = new Lecture("스프링", 30, Difficultly.EASY, Category.PROGRAMMING, 3);
        Main.lectureList.add(spring);


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

        Review riviewOne = new Review(1, 10, "좋은 강의였어요", "tom123", 1);
        Review.createReview(riviewOne);


    }
}
