package inhertance2;

class Shape{
    public void draw(){
        System.out.println("도형 그리기");
    }
}

class Circle extends Shape{
    private String type = "원";
    public void draw(){
        System.out.println(type + "그리기");
    }
    public void painting(){
        System.out.println("색 칠하기");
    }
}
public class DrawingExam {
    public static void main(String[] args) {
//        Circle c = new Circle();
//        c.draw();
//        c.painting();

//        Shape s = new Shape();
//        s.draw();
////        s.painting();  //접근 불가능

        Circle c1 = new Circle();
        c1.draw();
        Shape s1 = c1;
        s1.draw();
//        s1.painting();
//        /*상속관계에 있을 때 상위 클래스의 객체 변수는 하위
//        클래스의 재정의된 메소드에는 접근하라 수 있지만 그렇지 않은 메소드에는 접근할 수 없다.*/
    }
}
