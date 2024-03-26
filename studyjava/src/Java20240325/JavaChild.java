package Java20240325;

public class JavaChild extends JavaAbstract{
    public JavaChild(){
        super();
    }
    public JavaChild(int a, String b){
        super(a, b);
    }

    @Override
    public String getString() {
        return super.b;
    }

    public void setValue(int a){
        super.setValue(a);  //자바는 세터와 게터 사용 추천
        //super.a = a; //비추천. 자바스타일 아님
    }

    public void setString(String b){
        super.setString(b);
    }
}
