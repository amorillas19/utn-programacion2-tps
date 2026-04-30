public class App {
    public static void main(String[] args) throws Exception {
        
        Conductor c1 = new Conductor("Juan Carlos", 1234);
        Motor m1 = new Motor("Triturbo", 69420);
        Vehiculo v1 = new Vehiculo("ABC123", "Ferrari", m1);
        v1.setConductor(c1);
        
        System.out.println(v1);
    }
}
