package ClassWork.Lessons_10_per_19.L16_StringMethods;

public class T2_Concatenation {
}

class employee8 {
    double salary;
    boolean isManager;

    employee8(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }

    public static void main(String[] args) {
        employee8 emp = new employee8(100, false);
        System.out.println("Is he manager? " + emp.isManager + ". His salary: " + emp.salary);
    }
}

class T4 {
    public static void main(String[] args) {
        String s = null;
        s += "ok";
        System.out.println(s);
    }
}