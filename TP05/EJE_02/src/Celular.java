public class Celular {
    private int imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular (int imei, String marca, String modelo, Bateria bateria) {
        this.imei=imei;
        this.marca=marca;
        this.modelo=modelo;
        this.bateria=bateria;
    }


    public int getImei() {
        return imei;
    }


    public void setImei(int imei) {
        this.imei = imei;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public Usuario getUsuario() {
        return usuario;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario !=null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }


    public void mostrarBateria(){
        if (this.bateria!=null){
            System.out.println(this.bateria);
        }else{
            System.out.println("El celular no tiene bateria");
        }
    }

    @Override
    public String toString() {
        return "Celular [imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + "]";
    }

    
}
