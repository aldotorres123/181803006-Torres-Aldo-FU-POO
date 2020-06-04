
public class Aviso {
    
    int id;
    String tipoAviso;
    String titulo;
    String texto;
    String resumen;
    String publicador;
    String fechaPublicacion;
    String fechaAlta;
    String fechaBaja;
    String status;
    
    public void cambiarStatus(){
    }

    @Override
    public String toString() {
        return "\nAviso{" + "\nId=" + id + "\nTipo de Aviso=" + tipoAviso + "\nTitulo=" 
                + titulo + "\ntexto=" + texto + "\nresumen=" + resumen + 
                "\nPublicador=" + publicador + "\nfecha de Publicacion=" + 
                fechaPublicacion + "\nFecha de alta=" + fechaAlta + 
                "\nFecha de baja=" + fechaBaja + "\nStatus=" + status + '}';
    }
}
