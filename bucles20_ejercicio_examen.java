public class bucles20_ejercicio_examen {
    //Dado un número n, escribir la suma de todos los múltiplos de 3 y de 5 hasta n 
    public static void main(String[] args) {
        int valor3 = 0; 
        int valor5 = 0; 
        int valor = 0;
        int n = 40;
        for (int i = 3; i <= n; i=i+3){
            System.out.println(i);
            valor3 = valor3 + i;
        } 
        for (int j = 5; j <= n; j=j+5){
            System.out.println(j);
            valor5 = valor5 + j;
        }
        valor = valor3 + valor5;
        System.out.println("El valor de la múltiplicación de los múltiplos de 3 y 5 hasta 40 es = "+ valor);
    }
}
