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
        descuento=1-(descuento/100);

        System.out.println("Precio Base sin descuento: " + getPrecioBase());
        setPrecioBase(getPrecioBase()*descuento);
        System.out.println("Precio Base con descuento " + getPrecioBase());
    }

    public void aplicarDescuento (double descuento, double precioMinimo){
        descuento=1-(descuento/100);
        System.out.println("Precio Base sin descuento: " + getPrecioBase());

        if ((getPrecioBase()*descuento)<precioMinimo) {
            System.out.println("El descuento no puede exceder el precio minimo");
        }else{
            System.out.println("Descuento aplicado exitosamente");
            System.out.println("Precio Base CON descuento: " + getPrecioBase()*descuento);
            setPrecioBase(getPrecioBase()*descuento);
        }
    }

    public double calcularPrecioFinal () {
        double IVAaux=1+(IVA/100);
        return precioBase*IVAaux;
    }

    public static void cambiarIVA (double nuevo) {
        nuevo=nuevo/100;
        Producto.IVA = nuevo;
    }

    public String toString(){
        return "Producto: " + getNombre() + "\n" +
                "Precio Base: " + getPrecioBase() + "\n" +
                "IVA aplicable: " + (getIVA()*100) + "%\n" +
                "Precio Final: " + this.calcularPrecioFinal();
    }

    


}
