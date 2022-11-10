public class bucles_20_hechoporFran {
    /**
 * Dado un número n, escribir la suma de todos los mútiplos de 3 y 5 hasta n
 */
    private static final int N = 10;
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los " + N + " primeros múltiplos de 3 y 5 es: " + suma);
    }
}