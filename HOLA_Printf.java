public class HOLA_Printf {
    public static void main(String[] args) {
        String saludo = "Hola";
        System.out.printf(saludo);
        // Ahora hacemos hola + mi nombre
        String nombre = " Pablo";
        System.out.printf("%s %s",saludo, nombre);
        // Ahora ponemos la edad también
        int x;
        x = 18;
        System.out.printf("%s soy %s y tengo %s años",saludo,nombre,x);
        // 
    }
}
