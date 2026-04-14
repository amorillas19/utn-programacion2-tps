public class App {
    public static void main(String[] args) throws Exception {
        
        //Al ser asociacion bidireccional, los creo por separado
        //Sus setters son cruzados para evitar bucle infinito
        //La composicion implica crear internamente dentro del constructor
        //Una instancia del otro
        Titular t1 = new Titular("Juan Carlos", 30123456);
        Pasaporte p1 = new Pasaporte(101, 2026, "bonita", "png");
        p1.setTitular(t1);

        System.out.println(t1.getPasaporte().getNumero()); 
        System.out.println(p1.getTitular().getNombre());  
    }     
}
