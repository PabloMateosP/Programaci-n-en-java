public class bucles15_simulación_examen {
    private static final int M = 10;
    public static void main(String[] args) {
        for (int i= 1; i <= M; i++) {
            System.out.printf("----------------\n| Tabla del %d |\n----------------\n", i);
            for (int j = 1; j <= M; j++ )
            System.out.printf("| %d x %d = %d |\n", i, j, i*j) ; //Se puede poner como sout("|" + i + " x " + j + " = " + i*j + "|")
            System.out.println("----------------\n");
        }
    }
}