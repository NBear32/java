package Java20240401;

class Apple{}
class Pencil{}
class Goods<T>{
    private T t;
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
}
public class Java20240401Goods {
    public static void main(String[] args) {
        // 1. Goods 를 이용해 Apple 객체를 추가하거나 가져오기
        Goods<Apple> goods1 = new Goods<>();
        goods1.set(new Apple());
        Apple apple = goods1.get(); // 다운캐스팅 필요없음

        // 2. Goods 를 이용해 pencil 객체를 추가하거나 가져오기
        Goods<Pencil> goods2 = new Goods<>();
        goods2.set(new Pencil());
        Pencil pencil1 = goods2.get();

        // 3. 잘못된 타입 선언
        Goods<Apple> goods3 = new Goods<>();
        goods3.set(new Apple());
        // Pencil pencil2 = goods3.get();
    }
}
