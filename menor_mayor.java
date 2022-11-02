public class menor_mayor {
    public static void main(String[] args) {
        int a=12;
        int b=8;
        if (a>b) { //Se puede anidar poniendo por separador el else if haciendo así una columna más. 
            System.out.println(a + " es mayor que " + b);
        } else if (a<b){
            System.out.println(a + " es menor que " + b);
        } else {
            System.out.println(a + " es igual a " + b);
        }
    }
}

