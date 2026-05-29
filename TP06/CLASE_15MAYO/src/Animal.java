public class Animal {
    private String nombre;
    private int edad;
    private double peso;
    private String color;
    private Veterinaria veterinaria;


    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = 99.99;
        this.color = "mestizo";
    }

    public Animal(String nombre){
        this.nombre=nombre;
        this.edad = 1;
        this.peso=19;
        this.color="brillante";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Veterinaria getVeterinaria() {
        return veterinaria;
    }

    public void setVeterinaria(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    //ACA IMPLEMENTE UN OPERADOR TERNARIO TIPO IF PERO EN UNA SOLA LINEA
    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + ", veterinaria="
                + (veterinaria==null? null:veterinaria.getNombre()) + "]";
    }

    

    
    
    


}
