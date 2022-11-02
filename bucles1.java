public class bucles1 {
    enum Dia {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }
    public static void main(String[] args) {
    Dia diaDeHoy = Dia.MIERCOLES;
    switch (diaDeHoy) {
        case LUNES:
            System.out.println("Lunes");
            break;
        case MARTES:
            System.out.println("Martes");
            break;
        case MIERCOLES:
            System.out.println("Miércoles");
            break;
        case JUEVES:
            System.out.println("Jueves");
            break;
         case VIERNES:
            System.out.println("Viernes");
            break;
        case SABADO:
            System.out.println("Finde !!");
            break;
        case DOMINGO:
            System.out.println("Finde !!");
            break;
        }
    }
}
