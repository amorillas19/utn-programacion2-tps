import java.util.Date;

public class ClaveSeguridad {
    private int codigo;
    private Date ultimaModificacion;
    
    public ClaveSeguridad(int codigo, Date ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad [codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + "]";
    }

    
}
