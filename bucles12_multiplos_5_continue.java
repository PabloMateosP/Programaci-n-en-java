public class bucles12_multiplos_5_continue {
    public static void main(String[] args) {
        for (int i = 5; i <= 25; i++){
            if (i % 5 != 0)
                continue;
            System.out.println("numero: " + i);
        }
    }
}