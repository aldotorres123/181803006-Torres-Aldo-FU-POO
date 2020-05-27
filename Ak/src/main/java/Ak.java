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
    public void disparar(){
        System.out.println("Te estoy disparando con un daño de " + daño);
    
    };
    public void apuntar(){};
    public void cargar(){};

    @Override
    public String toString() {
        return "Ak{" + "tipo=" + tipo + ", cargador=" + cargador + ", precision=" + precision + ", velocidadCarga=" + velocidadCarga + ", precio=" + precio + ", da\u00f1o=" + daño + ", velocidadDisparo=" + velocidadDisparo + '}';
    }

    
    
    
    
    
}
