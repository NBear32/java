package Java20240401;

class AA {
    public <T extends Number> void methods1(T t){
        System.out.println(t.intValue());
    }

    interface MyInterface {
        public abstract void print();
    }
}

class BB {
    public <T extends AA.MyInterface> void method1 (T t){
        // 사용자가 정의한 MyInterface 의 자식만 제네릭 T 위치에 올 수 있음
        // 이렇게 함으로서 사용자 정의 메서드인 print() 를 사용할 수 있게 됨
        t.print();
    }
}

class CC implements AA.MyInterface{ // 인터페이스의 구현체
    @Override
    public void print(){
        System.out.println("print() 구현2");
    }
}
public class GenericMethodExtends {
    public static void main(String[] args) {
        AA a = new AA();
        a.methods1(5.8); // <Double>
        BB b = new BB();

        b.method1(new AA.MyInterface() {
            @Override
            public void print() {
                System.out.println("print() 구현");
            }
        });
        b.method1(new CC()); // MyInterface 의 구현체를 사용한 경우
    }
}
