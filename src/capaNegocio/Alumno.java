package capaNegocio;

public class Alumno {

    public Alumno() {
        this.apellido = "";
        this.nombre = "";
        this.codigo = "";
    }

    public Alumno(String apellido, String nombre, String codigo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.codigo = codigo;
    }
   
    private String apellido;
    private String nombre;
    private String codigo;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
}
