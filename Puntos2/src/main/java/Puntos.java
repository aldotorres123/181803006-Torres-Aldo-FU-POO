
import java.util.Scanner;


public class Puntos {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int x1, x2, y1,y2;
        double dis;
        
        System.out.println("Ingresa las coordenadas del primer punto: ");
        x1=leer.nextInt();
        y1=leer.nextInt();
        System.out.println("Ingresa las coordenadas del segunto punto: ");
        x2=leer.nextInt();
        y2=leer.nextInt();
        
        dis=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        
        System.out.println("La distancia es de: " + dis);
        
    }
}
