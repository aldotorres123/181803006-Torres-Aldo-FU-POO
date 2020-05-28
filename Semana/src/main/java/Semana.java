
import java.util.Scanner;

public class Semana {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingresa un numero del 1 al 7: ");
        int n=leer.nextInt();
        
        switch(n){
            case 1:
                System.out.println("El dia correspondiente es Lunes");
                break;
            case 2:
                System.out.println("El dia correspondiente es Martes");
                break;
            case 3:
                System.out.println("El dia correspondiente es Miercoles");
                break;
            case 4:
                System.out.println("El dia correspondiente es Jueves");
                break;
            case 5:
                System.out.println("El dia correspondiente es Viernes");
                break;
            case 6:
                System.out.println("El dia correspondiente es Sabado");
                break;
            case 7:
                System.out.println("El dia correspondiente es Domingo");
                break;
            default:
                System.out.println("Numero invalido");
                break;
        }
    }
}
