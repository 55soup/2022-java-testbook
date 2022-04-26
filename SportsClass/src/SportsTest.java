public class SportsTest {
    public static void main(String[] args) {
        BaseBall b1 = new BaseBall("BaseBal", 9);
        System.out.println("경기 종목 : " + b1.getName());
        System.out.println("선수 인원 : " + b1.getPlayer());
        b1.rule();
    }
}
