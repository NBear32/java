package Java20240325;

public class Main {
    public static void main(String[] args) {
        //JavaAbstract.JavaChild javaAbstract = new JavaAbstract();
        JavaChild javaChild = new JavaChild();
        System.out.println(javaChild.getValue());
        System.out.println(javaChild.getString());


        JavaChild javaChild1 = new JavaChild(20, "apple");
        System.out.println(javaChild1.getValue());
        System.out.println(javaChild1.getString());

        JavaChild javaChild2 = new JavaChild();
        javaChild2.setValue(999);
        javaChild2.setString("Banana");
        System.out.println(javaChild2.getValue());
        System.out.println(javaChild2.getString());
    }
}
