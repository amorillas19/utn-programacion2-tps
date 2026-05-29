public class ClienteVIP extends Cliente{
    protected float descuento;

    public ClienteVIP(String nombre, String email, float descuento) {
        super(nombre, email);
        this.descuento = descuento;
    }

    
}
