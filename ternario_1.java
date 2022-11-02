public class ternario_1 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int mayor;

        if (a>=b){
            mayor = a;
        } else {
            mayor = b;
        }
         mayor = (a >= b) ? a : b;
         System.out.println(mayor);
    }
}
