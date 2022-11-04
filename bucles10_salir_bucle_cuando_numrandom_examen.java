public class bucles10_salir_bucle_cuando_numrandom_examen {
    public static void main(String[] args) {
        final int numSalir = 3;
        int max = 20;
        int enteroRandom = (int)(Math.random()*max);
        while (enteroRandom!=numSalir) {
            enteroRandom = (int)(Math.random()*max);
            System.out.println("i: " + enteroRandom);
            if (enteroRandom == numSalir){
                System.out.println("El número aleatorio debe ser 3 para que nuestro bucle pare");
            }
        }//Nuestro system.out.println se podría poner aquí para quitar el if y que así fuera más fácil 
    }
}
