public class App {
    public static void main(String[] args) throws Exception {
        
        Titular t1 = new Titular("Juan Carlos", 30123456);
        Pasaporte p1 = new Pasaporte(101, 2026, "bonita", "png");
        p1.setTitular(t1);

        System.out.println(t1.getPasaporte().getNumero()); 
        System.out.println(p1.getTitular().getNombre());  
    }     
}
