package ClassWork.Lessons_10_per_19.L10_import;
import ClassWork.Lessons_1_per_9.L9_ScopeVariables.Student4;

public class B {

    public static void main(String[] args) {
        Student4 st = new Student4();
        System.out.println(st.b);
        System.out.println(st.d);
        System.out.println(Student4.A);
    }
}

class C {
    Student4 bd = new Student4();
}