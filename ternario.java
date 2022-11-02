public class ternario {
    public static void main(String[] args) {
        int a=2;
        int b=3;

        if (a>=b) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
        String resultado = (a>=b)?"A":"B";
        System.out.println(resultado);        
    }
}
