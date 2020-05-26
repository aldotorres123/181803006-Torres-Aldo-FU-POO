
import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        double area, per;
        
        System.out.println("Ingresa el valor de un lado del cuadrado: ");
        double lado=leer.nextDouble();
        
        area=lado*lado;
        per=lado*4;
        
        System.out.println("El area del cuadrado es: " + area);
        System.out.println("Su perimetro es de: " + per);
    }
}
