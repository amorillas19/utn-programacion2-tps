import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in); 
        
        Estudiante e1 = new Estudiante();

        System.out.println("Nombre del estudiante?");
        String nombreComprobar;
        do {
            nombreComprobar = scan.nextLine();
            if (e1.validarTexto(nombreComprobar)) {
                System.out.println("Nombre valido");
            }else{
                System.out.println("Nombre invalido");
            }
        } while (!(e1.validarTexto(nombreComprobar)));
        e1.setNombre(nombreComprobar);

        System.out.println("Apellido del estudiante?");
        String apellidoComprobar;
        do {
            apellidoComprobar = scan.nextLine();
            if (e1.validarTexto(apellidoComprobar)) {
                System.out.println("Apellido valido");
            }else{
                System.out.println("Apellido invalido");
            }
        } while (!(e1.validarTexto(apellidoComprobar)));
        e1.setApellido(apellidoComprobar);

        System.out.println("Curso del estudiante?");
        String cursoComprobar;
        do {
            cursoComprobar = scan.nextLine();
            if (e1.validarTexto(cursoComprobar)) {
                System.out.println("Curso valido");
            }else{
                System.out.println("Curso invalido");
            }
        } while (!(e1.validarTexto(cursoComprobar)));
        e1.setCurso(cursoComprobar);

        System.out.println("Calificacion del estudiante?");
        String calificacionComprobar;
        do {
            calificacionComprobar=scan.nextLine();
            if (e1.validarPuntaje(calificacionComprobar)) {
                System.out.println("Calificacion valida");
            }else{
                System.out.println("Calificacion invalida");
            }
        } while (!(e1.validarPuntaje(calificacionComprobar)));
        e1.setCalificacion(Double.parseDouble(calificacionComprobar));

        e1.mostrarInfo();
        System.out.println("-------------------");
        System.out.println("-------------------");

        System.out.print("Cuantos puntos le sube la nota: ");
        String notaSubir;
        do {
            notaSubir = scan.nextLine();
            if (e1.validarPuntaje(notaSubir)) {
                e1.subirCalificacion(Double.parseDouble(notaSubir));
            }else{
                System.out.println("Dato invalido");
            }
        } while (!(e1.validarPuntaje(notaSubir)));

        e1.mostrarInfo();
        System.out.println("-------------------");
        System.out.println("-------------------");

        System.out.print("Cuantos puntos le baja la nota: ");
        String notaBajar;
        do {
            notaBajar = scan.nextLine();
            if (e1.validarPuntaje(notaBajar)) {
                e1.bajarCalificacion(Double.parseDouble(notaBajar));
            }else{
                System.out.println("Dato invalido");
            }
        } while (!(e1.validarPuntaje(notaBajar)));
        

        e1.mostrarInfo();
    }
}
