public class bucles17_piramide {
    
    public static void main(String[] args) {
        String a = "*";
        String m = " ";
        for (int i = 1; i <= 5; i++) {
            int j = 1;
            m = m + " ";
            while (j == i )  {
                System.out.println(m + a);
                a = "*" + a + "*";
            }
        }
    } 
}

