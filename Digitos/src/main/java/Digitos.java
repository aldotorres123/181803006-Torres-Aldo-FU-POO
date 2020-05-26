
import java.util.Scanner;

public class Digitos {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int d;

        System.out.println("Ingresa un numero no mayor a 10000");
        int n = leer.nextInt();

        if (n < 10000 && n > -1000) {
            for (int i = 0; i <= 3; i++) {
                d = n % 10;
                switch (i) {
                    case 0:
                        System.out.println(d + " Unidades");
                        break;
                    case 1:
                        System.out.println(d + " Decenas");
                        break;
                    case 2:
                        System.out.println(d + " Centenas");
                        break;
                    case 3:
                        System.out.println(d + " Miles");
                        break;
                }
                n = n / 10;
            }
        } else {
            System.out.println("Numero invalido");
        }
    }
}
