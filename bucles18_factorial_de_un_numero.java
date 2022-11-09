public class bucles18_factorial_de_un_numero {
    public static void main(String[] args) {
        int N = 3;
        int i = 1;
        int resultado = i;
        while (i >= N) {
            int n = 1;
            i = n * i++;
            while (n > 3) {
                n++;
                resultado = i;
            }
        } System.out.println("El factorial del número "+ N + " es " + resultado );
    }  
}