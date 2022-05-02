public class EqualExam {
    public static void main(String[] args) {
        String str1 = "sunrin";
        String str2 = "sunrin";
        String str3 = new String("highschool");
        String str4 = new String("highschool");

        if(str1 == str2) System.out.println("주소 같다."); // 주소 비교.
        else System.out.println("주소 다르다");
        if(str3 == str4) System.out.println("주소 같다.");
        else System.out.println("주소 다르다.");

    }
}
