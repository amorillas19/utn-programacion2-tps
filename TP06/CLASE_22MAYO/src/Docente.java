import java.util.ArrayList;
import java.util.List;

public class Docente extends Persona{
    private int matDocente;
    private List<String> cursos = new ArrayList();

    public Docente(String nombre, int edad, int dNI, String domicilio, int matDocente) {
        super(nombre, edad, dNI, domicilio);
        this.matDocente = matDocente;
    }
    public int getMatDocente() {
        return matDocente;
    }
    public void setMatDocente(int matDocente) {
        this.matDocente = matDocente;
    }
    public List<String> getCursos() {
        return cursos;
    }
    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    } 

    public void add (Strind cursoNombre){
        if (cursoNombre != null this.cursos.add(curso));
    }
}
