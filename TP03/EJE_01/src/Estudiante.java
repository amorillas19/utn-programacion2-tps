public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private Double calificacion;

    public Estudiante () {

    }

    public Estudiante(String nombre, String apellido, String curso, double calificacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion=calificacion;

    }


    public boolean validarTexto (String entrada) {
        if (entrada == null || entrada.isBlank()) {
            return false;
        }
        return true;
    }

    public boolean validarPuntaje (String entrada) {
        if (entrada == null || entrada.isBlank()) {
            return false;
            }
        
        try {
            
            Double puntajeLimpio = Double.parseDouble(entrada);
            if ((puntajeLimpio < 0) || (puntajeLimpio > 10)) {
            return false;
            }
        } catch (NullPointerException | NumberFormatException e) {
            return false;
        } 
        return true;
    }

    public void mostrarInfo () {

        System.out.println("Estudiante: " + getNombre() + " " + getApellido());
        System.out.println("Curso: " + getCurso());
        System.out.println("Calificacion: " + getCalificacion());

    }

    public void subirCalificacion (double puntosSubir) {
        double auxPuntos = getCalificacion();
        if (auxPuntos + puntosSubir <= 10) {
            setCalificacion(auxPuntos+puntosSubir);
        }else{
            System.out.println("La calificacion no puede ser superior a 10");
        }
    

    }
    
    public void bajarCalificacion (double puntosBajar) {
        double auxPuntos = getCalificacion();
        if (auxPuntos - puntosBajar >= 0) {
            setCalificacion(auxPuntos-puntosBajar);
        }else{
            System.out.println("La calificacion no puede ser inferior a 0");
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public Double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }
}
