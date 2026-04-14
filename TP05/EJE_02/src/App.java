public class App {
    public static void main(String[] args) throws Exception {
        
        //Asociacion significa crear y luego vincular
        //Luego la bidireccional identica al e1
        Bateria b1 = new Bateria("pichichi", 100);
        Celular c1 = new Celular(123, "Samsung", "S99", b1);
        Usuario u1 = new Usuario("Juan Carlos", 10123456);

        u1.setCelular(c1);
        System.out.println(u1.getCelular());
        System.out.println(c1.getUsuario());
    }
}
