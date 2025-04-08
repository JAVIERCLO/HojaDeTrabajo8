import java.util.PriorityQueue;
public class ColaPrioridadJCF<T extends Comparable<T>>{
    private PriorityQueue<Paciente> cola;
    public ColaPrioridadJCF(){
        cola = new PriorityQueue<>();
    }

    public void agregarPaciente(Paciente paciente){
        cola.add(paciente);
    }

    public Paciente atenderPaciente(){
        return cola.poll();
    }

    public boolean colaVacia(){
        return cola.isEmpty();
    }
    
}
