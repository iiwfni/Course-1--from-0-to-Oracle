package ClassWork.Lessons_10_per_19.L17_StringBuilder;

public class Create {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day");
        StringBuilder sb3 = new StringBuilder(50); // capacity - �����������
        StringBuilder sb4 = new StringBuilder(sb3);
    }
}
