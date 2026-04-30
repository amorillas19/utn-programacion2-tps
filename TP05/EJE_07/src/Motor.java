public class Motor {
    private String motor;
    private int numeroSerie;


    public Motor(String motor, int numeroSerie) {
        this.motor = motor;
        this.numeroSerie = numeroSerie;
    }


    @Override
    public String toString() {
        return "Motor [motor=" + motor + ", numeroSerie=" + numeroSerie + "]";
    }

    

    
}
