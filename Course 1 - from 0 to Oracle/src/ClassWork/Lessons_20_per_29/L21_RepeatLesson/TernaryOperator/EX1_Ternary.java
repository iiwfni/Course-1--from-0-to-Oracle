package ClassWork.Lessons_20_per_29.L21_RepeatLesson.TernaryOperator;

public class EX1_Ternary {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(a < 4 ? 7 : "privet");

        int b = 5;
        int c = 5;
        int d = b < 3 ? b++ : c++;

        System.out.println("B = " + b);
        System.out.println("C = " + c);
    }
}
