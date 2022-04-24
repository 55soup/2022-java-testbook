package Override;

class Parent {
    static void getTest() {
        System.out.println("parent");
    }
}
class Child extends Parent {
//    @Override
    // Overidingxx  => hiding
     static void getTest() {
        System.out.println("child");
    }
}
public class staticOverride {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child();
        p1.getTest();
        c1.getTest();

        Parent p2 = (Parent)c1;
        p2.getTest();
        // static메서드로 선언했을 경우 parent 업캐스팅을 한다음, 같은 이름의 메서드를 호출했을 때 Parent 클래스에 잇는 getTest 메서드가 호출된다.
        // 반면에 오버라이딩한 메서드는 parent로 업캐스팅을 하여도 Child클래스에 있는 getTest 메서드가 호출된다.
    }
}
