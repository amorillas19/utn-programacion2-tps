import java.util.ArrayList;
import java.util.List;

public class Categoria extends Base{
    private String nombre;
    private String descripcion;
    private List<Producto> listaProductos;

    public Categoria() {
    }

    public Categoria(String nombre, String descripcion) {
        super();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.listaProductos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void agregarProducto(Producto producto){
        if (producto != null) {
            producto.setCategoria(this);
            listaProductos.add(producto);
        }
    }

    public void mostrarProductos () {
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        result = prime * result + ((listaProductos == null) ? 0 : listaProductos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Categoria other = (Categoria) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        if (listaProductos == null) {
            if (other.listaProductos != null)
                return false;
        } else if (!listaProductos.equals(other.listaProductos))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Categoria [nombre=" + nombre + ", descripcion=" + descripcion + ", listaProductos=" + listaProductos
                + "]";
    }

    
    
}
