package Java20240328EduServer;

public class Lecture {
    private String lecName;
    private int playtime;
    private String grade;
    private String category;
    private int lectureNum;

    public Lecture() {
    }

    public Lecture(String lecName, int playtime, String grade, String category, int lectureNum) {
        this.lecName = lecName;
        this.playtime = playtime;
        this.grade = grade;
        this.category = category;
        this.lectureNum = lectureNum;
    }

    public String getLecName() {
        return lecName;
    }

    public void setLecName(String lecName) {
        this.lecName = lecName;
    }

    public int getPlaytime() {
        return playtime;
    }

    public void setPlaytime(int playtime) {
        this.playtime = playtime;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLectureNum() {
        return lectureNum;
    }

    public void setLectureNum(int lectureNum) {
        this.lectureNum = lectureNum;
    }
}
