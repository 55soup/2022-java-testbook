package inheritance;
// p.78
class Student{
    String name;
    String hakbun;
    String phone;
    String juso;
    String major;
    public Student(){ }
    public Student(String name, String hakbun){
        this.name = name;
        this.hakbun = hakbun;
    }
    public void study(){
        System.out.println("공부하다.");
    }
    public void eat(){
        System.out.println("식사하다.");
    }
    public void test(){
        System.out.println("시험보다.");
    }
    public void extra_act(){
        System.out.println("동아리 활동하다.");
    }
}
class Leader extends Student{
    boolean leaderTf;

    public Leader(String name, String hakbun, boolean leaderTF){
        this.name = name;
        this.hakbun = hakbun;
        this.leaderTf = leaderTF;
    }

    void isLeader(){
        if(leaderTf == true)
            System.out.println(name + "은 학급회장이다.");
        else
            System.out.println(name + "은 학급회장이 아니다.");
    }
}
public class MainClass {
    public static void main(String[] args) {
        Leader hong = new Leader("홍길동", "30130", true);
        hong.isLeader();
    }
}
