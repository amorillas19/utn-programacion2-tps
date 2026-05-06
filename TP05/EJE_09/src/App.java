import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        
        Paciente p1 = new Paciente("Juan Carlos", "OSEP");
        Profesional pro1 = new Profesional("Cuchilla Quintero", "Cirujia");
        CitaMedica cm1 = new CitaMedica("1/1/2020", "13:30");
        cm1.setPaciente(p1);
        cm1.setProfesional(pro1);
        System.out.println(cm1);
    }
}
