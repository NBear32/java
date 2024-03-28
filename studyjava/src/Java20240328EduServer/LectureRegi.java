package Java20240328EduServer;

public class LectureRegi {
    String userid;
    int lectureid;


    public LectureRegi() {
    }

    public LectureRegi(String userid, int lectureid) {
        this.userid = userid;
        this.lectureid = lectureid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getLectureid() {
        return lectureid;
    }

    public void setLectureid(int lectureid) {
        this.lectureid = lectureid;
    }
}
