package ClassWork.Lessons_20_per_29.L_25_Polimorphism;

public class test02 {
}

class car {
    static int a = 5;

    public static void main(String[] args) {
        car c = new car(); // not checking link
        System.out.println(c.a);
        c = null;
        System.out.println(c.a);
    }
}