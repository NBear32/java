package Java20240425Exam;

import java.util.Arrays;

public class Students {
    private String Name;
    private String Department;
    private int StudentId;

    public Students() {
    }

    public Students(String setName, String setDepartment, int setStudentId) {
        this.Name = setName;
        this.Department = setDepartment;
        this.StudentId = setStudentId;
    }

    public String getName() {
        return Name;
    }

    public String getDepartment() {
        return Department;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setName(String setName) {
        this.Name = setName;
    }

    public void setDepartment(String setDepartment) {
        this.Department = setDepartment;
    }

    public void setStudentId(int setStudentId) {
        this.StudentId = setStudentId;
    }

    public String toString(){
        return (this.Name + ", " + this.Department + ", " + String.valueOf(this.StudentId));
    }
}
