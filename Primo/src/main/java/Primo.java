
import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int i, c = 0;

        System.out.println("Ingresa un numero");
        int n = leer.nextInt();

        for (i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                c++;
            }
        }
        if (c <= 2) {
            System.out.println("El numero es Primo");
        } else {
            System.out.println("El numero no es Primo");
        }

    }
}
