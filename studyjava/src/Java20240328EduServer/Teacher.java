package Java20240328EduServer;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
    String teacherId;
    String teacherName;

    public Teacher() {
    }

    public Teacher(String teacherId, String teacherName) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public static String findTeacherNameFromTeacherId(String teacherId) {
        String teacherName = "";
        for (int i = 0; i < Main.teacherArray.size(); i++) {
            if (teacherId.equals(Main.teacherArray.get(i).getTeacherId())) {
                teacherName = Main.teacherArray.get(i).getTeacherName();
            }
        }

        return teacherName;
    }

    public static String getTeacherByLectureId() {
        String lecId;
        Scanner scan = new Scanner(System.in);
        System.out.println("조회를 원하시는 강의를 입력해주세요: ");
        lecId = scan.nextLine();
        for (int i = 0; i < Main.lectureList.size(); i++) {
            if (lecId.equals(Main.lectureList.get(i).getLecName())) {
                for (int j = 0; j < Main.lecTeacherArray.size(); j++) {
                    if (Main.lectureList.get(i).getLectureNum() == Main.lecTeacherArray.get(j).getRectureId()) {
                        return findTeacherNameFromTeacherId(Main.lecTeacherArray.get(j).getTeacherId());
                    }
                }
            }
        }
        return ("찾을 수 없습니다");
    }

    public static ArrayList<String> getLectureTitleListByTeacherId() {
        String teacherName;
        Scanner scan = new Scanner(System.in);
        System.out.println("수업 목록 조회를 원하시는 강사를 입력해주세요: ");
        teacherName = scan.nextLine();
        ArrayList<String> lecList = new ArrayList<>();
        for (int i = 0; i < Main.teacherArray.size(); i++) {
            if (teacherName.equals(Main.teacherArray.get(i).teacherName)) {
                for (int j = 0; j < Main.lecTeacherArray.size(); j++) {
                    if (Main.teacherArray.get(i).teacherId.equals(Main.lecTeacherArray.get(j).teacherId)) {
                        lecList.add(Lecture.findLecNameFromLecNumber(Main.lecTeacherArray.get(j).rectureId));
                        lecList.add(Lecture.findLecNameFromLecNumber(Main.lecTeacherArray.get(j).rectureId2));
                        lecList.add(Lecture.findLecNameFromLecNumber(Main.lecTeacherArray.get(j).rectureId3));
                    }
                }
            }
        }
        while (true) {
            if (lecList.get(lecList.size() - 1) == "") {
                lecList.remove(lecList.get(lecList.size() - 1));
            } else break;
        }
        if (lecList.isEmpty()) {
            lecList.add("해당 이름의 강사를 찾을 수 없습니다");
        }
        return lecList;
    }
}
