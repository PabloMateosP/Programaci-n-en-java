public class bucles13_while_incrementando {
    public static void main(String[] args) {
        int max = 10;
        int i = 2; //Si pusiesemos que empieza en el cero el sout se podría poner posterior a la suma de i = i + 2
        while (i <= max) {
            System.out.println(i);
            i = i + 2;
        }

    }
}