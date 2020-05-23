
public class Casting {
    public static void main(String[] args) {
        
        //Casting Explicito
        
        short a=1;
        int b=15;
        a=(short)b;
        
        //Casting Implicito
        float c=3.14f;
        double d=5.5;
        d=c;
        
        //¿Que pasa con los decimales cuando casteo de flotante a double o entero?
        double pi=3.5416;
        int duda=(int)pi;
        
        System.out.println("Imprime el valor de duda: " + duda);
        
        //Casting String
        String valor="15";
        int n=Integer.parseInt(valor);
        
        System.out.println(n);
        
        n=n+duda;
        
        System.out.println(n);
        
        //Ciclo for
        for(int i=0; i<10; i++){
            System.out.print(i + "-");
        }
        
        
        System.out.println();
        
        //Ciclo while
        int j=1;
        while(j<10){
            System.out.print(j + "-");
            j++;
        }
        
        
        System.out.println();
        
        //Ciclo do while
        int g=1;
        do{
            System.out.print(g + "-");
            g++;
        }while(g<10);
        
        
        
    }
}
