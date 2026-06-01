public class Instructor extends Persona{

    private EspecialidadInstructor especialidad;

    public Instructor(int id, String nombre, String email, EspecialidadInstructor especialidad) {
        super(id, nombre, email);
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Instructor [getId()=" + getId() + ", getNombre()=" + getNombre()
                + ", getEmail()=" + getEmail() + "especialidad= " + especialidad + "]";
    }

    
}
