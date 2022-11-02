public class bloques {
    static int c = 4;
    // Nuestra lettra c se podrá usar en cualquier parte aunque para ponerlo a la altura del bloque principal debemos ponerle static
    public static void main(String[] args) {
        int a = 2;
        System.out.println(a);
        {
            int b =3;
            System.out.println(b);
            // Si quisieramos ejecutar b fuera de su bloque nos daría un error de compilación 
        }
    System.out.println(c); 
    // Podría ser ejecutado tanto aquí como donde quisiesemos
    }
}
