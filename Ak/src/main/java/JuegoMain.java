    
public class JuegoMain {
    public static void main(String[] args) {
        
        Ak bronce=new Ak();
        bronce.tipo="Bronce";
        bronce.cargador=5;
        bronce.precision=65;
        bronce.velocidadCarga=5;
        bronce.precio=1000;
        bronce.daño=10;
        bronce.velocidadDisparo=10;
        
        Ak plata=new Ak();
        plata.tipo="Plata";
        plata.cargador=8;
        plata.precision=70;
        plata.velocidadCarga=4.5;
        plata.precio=2300;
        plata.daño=11;
        plata.velocidadDisparo=9.8;
        
        Ak oro=new Ak();
        oro.tipo="Oro";
        oro.cargador=10;
        oro.precision=85;
        oro.velocidadCarga=4.3;
        oro.precio=2500;
        oro.daño=13;
        oro.velocidadDisparo=9.7;
        
        Ak diamante=new Ak();
        diamante.tipo="Diamante";
        diamante.cargador=20;
        diamante.precision=95;
        diamante.velocidadCarga=3;
        diamante.precio=4000;
        diamante.daño=20;
        diamante.velocidadDisparo=9.4;
        
        Ak adamantium=new Ak();
        adamantium.tipo="Adamantium";
        adamantium.cargador=30;
        adamantium.precision=100;
        adamantium.velocidadCarga=1;
        adamantium.precio=10000;
        adamantium.daño=27;
        adamantium.velocidadDisparo=8;
        
        System.out.println(bronce.toString());
        System.out.println(plata.toString());
        System.out.println(oro.toString());
        System.out.println(diamante.toString());
        System.out.println(adamantium.toString());
    }
}
