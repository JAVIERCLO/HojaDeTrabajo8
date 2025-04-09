//Clase modelo de un paciente
public class Paciente implements Comparable<Paciente>{
    //Atributos
    private String nombre;
    private String condicionMedica;
    private String prioridad;

    //Constructor
    public Paciente(String nombre, String condicionMedica, String prioridad){
        this.nombre = nombre;
        this.condicionMedica = condicionMedica;
        this.prioridad = prioridad;

    }
    public Paciente(String nombre2, String condicionMedica2, char c) {
        //TODO Auto-generated constructor stub
    }
    //Métodos
    @Override
    public String toString() {
        return "Información del paciente: " + nombre + " " + condicionMedica + " " + prioridad;
    }
//Gets
    //nombre
    public String getNombre(){
        return nombre;
    }
    //condición médica
    public String getCondicionMedica(){
        return condicionMedica;
    }
    //prioridad
    public String getPrioridad(){
        return prioridad;
    }
    
    //comparador
    @Override
    public int compareTo(Paciente otroPaciente) {
        return this.prioridad.compareTo(otroPaciente.prioridad);
    }
    
}
