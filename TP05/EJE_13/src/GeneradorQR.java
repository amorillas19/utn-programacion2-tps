public class GeneradorQR {

    public void generar(String valor, Usuario usuario){
        CodigoQR qr1 = new CodigoQR(valor);
        qr1.setUsuario(usuario);
        System.out.println(qr1);
    }
    
}
