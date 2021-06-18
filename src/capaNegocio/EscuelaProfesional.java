package capaNegocio;


public class EscuelaProfesional {

    public EscuelaProfesional() {
        this.codigo = "";
        this.nombre = "";
        this.director = "";
    }

    public EscuelaProfesional(String codigo, String nombre, String director) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.director = director;
    }
   
    
    
    private String codigo;
    private String nombre;
    private String director;

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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    
    
}
