
import java.util.Scanner;


public class AdivinarNumero {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        int n=(int) (Math.random() * (100 - 1 + 1) + 1);
        int a;
        
        
        System.out.println("Programa para adivinar un numero entre el 1 al 100");
        do{
            System.out.println("\nIngresa un numero: ");
            a=leer.nextInt();
            if(a<n){
                System.out.println("El numero esta mas arriba :c");
            }
            else if(a>n){
                System.out.println("El numero esta mas abajo :c");
            }
            
        }while(a!=n);
        
        System.out.println("\nFelicidades es el numero correcto");
    }
    
}
