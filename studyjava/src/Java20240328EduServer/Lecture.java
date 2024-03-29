package Java20240328EduServer;

public class Lecture {
    private String lecName;
    private int playtime;
    private Difficultly difficultly;
    private Category category;
    private int lectureNum;

    public Lecture() {
    }

    public Lecture(String lecName, int playtime, Difficultly difficultly, Category category, int lectureNum) {
        this.lecName = lecName;
        this.playtime = playtime;
        this.difficultly = difficultly;
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

    public Difficultly getGrade() {
        return difficultly;
    }

    public void setGrade(Difficultly difficultly) {
        this.difficultly = difficultly;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {this.category = category;}

    public int getLectureNum() {
        return lectureNum;
    }

    public void setLectureNum(int lectureNum) {
        this.lectureNum = lectureNum;
    }
}
