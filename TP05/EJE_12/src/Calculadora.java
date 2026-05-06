import java.nio.channels.Pipe.SourceChannel;

public class Calculadora {

    public void calcular(Impuesto impuesto){
        
        System.out.println("El impuesto es de $" + impuesto.getMonto() + " pesos");
        System.out.println("El contribuyente es: " + impuesto.getContribuyente());
    }
}
