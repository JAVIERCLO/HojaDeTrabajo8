import java.util.PriorityQueue;
//Cola de prioridad del JCF
public class ColaPrioridadJCF<T extends Comparable<T>> implements ColaDePrioridad{
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
