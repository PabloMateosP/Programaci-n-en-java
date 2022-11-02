public class bucles2 {
    enum Mes {
        ENERO,
        FEBRERO,
        MARZO,
        ABRIL,
        MAYO,
        JUNIO,
        JULIO,
        AGOSTO,
        SEPTIEMBRE,
        OCTUBRE,
        NOVIEMBRE,
        DICIEMBRE
    }
    public static void main(String[] args) {
        //Este ejercicio también lo podríamos hacer de la forma larga que es igaul que el ejercicio hecho para día con el switch. 
        Mes mes = Mes.NOVIEMBRE;
        switch (mes) {
            case ENERO:case MARZO:case MAYO:case JULIO:case AGOSTO:
                System.out.println("Tiene 31 días");
                break;
            case FEBRERO:
                System.out.println("Tiene 28 días");
                break;
            default:
                System.out.println("Tiene 30 días");
                break;
        }
    }
}
