import java.util.ArrayList;

public class Students {
    private String name;
    private int age;
    private String address;
    private String personalNum;

    public Students() { //기본생성자
    }

    public Students(String name, int age, String address, String personalNum) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.personalNum = personalNum;
    }

    public Students(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {  //getter : 읽는 역할
        return name;
    }

    public void setName(String name) {  //setter : 쓰는 역할    public void setName(파라미터)  파라미터 == 매개변수
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPersonalNum() {
        return personalNum;
    }

    public void displayName(){ //메소드
        System.out.println(this.name);
    }
    public void displayAge(){
        System.out.println(this.age);
    }
    public void displayAddress(){
        System.out.println(this.address);
    }
    public void displayAll(){
        System.out.print("NAME: " + this.name);
        System.out.print(" AGE: " + this.age);
        System.out.println(" ADDRESS: " + this.address);
    }
}
