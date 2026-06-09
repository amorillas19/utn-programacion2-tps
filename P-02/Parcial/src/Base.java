import java.time.LocalDateTime;

public abstract class Base {
    private int id;
    private boolean eliminado = false;
    private LocalDateTime createdAt = LocalDateTime.now();

    

    public Base() {
        this.id = this.id + 1;
    }

    

    public int getId() {
        return id;
    }

    private int generarId(){
        return 0; 
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }



    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    

    @Override
    public String toString() {
        return "Base A OCULTAR [id=" + id + ", eliminado=" + eliminado + ", createdAt=" + createdAt + "]";
    }

    
}
