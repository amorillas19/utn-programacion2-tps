import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno extends Persona{
    private int matAlumno;
    private List<String> cursos = new ArrayList();

    public Alumno(String nombre, int edad, int dNI, String domicilio, int matAlumno) {
        super(nombre, edad, dNI, domicilio);
        this.matAlumno = matAlumno;
    }
    public int getMatAlumno() {
        return matAlumno;
    }
    public void setMatAlumno(int matAlumno) {
        this.matAlumno = matAlumno;
    }
    public List<String> getCursos() {
        return Collections.unmodifiableList(cursos);
    }
    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    }

    public void add (String cursoAdd){
        if (cursoAdd != null) {
            this.cursos.add(cursoAdd);
        }
    }

    @Override
    public void laburar(){
        System.out.println("El alumno esta estudiando");
    }
}
