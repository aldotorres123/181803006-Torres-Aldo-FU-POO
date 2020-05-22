
import java.util.Scanner;


public class IMC {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        double pe, alt, imc;
        
        System.out.println("Ingresa tu peso: ");
        pe=leer.nextDouble();
        System.out.println("Ingresa tu altura: ");
        alt=leer.nextDouble();
        
        imc=pe/(Math.pow(alt, 2));
        
        System.out.println("Tu IMC es de: " + imc);
    }
}
