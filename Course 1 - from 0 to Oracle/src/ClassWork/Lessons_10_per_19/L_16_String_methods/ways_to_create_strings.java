package ClassWork.Lessons_10_per_19.L_16_String_methods;

public class ways_to_create_strings {
    public static void main(String[] args) {
        String s1 = new String("hi"); // Always new object

        String s2 = "DER"; // Goes to string pool
        String s3 = "DER"; // Will refer to one object, which is in the pool

        String s4 = new String("DER"); // Will be created in any case, even if it is in the pool
    }

}
