import java.util.ArrayList;
import java.util.Date;

public class Compra {
    private Date fecha = new Date();
    private ArrayList<Insumo> listaInsumos = new ArrayList<>();
    private ArrayList<Proveedor> listaProveedores = new ArrayList<>();

    public Compra() {
    }
    
    public void agregarProveedor (Proveedor proveedor){
        listaProveedores.add(proveedor);
    }

    public void removeProveedor (Proveedor proveedor){
        listaProveedores.remove(proveedor);
    }

    public void agregarInsumo (String nombreInsumo, double precioInsumo){
        Insumo i = new Insumo(nombreInsumo, precioInsumo);
        listaInsumos.add(i);
    }

    public void removeInsumo(Insumo insumo){
        listaInsumos.remove(insumo);
    }

    @Override
    public String toString() {
        return "Compra [fecha=" + fecha + ", listaInsumos=" + listaInsumos + ", listaProveedores=" + listaProveedores
                + "]";
    }

    
}
