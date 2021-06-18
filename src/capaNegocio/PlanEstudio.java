package capaNegocio;

import java.util.Date;


public class PlanEstudio {

    public PlanEstudio() {
        this.ciclo = "";
        this.codigo = "";
        this.periodo = null ;
    }

    public PlanEstudio(String ciclo, String codigo, Date periodo) {
        this.ciclo = ciclo;
        this.codigo = codigo;
        this.periodo = periodo;
    }
    
    
    
    private String ciclo;
    private String codigo;
    private Date periodo;

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
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
