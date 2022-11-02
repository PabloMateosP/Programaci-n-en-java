public class Dias_de_la_semana_switch {
    public static void main(String[] args) {
        Integer dia=1;
        // Podríamos hacerlo de esta forma también: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
        switch (dia) {
            case 1: System.out.println("Hoy es Lunes");
                break;//En el caso de que no pusiésemos el break no pararía de hacer ej: si ponemos hasta día cinco sin break y después, ponemos uno, si damos el valo runo nuestra máquina leerá hasta el valor 5 sin parar aunque el valor dado sea el uno
            case 2: System.out.println("Hoy es Martes");
                break;
            case 3: System.out.println("Hoy es Miércoles");
                break;
            case 4: System.out.println("Hoy es Jueves");
                break;
            case 5: System.out.println("Hoy es Viernes");
                break;
            case 6: System.out.println("Hoy es Finde !!!");
                break;
            case 7: System.out.println("Hoy es Finde !!!");
                break;
        }
    }
}
