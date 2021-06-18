package capaNegocio;


public class Facultad {

    public Facultad() {
        this.codigo = "";
        this.nombre = "";
        this.decano = "";
    }

    public Facultad(String codigo, String nombre, String decano) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.decano = decano;
    }
   
    
    
    private String codigo;
    private String nombre;
    private String decano;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDecano() {
        return decano;
    }

    public void setDecano(String decano) {
        this.decano = decano;
    }
    
    
}
