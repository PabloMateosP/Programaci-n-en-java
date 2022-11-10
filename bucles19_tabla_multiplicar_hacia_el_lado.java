public class bucles19_tabla_multiplicar_hacia_el_lado {
    public static void main(String[] args) {
        int M = 10;
        for (int i = 1; i <= M; i++) {
            System.out.print("Tabla del " + i + "\t");
        }
        System.out.print("\n");
        for (int i = 1; i <= M; i++){
            for (int j = 1; j <= M; j++) {
            System.out.print(j + " x " + i + " = " + i * j + "\t");
            }
        }
        System.out.print("\n");
    }
}
