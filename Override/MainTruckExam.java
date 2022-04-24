package Override;

class Car{
    String carname;
    String color="검정색";
    int velocity;
    void sppedUp(){
        velocity += 5;
        System.out.println("속도 " + velocity + " 증가");
    }
    void sppedDown(){
        velocity -= 5;
        System.out.println("속도 " + velocity + " 감소");
    }
}

class Truck extends  Car{
    int ton = 5;
    void sppedUp(){ //오버라이딩 재정의.
        velocity += 10;
        System.out.println("속도 " + velocity + " 증가");
    }
}
public class MainTruckExam {
    public static void main(String[] args) {
        Truck mytruck = new Truck();
        mytruck.sppedUp();
        mytruck.sppedDown();
    }
}
