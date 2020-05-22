
import java.util.Scanner;


public class Alumnos {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        double a,r,total;
        
        System.out.println("Ingresa la cantidad de alumnos aprobados:");
        a=leer.nextDouble();
        System.out.println("Ingresa la cantidad de alumnos reprobados");
        r=leer.nextDouble();
        total=a+r;
        
        a=a*100/total;
        r=r*100/total;
        
        System.out.println("El porcentaje de alumnos aprobados es de: " + a + "%");
        System.out.println("El porcentaje de alumnos reprobados es de: " + r + "%");
    }
}
