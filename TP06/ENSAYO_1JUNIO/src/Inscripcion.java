import java.time.LocalDate;

public class Inscripcion {
    private int id;
    private LocalDate fecha;
    private Estudiante estudiante;
    private Curso curso;

    public Inscripcion (){
    }

    public Inscripcion (int id){
        this.id = id;
        this.fecha = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        if (estudiante != null || curso != null) {
            return "Inscripcion sin datos validos";
        }else{
            return "Inscripcion [id=" + id + ", fecha=" + fecha + ", estudiante=" + estudiante.getNombre() + ", curso=" + curso + "]";
        }
        
    }

    

    
}
