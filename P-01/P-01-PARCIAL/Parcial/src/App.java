public class App {
    
    //Se hace el test y si pasa, lo imprime por pantalla al curso
    public static void testConstructorA (String nombre, int duracionHoras, double precio){
        try {
            Curso c = new Curso(nombre, duracionHoras, precio);
            System.out.println("Curso creado correctamente");
            System.out.println(c.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    //Con cuidado de que no atrape excepciones, sino directamente la illegal argument
    public static void testConstructorB(String nombre, int duracionHoras){
        try {
            Curso c = new Curso(nombre, duracionHoras);
            System.out.println("Curso creado correctamente");
            System.out.println(c.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) throws Exception {

        //ANALISIS DE CURSOS CREADOS EN EL EXAMEN
        CursoParcial c1 = new CursoParcial("Fisica", 99);
        CursoParcial c2 = new CursoParcial("Quimica", 12, 250);
        CursoParcial c3 = new CursoParcial("Matematica", -20);
        CursoParcial c4 = new CursoParcial("Lengua", 10, -100);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println("*********");
        System.out.println("*********");
        CursoParcial.mostrarTotalCursos();

        //ANALISIS DE CURSOS CREADOS POST-EXAMEN
        /*testConstructorA("Ciencias sociales", 89, 250);
        testConstructorA("Quimica", 12, 250);
        testConstructorB("Matematica", -20);
        testConstructorB("Lengua", -100);
        testConstructorB("Ecologia", 5);
        System.out.println("*********");
        Curso.mostrarTotalCursos();*/

    }
}
