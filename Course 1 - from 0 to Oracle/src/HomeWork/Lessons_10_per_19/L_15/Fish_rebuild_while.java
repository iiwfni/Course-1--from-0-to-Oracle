package HomeWork.Lessons_10_per_19.L_15;

public class Fish_rebuild_while {
    static void showTime() {
        int hour = 0;
        OUTER:
        while (hour < 6) {
            System.out.println("������ �����");

            int minutes = -1;
            MIDDLE:
            do {
                minutes++;

                if (hour > 1 && minutes % 10 == 0) {
                    System.out.println("����� ������");
                    break OUTER;
                }

                int seconds = 0;
                INNER:
                while (seconds < 60) {

                    if (seconds * hour > minutes) {
                        System.out.println("��������� ������");
                        continue MIDDLE;
                    }

                    System.out.println(hour + ":" + minutes + ":" + seconds);
                    seconds++;
                }

            } while (minutes < 59);

            hour++;
        }
    }

    public static void main(String[] args) {
        showTime();
    }
}