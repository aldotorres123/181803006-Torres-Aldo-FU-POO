
import java.util.Scanner;


public class Hipotenusa {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        double a, b, c;
        
        System.out.println("Ingresa el cateto a: ");
        a=leer.nextDouble();
        System.out.println("Ingresa el cateto b: ");
        b=leer.nextDouble();
        
        c=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        
        System.out.println("La hipotenusa es: " + c);
    }
}
