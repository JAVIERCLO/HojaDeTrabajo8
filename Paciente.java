//Clase modelo de un paciente
public class Paciente implements Comparable<Paciente>{
    //Atributos
    private String nombre;
    private String condicionMedica;
    private char prioridad;

    //Constructor
    public Paciente(String nombre, String condicionMedica, char prioridad){
        this.nombre = nombre;
        this.condicionMedica = condicionMedica;
        this.prioridad = prioridad;

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
    public char getPriodidad(){
        return prioridad;
    }
    
    //comparador
    @Override
    public int compareTo(Paciente otroPaciente) {
        return this.prioridad.compareTo(otroPaciente.prioridad);
    }
    
}
