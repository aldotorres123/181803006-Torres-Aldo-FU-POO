
public class Tarjeta {

    int noCuenta;
    int nip;
    String nombre;
    int dia;
    int mes;
    int anio;
    double monto;
    double apartado;

    public Tarjeta() {

    }

    public Tarjeta(int noCuenta, int nip, String nombre, int dia, int mes, int anio, double monto, double apartado) {
        this.noCuenta = noCuenta;
        this.nip = nip;
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.monto = monto;
        this.apartado = apartado;
    }

    public Tarjeta verificarUsuario(int noCuenta, int nip) {

        if (noCuenta == 123123 && nip == 1133) {
            return new Tarjeta(123123,1133,"Eduardo Diaz Flores", 31, 12, 2032, 45987.22, 550);
        } else if (noCuenta == 456789 && nip == 3377) {
            return new Tarjeta(456789,3377,"Kevin Meza Gonzalez", 31, 12, 2032, 360, 5322.23);
        }else{
            return new Tarjeta();
        }
    }
    
    public double calcularTotal(){
        return this.monto + this.apartado;
    }
    
    public void depositar(double depositar) {
        this.monto += depositar;
    }

    public void retirar(double retirar) {
        this.monto -= retirar;
    }
    
    public void eliminarApartado(){
        this.monto += this.apartado;
        this.apartado = 0;
    }
    
    public void crearApartado(double apartar){
        this.apartado+= apartar;
        this.monto -= apartar;
    }

    @Override
    public String toString() {
            return "\nNumero de cuenta: " + noCuenta
                    + "\nNombre: " + nombre
                    + "\nFecha de vencimiento: " + dia + " / " + mes + " / " + anio
                    + "\nnip: " + nip
                    + "\nMonto: " + monto
                    + "\nApartado: " + apartado
                    + "\nTotal: " + this.calcularTotal();
    }
}
