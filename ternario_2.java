public class ternario_2 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int mayor;
        int menor;

        if (a>=b){
            mayor = a;
            menor = b;
        } else {
            mayor = b;
            menor = a;
        }
         mayor = (a >= b) ? a : b;
         menor = (b >= a) ? b : a;
         System.out.println("El mayor es " + mayor + " y el menor es " + menor );
    }
}
