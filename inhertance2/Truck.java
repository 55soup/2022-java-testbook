package inhertance2;

class Car{
    Car(){    // 인자없는 Car클래스 추가하기
        System.out.println("Car 생성자");
    }
    Car(String name){  //상위 클래스에 인자없는 생성자가 없으면 오류가 발생함.
        System.out.println("Car 생성자");
    }


}
public class Truck extends Car{
    Truck(){
        super("SM3");    // super()메소드를 이용하여 명시적으로 호출하기
        System.out.println("Truck 생성자");
    }
    public static void main(String[] args) {
        Truck mytruck = new Truck();
    }
}
