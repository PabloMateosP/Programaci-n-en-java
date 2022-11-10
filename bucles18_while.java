public class bucles18_while {
    public static void main(String[] args) {
        int N = 3;
        int factorial = 1;
        int i = 1;
        while (i < N){
            i++;
            factorial = factorial * i;
        }
        System.out.println("El factorial del número "+ N + " es " + factorial);
    } 
}
