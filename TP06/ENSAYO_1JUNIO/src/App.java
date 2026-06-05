public class App {
    public static void main(String[] args) throws Exception {

        Academia a1 = new Academia(01, "UTN", "Rodriguez 303");
        Instructor i1 = new Instructor(1, "Juan Carlos", "juancarlos@gmail", EspecialidadInstructor.PROGRAMACION);
        Instructor i2 = new Instructor(1, "Roberto Ramirez", "rramirez@gmail", EspecialidadInstructor.DATOS); 
        Curso c1 = new Curso(1, "Matematicas", 10, NivelCurso.BASICO);
        c1.agregarModulos(69, "Suma y resta", "Basura");
        Curso c2 = new Curso(2, "Lengua", 69, NivelCurso.INTERMEDIO);
        c2.agregarModulos(49, "Oraciones", "Puntuacion");
        Curso c3 = new Curso(3, "Cs Naturales", 40, NivelCurso.AVANZADO);
        c3.agregarModulos(1, "Factores bioticos", "plantas");
        System.out.println(c1);
        Estudiante e1 = new Estudiante(420, "Gonzalo Higuain", "pipitaalemania@gmail");
        Inscripcion ins1 = new Inscripcion(99);
        ins1.setEstudiante(e1);
        Inscripcion ins2 = new Inscripcion(100);
        ins2.setEstudiante(e1);

        System.out.println(a1);
        /*TERMINE CURSO Y MODULO, DEBERIA SEGUIR CONECTANDO COSAS */
    }
}
