public class App {
    public static void main(String[] args) throws Exception {
        Empleado e1 = new Empleado(0, "Juan Carlos", "Repartidor", 100);
        Empleado e2 = new Empleado("Roberto Carlos", "Guardia");

        e1.actualizarSalario(0);
        e1.actualizarSalario(50.0);
        e1.actualizarSalario(200);
        e1.actualizarSalario(-999.9);
        System.out.println("-----------");
        System.out.println("-----------");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println("-----------");
        System.out.println("-----------");
        Empleado.mostrarTotalEmpleados();

    }
}
