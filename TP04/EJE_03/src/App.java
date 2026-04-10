public class App {
    public static void main(String[] args) throws Exception {
        Alumno a1 = new Alumno("Juan Carlos");
        Alumno a2= new Alumno("Matias Pepon", 6.99);

        double [] notas = {8.8,7.7,6.6,5.5};
        a1.actualizarPromedio(notas);
        a2.actualizarPromedio(2.9);

        System.out.println(a1);
        System.out.println(a2);

    }
}
