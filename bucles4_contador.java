public class bucles4_contador {
    /*Usaremos el while como primer bucle, 
    while(condición){
        -------
    }
    */ 
    public static void main(String[] args) {
        /*while (true) { 
            System.out.println("Me ejecuto siempre");
            Este while siempre se ejecutaría sin parar en un bucle infnito, para pararlo se usaria ctrl + c
        } */
        int i = 1;
        while (i <= 5) {
            System.out.println("i: " + i);
            i++;
        // Esto sería para hacer un contador del uno al cinco, si no pusiesemos nuestra i++ sería un bucle continuo imprimiendo i = 1
        }
    }
}
