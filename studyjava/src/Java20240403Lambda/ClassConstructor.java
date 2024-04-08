package Java20240403Lambda;

interface CC {
    MyClass method();
}
class MyClass {
    int k;
    MyClass() {
        System.out.println("MyClass 기본 생성자");
    }
    MyClass(int k) {
        System.out.println("매개변수 생성자" + k);
        this.k = k;
    }
}

public class ClassConstructor {
    public static void main(String[] args) {
        // 함수 인터페이스 메서드가 외부클래스를 리턴하는 경우
        // 메서드 내에서 외부클래스의 생성자를 이용하여 객체를 생성해야함
        CC a1 = new CC() { //익명 이너 클래스
            @Override
            public MyClass method() {
                return new MyClass();
            }
        };
        CC a2 =() -> new MyClass(); // 람다식 단축형 1
        CC a3 = MyClass::new; // 람다식 단축형 2
        a3.method();
    }
}
