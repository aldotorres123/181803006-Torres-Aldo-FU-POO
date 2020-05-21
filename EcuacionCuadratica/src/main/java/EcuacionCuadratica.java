
import java.util.Scanner;


public class EcuacionCuadratica {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int a, b, c;
        double  r1, r2;
        
        System.out.println("Ingresa el valor de a: ");
        a=leer.nextInt();
        System.out.println("Ingresa el valor de b: ");
        b=leer.nextInt();
        System.out.println("Ingres el valor de c: ");
        c=leer.nextInt();
        
        r1=(-b+Math.sqrt(Math.pow(b,2) - 4*a*c))/2*a;
        r2=(-b-Math.sqrt(Math.pow(b,2) - 4*a*c))/2*a;
        
        System.out.println("Raiz 1: " + r1);
        System.out.println("Raiz 2: " + r2);
    }
}
