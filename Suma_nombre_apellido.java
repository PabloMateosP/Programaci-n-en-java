public class Suma_nombre_apellido {
    public static void main (String[] args) {
        // Variables
        String nombre, apellido;
        nombre = "Pablo";
        apellido = " Mateos";
        int edad = 18;
        long horas =  213848237582L;
        float nota = 13F;
        double resultado = 8.1232323131d;
        
        boolean parImpar = true;

        char sexo = 'H';

        if (edad == 19) {
            System.out.println("Tengo 19 años");
        } else if (edad == 20){
            System.out.println("Tengo 20 años");
        } else {
            System.out.println("Tengo otra edad");
        } 
        // Esto imprime la suma de dos nombres 
        System.out.println("Hola, soy " + nombre + apellido + " y tengo una edad de " + edad + " años y horas " + horas + " mi nota en clase es de un " + nota + " mi resultado académico es " + resultado + " soy " + sexo + " y es " + parImpar);
    }
}
