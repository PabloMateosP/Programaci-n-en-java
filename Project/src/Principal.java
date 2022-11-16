import java.sql.SQLOutput;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hi world");

        Persona fulanito = new Persona();
        fulanito.setName("Fulanito");
        System.out.println("Su nombre: " + fulanito.getName());
        // Creamos una isntancia de Persona: Juanito 20 años.
        Persona juanito = new Persona("Juanito", 20, "Humano");
        Persona julian = new Persona("Julian", 17,"Humano");

        //we wrote the created values
        System.out.println("Su nombre " + juanito.getName());
        System.out.println("Su edad: " + juanito.getAge());
        System.out.println("Su especie: " + juanito.getEspecie());


        System.out.println("Su nombre " + julian.getName());
        System.out.println("Su edad: " + julian.getAge());
        System.out.println("Su especie: " + julian.getEspecie());
    }
}
