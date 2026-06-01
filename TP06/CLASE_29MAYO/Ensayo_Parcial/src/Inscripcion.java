import java.time.LocalDate;

public class Inscripcion implements Registrable{
    private int id;
    private LocalDate fecha;
    private Estudiante estudiante;
    private Curso curso;

    public Inscripcion(int id) {
        this.id = id;
        this.fecha = LocalDate.now();
    }

    public int getId() {
        return id;
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

    public void registrar(){
        System.out.println("Inscripcion= Curso: " + curso + " Fecha: " + fecha);
    }

    @Override
    public String toString() {
        return "Inscripcion [id=" + id + ", fecha=" + fecha + ", estudiante=" + estudiante.getNombre() + ", curso=" + curso.ge + "]";
    }

    
}
