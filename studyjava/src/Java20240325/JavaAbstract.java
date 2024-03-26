package Java20240325;

abstract public class JavaAbstract {
    int a;
    String b;

    // 생성자
    public JavaAbstract() {
        this.a = 10;
        this.b = "default";
    }

    public JavaAbstract(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public int getValue() {
        return a;
    }

    abstract public String getString();

    public void setValue(int a) {
        this.a = a;
    }

    public void setString(String b) {
        this.b = b;
    }
}
