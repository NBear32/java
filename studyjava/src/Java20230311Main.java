public class Java20230311Main {
    public static void main(String[] args) {
        Students a = new Students();
        //클래스의 생성자가 없는 경우 => 기본새성자가 자동으로 만들어짐
        // 매개변수가 있는 생성자만 있는 경우 => 기본생성자는 만들어지지 않는다
        // 생성자의 오버로딩
        Students tom = new Students("Tom", 18, "Daejeon", "123456");
        Students steve = new Students("Steve", 25, "LA");
    }
}
