public class bucles15_simulación_examen {
    public static void main(String[] args) {
        for (int i= 1; i <= 10; i++) { 
            System.out.printf("----------------\n| Tabla del %d |\n----------------\n", i);
            for (int j = 1; j <= 10; j++ )
            System.out.printf("| %d x %d = %d |\n", i, j, i*j) ;
            System.out.println("----------------\n");
        }
    }
}