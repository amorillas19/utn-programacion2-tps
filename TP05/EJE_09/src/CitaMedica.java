import java.time.*;

public class CitaMedica {
    private String fecha; 
    private String hora;
    private Paciente paciente;
    private Profesional profesional;

    
    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }


    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getHora() {
        return hora;
    }


    public void setHora(String hora) {
        this.hora = hora;
    }


    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }


    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }


    @Override
    public String toString() {
        return "CitaMedica [fecha=" + fecha + ", hora=" + hora + ", paciente=" + paciente + ", profesional="
                + profesional + "]";
    }

    
}
