import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        ClienteMesa c1 = new ClienteMesa("Juan", 4297555);
        Mesa m1 = new Mesa(5, 4);
        Date hoy = new Date(2026,4,28);
        //Le pasamos mesa por agregacion
        Reserva r1 = new Reserva(hoy, 1400, m1);

        System.out.println(r1.getMesa());
        System.out.println(r1.getCliente());
        r1.setCliente(c1);
        System.out.println(r1.getCliente());
    }
}
