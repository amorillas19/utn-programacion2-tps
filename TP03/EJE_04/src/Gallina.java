public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    Gallina (){}

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad <= 0){
            System.out.println("No puede ser menor a 0");
            return;
        }
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        if(huevosPuestos < 0) {
            System.out.println("No puede ser menor a 0");
            return;
        }
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevo(int huevosAgregar) {
        int huevosAux = getHuevosPuestos();
        setHuevosPuestos(huevosAux+huevosAgregar);
    }

    public void envejecer() {
        System.out.println("La gallina tenia " + getEdad() + " años");
        setEdad(getEdad()+1);
        System.out.println("La gallina AHORA TIENE " + getEdad() + " años");
    }

    public void mostrarEstado(){
        System.out.println("ID de la gallina: " + getIdGallina());
        System.out.println("Edad de la gallina: " + getEdad());
        System.out.println("Huevos puestos por la gallina: " + getHuevosPuestos());
    }


    

}
