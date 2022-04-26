package inhertance2;

class Ship{
    public String Name(){
        return "배 이름";
    }
}

class MyShip extends Ship{
    public String Name(){
        return "해적선";
    }
}

class YourShip extends Ship{
    public String Name(){
        return "타이타닉 호";
    }
}

class ShipName{
    public static void search(Ship s){
        if(s instanceof MyShip){
            MyShip b = (MyShip)s;  //다운캐스팅
            System.out.println("MyShip 이름 : " + b.Name());
        }else if(s instanceof YourShip){
            YourShip b = (YourShip)s;  //다운캐스팅
            System.out.println("YourShip 이름 : " + b.Name());
        }
    }
}
public class ShipMainExam {
    public static void main(String[] args) {
        Ship myship = new MyShip();  // 업캐스팅
        Ship yourship = new YourShip(); //업캐스팅
        ShipName.search(myship);
        ShipName.search(yourship);
    }
}
