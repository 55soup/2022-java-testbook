package Problem2_6;

public class ShipExam extends Ship{
    String name;

    @Override
    public int Passengers() {
        System.out.println("최대 탑승 인원 : 10명");
        return 0;
    }

    @Override
    public int Luggage() {
        System.out.println("최대 적재량 : 10kg");
        return 0;
    }
}
