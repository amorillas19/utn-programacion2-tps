import java.util.ArrayList;
import java.util.List;

public class Academia {
    private int id;
    private String nombre;
    private String direccion;
    private List<Curso> cursos = new ArrayList<>();
    private List<Instructor> instructores = new ArrayList<>();


    public Academia(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void agregarCurso (Curso curso){
        cursos.add(curso);
    }

    public void buscarCursoNombre (String nombre){
        for (Curso curso : cursos) {
            if curso.get
        }
    }

    
}
