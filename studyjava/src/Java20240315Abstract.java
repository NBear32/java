abstract class Animal{
    abstract void cry();
}

class Cat extends Animal{
    @Override
    void cry() {
        System.out.println("야옹");
    }
}

class Dog extends Animal{
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

class Bird extends Animal{
    @Override
    void cry() {
        System.out.println("짹짹");
    }
}

public class Java20240315Abstract {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        Animal animal3 = new Bird();

        animal1.cry();
        animal2.cry();
        animal3.cry();
    }
}
