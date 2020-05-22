
import java.util.Scanner;


public class Boletos {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int bo, tri, total;
        
        System.out.println("Ingrese la cantidad de boletos a comprar: ");
        bo=leer.nextInt();
        
        System.out.println("Seleccione la tribuna(Solo ingrese el numero):");
        System.out.println("1-Tribuna D - $430");
        System.out.println("2-Tribuna C - $740");
        System.out.println("3-Tribuna B - $1200");
        System.out.println("4-Tribuna A - $2760");
        tri=leer.nextInt();
        
        if(tri==1){
            total=bo*430;
        }
        else if(tri==2){
            total=bo*740;
        }
        else if(tri==3){
            total=bo*1200;
        }
        else{
            total=bo*2760;
        }
        System.out.println("El total a pagar es de: $" + total);
    }
    
}
