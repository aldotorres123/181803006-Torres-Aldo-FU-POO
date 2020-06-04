//Clase plantilla para crear objeto
public class Ak {
    //Atributos o datos del objeto de manera general
    
    
    String tipo;
    int cargador;
    int precision;
    double velocidadCarga;
    double precio;
    int daño;
    double velocidadDisparo;
    
    //Metodos son las acciones /Iteraciones del objeto
    
    //Constructor vacio
    public Ak(){
    }
    //Constructor con un parametro
    public Ak(String tipoMandado){
        tipo=tipoMandado;
    }
    
    //Constructor con todos los atributos
    public Ak(String tipo, int cargador, int precision, double velocidadCarga, double precio, int daño, double velocidadDisparo) {
        this.tipo = tipo;
        this.cargador = cargador;
        this.precision = precision;
        this.velocidadCarga = velocidadCarga;
        this.precio = precio;
        this.daño = daño;
        this.velocidadDisparo = velocidadDisparo;
    }
    
    public void disparar(){
        System.out.println("Te estoy disparando con un daño de " + daño);
    
    }
    public void apuntar(){}
    public void cargar(){}
    
    
    
    
    //METODO predefinido por Oracle
    @Override
    public String toString() {
        return "\nAk{" + "\ntipo=" + tipo + "\ncargador=" + cargador + "\nprecision=" + 
                precision + "\nvelocidadCarga=" + velocidadCarga + "\nprecio=" + precio + 
                "\ndaño=" + daño + "\nvelocidadDisparo=" + velocidadDisparo + '}';
    }

    
    
    
    
    
}
