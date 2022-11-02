public class Boxing_y_unboxing {
    public static void main(String[] args) {
        Integer a;
        int b = 7;
        int c;

        // Autoboxing
        a = b;

        // Unboxing
        c = b + a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
