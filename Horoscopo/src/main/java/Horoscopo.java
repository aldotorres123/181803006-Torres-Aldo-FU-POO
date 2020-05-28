
import java.util.Scanner;

public class Horoscopo {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int dia, mes;
        
        System.out.println("Ingresa tu dia de nacimiento: ");
        dia=leer.nextInt();
        System.out.println("Ingresa tu mes de nacimiento(en numero plox):");
        mes=leer.nextInt();
        
        switch(mes){
            case 1:
                if(dia<=20){
                    System.out.println("Tu signo zadiacal es Capricornio");
                }
                else if(dia<=31){
                    System.out.println("Tu signo zodiacal es Acuario");
                }
                break;
            case 2:
                if(dia<=19){
                    System.out.println("Tu signo zadiacal es Acuario");
                }
                else{
                    System.out.println("Tu signo zodiacal es Piscis");
                }
                break;
            case 3:
                if(dia<=20){
                    System.out.println("Tu signo zadiacal es Piscis");
                }
                else{
                    System.out.println("Tu signo zodiacal es Aries");
                }
                break;
            case 4:
                if(dia<=20){
                    System.out.println("Tu signo zadiacal es Aries");
                }
                else{
                    System.out.println("Tu signo zodiacal es Tauro");
                }
                break;
            case 5:
                if(dia<=21){
                    System.out.println("Tu signo zadiacal es Tauro");
                }
                else{
                    System.out.println("Tu signo zodiacal es Geminis");
                }
                break;
            case 6:
                if(dia<=21){
                    System.out.println("Tu signo zadiacal es Geminis");
                }
                else{
                    System.out.println("Tu signo zodiacal es Cancer");
                }
                break;
            case 7:
                if(dia<=23){
                    System.out.println("Tu signo zadiacal es Cancer");
                }
                else{
                    System.out.println("Tu signo zodiacal es Leo");
                }
                break;
            case 8:
                if(dia<=23){
                    System.out.println("Tu signo zadiacal es Leo");
                }
                else{
                    System.out.println("Tu signo zodiacal es Virgo");
                }
                break;
            case 9:
                if(dia<=23){
                    System.out.println("Tu signo zadiacal es Virgo");
                }
                else{
                    System.out.println("Tu signo zodiacal es Libra");
                }
                break;
            case 10:
                if(dia<=23){
                    System.out.println("Tu signo zadiacal es Libra");
                }
                else{
                    System.out.println("Tu signo zodiacal es Escorpio");
                }
                break;
            case 11:
                if(dia<=22){
                    System.out.println("Tu signo zadiacal es Escorpio");
                }
                else{
                    System.out.println("Tu signo zodiacal es Sagitario");
                }
                break;
            case 12:
                if(dia<=21){
                    System.out.println("Tu signo zadiacal es Sagitario");
                }
                else{
                    System.out.println("Tu signo zodiacal es Capricornio");
                }
                break;
        }
    }
}
