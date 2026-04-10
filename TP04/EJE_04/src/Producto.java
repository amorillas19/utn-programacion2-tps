public class Producto {
    private String nombre;
    private double precioBase;
    private static double IVA = 0.21;

    Producto (String nombre, double precioBase){
        setNombre(nombre);
        setPrecioBase(precioBase);
    }

    Producto (String nombre) {
        this(nombre, 100.00);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacio");
            return;
        }
            this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase <= 0) {
            System.out.println("el precio no puede ser negativo");
            return;
        }
        this.precioBase = precioBase;
    }

    public static double getIVA() {
        return IVA;
    }

    public void aplicarDescuento (double descuento) {
        setPrecioBase(getPrecioBase()*descuento);
    }

    public void aplicarDescuento (double descuento, double precioMinimo)

    


}
