import java.util.ArrayList;
import java.util.List;

public class Instructor extends Persona{

    private EspecialidadInstructor especialidad;
    private List<Curso> cursos;
    

    public Instructor (){

    }

    public Instructor(int id, String nombre, String email, EspecialidadInstructor especialidad) {
        super(id, nombre, email);
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public void agregarCursos (Curso curso) {
        if (curso != null) {
            cursos.add(curso);
        }
    }

    public void listarCursos(){
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }

    public EspecialidadInstructor getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(EspecialidadInstructor especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Instructor [especialidad=" + especialidad + ", cursos=" + cursos + "]";
    }

    

    
}
