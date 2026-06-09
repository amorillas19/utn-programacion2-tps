import java.time.LocalDateTime;

public class Producto extends Base{
    private String nombre;
    private double precio;
    private String descripcion;
    private int stock;
    private String imagen;
    private boolean disponible;
    private Categoria categoria;

    

    public Producto() {
    }

    public Producto(String nombre, double precio, String descripcion,
            int stock, String imagen) {
        super();
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.stock = stock;
        this.imagen = imagen;
        if (this.stock > 0) {
            this.disponible = true;
        }else{
            this.disponible = false;
        };
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
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
        if (this.disponible) {
            System.out.println("Esta disponible");
        }else{
            System.out.println("No esta disponible");
        }
    }

    private void reducirStock(Integer cantidad) throws Exception {
        if (this.getStock() - cantidad >= 0) {
            this.setStock(getStock() - cantidad);
            if (getStock() == 0) {
                setDisponible(false);
            }
        } else {
            throw new Exception("Cantidad invalida");
        }
    }

    private void aumentarStock(Integer cantidad) throws Exception {
        if (this.getStock() + cantidad >= 0) {
            this.setStock(getStock() + cantidad);
        } else {
            throw new Exception("Cantidad invalida");
        }
    }

    public boolean validarVenta (Integer cantidad) throws Exception {
        if ((this.stock-cantidad) >= 0) {
            System.out.println("VENTA VALIDA");
            reducirStock(cantidad);
            return true;
        }else{  
            throw new Exception("La cantidad no es valida");
        }
    }

    



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        long temp;
        temp = Double.doubleToLongBits(precio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
        result = prime * result + stock;
        result = prime * result + ((imagen == null) ? 0 : imagen.hashCode());
        result = prime * result + (disponible ? 1231 : 1237);
        result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
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
        Producto other = (Producto) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
            return false;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        if (stock != other.stock)
            return false;
        if (imagen == null) {
            if (other.imagen != null)
                return false;
        } else if (!imagen.equals(other.imagen))
            return false;
        if (disponible != other.disponible)
            return false;
        if (categoria == null) {
            if (other.categoria != null)
                return false;
        } else if (!categoria.equals(other.categoria))
            return false;
        return true;
    }

    @Override
    public String toString() {
        if (categoria != null) {
            return "Producto [nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + ", stock=" + stock
                + ", imagen=" + imagen + ", disponible=" + disponible + ", categoria=" + categoria.getNombre() + "]";
        }else{
            return "Producto [nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + ", stock=" + stock
                + ", imagen=" + imagen + ", disponible=" + disponible + ", categoria= NULL"  + "]";
        }
        
    }

    

    
}
