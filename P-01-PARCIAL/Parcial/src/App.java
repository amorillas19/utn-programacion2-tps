public class App {
    public static void main(String[] args) throws Exception {
        
        Curso c1 = new Curso("Fisica", 99);
        Curso c2 = new Curso("Quimica", 12, 250);
        Curso c3 = new Curso("Matematica", -20);
        Curso c4 = new Curso("Lengua", 10, -100);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println("*********");
        System.out.println("*********");
        Curso.mostrarTotalCursos();
    }
}
