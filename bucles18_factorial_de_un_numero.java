public class bucles18_factorial_de_un_numero {
    public static void main(String[] args) {
        int N = 8;
        int factorial = 1;
        for (int i = 1; i <= N; i++){
           factorial = factorial * i;
        }
        System.out.println("El factorial del número "+ N + " es " + factorial  );
    }  
}