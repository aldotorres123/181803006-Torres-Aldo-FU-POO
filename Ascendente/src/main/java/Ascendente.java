
import java.util.Scanner;


public class Ascendente {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingresa 2 numero");
        int a=leer.nextInt();
        int b=leer.nextInt();
        
        System.out.println("Numeros ordenados ascendentemente: ");
        if(a<b){
            System.out.println(a + "\n" + b);
        }
        else{
            System.out.println(b + "\n" + a);
        }
    }
}