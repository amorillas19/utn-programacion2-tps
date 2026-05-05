import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        
        Usuario u1 = new Usuario("Ricardo Ruben", "richi@gmail.com");
        Documento d1 = new Documento("Solicitud de inscripcion", "Para varias materias" , 123, new Date(), u1);

        System.out.println(d1);
    }
}
