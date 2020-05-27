
public class BancoMain {
    public static void main(String[] args) {
        
        Tarjeta morada=new Tarjeta();
        morada.tipo="Morada";
        morada.puntosCompra=9;
        System.out.println(morada.toString());
        
        Tarjeta estudiante=new Tarjeta();
        estudiante.tipo="Estudiante";
        estudiante.puntosCompra=3;
        System.out.println(estudiante.toString());
        
        Tarjeta buhoEspecial=new Tarjeta();
        buhoEspecial.tipo="Buho Especial";
        buhoEspecial.puntosCompra=12;
        System.out.println(buhoEspecial.toString());
        
        Tarjeta docente=new Tarjeta();
        docente.tipo="Docente";
        docente.puntosCompra=2;
        System.out.println(docente.toString());
        
        Tarjeta buhoBlanco=new Tarjeta();
        buhoBlanco.tipo="Buho Blanco";
        buhoBlanco.puntosCompra=15;
        System.out.println(buhoBlanco.toString());
        
    }
}
