public class Pasaporte {
    private int numero;
    private int fechaEmision;
    private Titular titular;
    private Foto foto;

    public Pasaporte (){}

    public Pasaporte(int numero, int fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(int fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular (Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public Foto getFoto() {
        return foto;
    }
    
}
