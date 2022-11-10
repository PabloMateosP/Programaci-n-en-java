public class bucles17_piramide {
    public static void main(String[] args) {
        int a = 20;
        //a = número de filas 
        //alt = altura 
        for (int alt = 1; alt <= a; alt++){
            //esp = espacio 
            for (int esp = 1; esp <= a-alt; esp++){
                System.out.print(" ");
            }
            //ast = asterisco 
            for (int ast = 1; ast <= (alt*2)-1; ast++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
}

