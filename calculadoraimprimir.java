public class calculadoraimprimir {
    final static int MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Integer a,b,c;
        a = 2;
        b = 3;
        c = 4;
        System.out.println((a + b)*c);
        Double potencia= Math.pow(2, 3);
        System.out.println(potencia);
        System.out.println(MAX);
        Double resultado = Math.max((double)a, MAX);
        System.out.println(resultado);
    }
}