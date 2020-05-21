
import java.util.Scanner;


public class Puntos {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int dis=0;
        
        System.out.println("Ingresa el valor del primer punto: ");
        int p1=leer.nextInt();
        System.out.println("Ingresa el valor del segundo punto: ");
        int p2=leer.nextInt();
        
        while(p1!=p2){
            if(p1<p2){
                p1+=1;
            }
            else if(p1>p2){
                p2+=1;
            }
            dis+=1;
        }
        
        System.out.println("La distancia entre los puntos es: " + dis);
    }
}
