import java.time.LocalDateTime;

public abstract class Base {
    private int id;
    private boolean eliminado;
    private LocalDateTime createdAt;

    public Base() {
    }

    public Base(int id, boolean eliminado, LocalDateTime createdAt) {
        this.id = id;
        this.eliminado = eliminado;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Base [id=" + id + ", eliminado=" + eliminado + ", createdAt=" + createdAt + "] \n";
    }

    

}
