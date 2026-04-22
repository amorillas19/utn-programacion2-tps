public class Computadora {
    private String marca;
    private int numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;


    public Computadora(String marca, int numeroSerie) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre("b650", "asus");

    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public int getNumeroSerie() {
        return numeroSerie;
    }


    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }


    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }


    public Propietario getPropietario() {
        return propietario;
    }


    public void setPropietario(Propietario propietario) {
        this.propietario=propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
        
    }

    

    
}
