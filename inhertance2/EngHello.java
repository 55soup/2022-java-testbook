package inhertance2;

class Greeting{
    public String name = "홍길동";
    public void sayHello(){
        System.out.println("씨 안녕하세요");
    }
}
public class EngHello extends Greeting{
    public String name = "Mr.Hong";
    public void sayHello(){
        System.out.println(name + " Nice to meet you");
    }
    public void test(){
        System.out.println(super.name); //부모클래스 name을 가져옴.
        super.sayHello();  // 부모클래스 sayHello()메서드를 실행함.
    }

    public static void main(String[] args) {
        EngHello eng = new EngHello();
        eng.sayHello();
        eng.test();
    }
}
