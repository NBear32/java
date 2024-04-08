package Java20240328EduServer;

public class LectureTeacher {
    String teacherId;
    int rectureId;
    int rectureId2;
    int rectureId3;

    public LectureTeacher() {
    }

    public LectureTeacher(String teacherId, int rectureId) {
        this.teacherId = teacherId;
        this.rectureId = rectureId;
    }

    public LectureTeacher(String teacherId, int rectureId, int rectureId2) {
        this.teacherId = teacherId;
        this.rectureId = rectureId;
        this.rectureId2 = rectureId2;
    }

    public LectureTeacher(String teacherId, int rectureId, int rectureId2, int rectureId3) {
        this.teacherId = teacherId;
        this.rectureId = rectureId;
        this.rectureId2 = rectureId2;
        this.rectureId3 = rectureId3;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public int getRectureId() {
        return rectureId;
    }

    public void setRectureId(int rectureId) {
        this.rectureId = rectureId;
    }
}
