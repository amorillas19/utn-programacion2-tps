import java.time.LocalDateTime;
import java.util.Objects;

public class Producto extends Base {
    private String nombre;
    private Double precio;
    private String descripcion;
    private int stock;
    private String imagen;
    private boolean disponible;
    private Categoria categoria;

    public Producto() {
    }

    public Producto(int id, boolean eliminado, String nombre, Double precio,
            String descripcion, int stock, String imagen, boolean disponible) {
        super(id, eliminado, LocalDateTime.now());
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.stock = stock;
        this.imagen = imagen;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void validarDisponibilidad() {
    }

    public void reducirStock(int cantidadReducir) {
    }

    public void aumentarStock(int cantidadAumentar) {
    }

    public boolean validarVenta(int cantidadVerificar) {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true; // misma referencia, obvio que son iguales
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Producto otro = (Producto) obj; // cast seguro después de verificar clase
        return this.nombre.equals(otro.nombre) && this.precio == otro.precio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }

    @Override
    public String toString() {
        return super.toString() + "Producto [nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion
                + ", stock=" + stock
                + ", imagen=" + imagen + ", disponible=" + disponible + ", categoria=" + categoria.getNombre() + ", "
                + categoria.getDescripcion() + "]";
    }

    

}
