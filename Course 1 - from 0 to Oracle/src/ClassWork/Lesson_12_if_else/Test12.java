package ClassWork.Lesson_12_if_else;

public class Test12 {
    public static void main(String[] args) {
        int salary = 700;
        boolean b = true;

        if (salary < 200) {
            System.out.println("Low payment");
        } else if (salary < 400 && b == false || true) {
            System.out.println("Normal payment");
        } else if (salary < 600) {
            System.out.println("Big payment");
        } else if (b == true){
            System.out.println("Very good payment");
        }
    }
}
