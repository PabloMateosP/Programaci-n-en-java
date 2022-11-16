import javax.print.DocFlavor;

class Persona {
    private String name;
    private Integer age;
    private static String especie = "Humano";

    public static String getEspecie() {
        return especie;
    }

    public static void setEspecie(String especie) {
        Persona.especie = especie;
    }

    Persona (){

    }

    Persona (String name, Integer age, String especie) {
        this.name = name;
        this.age = age;
        this.especie = especie;
    }
    //getter de name and later setter
    String getName () {
        return name;
    }
    void setName (String name) {
        this.name = name;
    }
    //getter de age and later setter
    Integer getAge () {
        return age;
    }
    void setAge (Integer age) {
        this.age = age;
    }
}
