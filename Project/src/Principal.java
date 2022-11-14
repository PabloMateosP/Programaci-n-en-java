public class Principal {
    public static void main(String[] args) {
        System.out.println("Hi world");
        // Creamos una isntancia de Persona: Juanito 20 años.
        Persona juanito = new Persona("Juanito", 20);
        Persona julian = new Persona("Julian", 17);
        System.out.println("Su nombre " + juanito.name);
        System.out.println("Su edad: " + juanito.age);
        System.out.println("Su especie: " + juanito.especie);
        System.out.println("Su nombre " + julian.name);
        System.out.println("Su edad: " + julian.age);
        System.out.println("Su especie: " + julian.especie);

    }
}
