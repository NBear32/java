package Java20240401;

class E {}
class F extends E{}
class G extends F{}
class H extends G{}

class Goods2<T> { // 제네릭 클래스 goods2
    private T t;
    public T get() {return t;}
    private void set(T t) {this.t = t;}
}
public class GenericExtends2 {
    public static void main(String[] args) {

    }
}
