import java.util.Date;

public class FirmaDigital {
    private int codigoHash;
    private Date fecha;
    private Usuario usuario;
    
    //Recibe un usuario, pero como es agregacion, existe
    //A diferencia de FirmaDigital que existe solo internamente para documento
    public FirmaDigital(int codigoHash, Date fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }


    public int getCodigoHash() {
        return codigoHash;
    }

    public void setCodigoHash(int codigoHash) {
        this.codigoHash = codigoHash;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital [codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario + "]";
    }
    
    
}
