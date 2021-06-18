package capaNegocio;

import java.util.Date;


public class Asignatura {

    public Asignatura() {
        this.ciclo = 0;
        this.codigo = "";
        this.periodo = null;
    }

    public Asignatura(int ciclo, String codigo, Date periodo) {
        this.ciclo = ciclo;
        this.codigo = codigo;
        this.periodo = periodo;
    }
    
    
    private int ciclo;
    private String codigo;
    private Date periodo;

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Date periodo) {
        this.periodo = periodo;
    }
    
    
    
    
}
