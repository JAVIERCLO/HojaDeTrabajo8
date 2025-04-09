import java.util.Vector;
//Cola de prioridad usando Vector Heap
public class ColaPrioridadVectorHeap<T extends Comparable<T>> implements ColaDePrioridad{

    private Vector<Paciente> heap;

    public ColaPrioridadVectorHeap() {
        heap = new Vector<>();
    }

    public void agregarPaciente(Paciente paciente) {
        heap.add(paciente);
        int index = heap.size() - 1;
        while (index > 0) {
            int padre = (index - 1) / 2;
            if (heap.get(index).compareTo(heap.get(padre)) >= 0) {
                break;
            }
            Paciente temp = heap.get(padre);
            heap.set(padre, heap.get(index));
            heap.set(index, temp);
            index = padre;
        }
    }

    public Paciente atenderPaciente() {
        if (heap.isEmpty()) {
            return null;
        }
        Paciente result = heap.get(0);
        Paciente last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            int index = 0;
            while (true) {
                int izq = 2 * index + 1;
                int der = 2 * index + 2;
                int smallest = index;

                if (izq < heap.size() && heap.get(izq).compareTo(heap.get(smallest)) < 0) {
                    smallest = izq;
                }

                if (der < heap.size() && heap.get(der).compareTo(heap.get(smallest)) < 0) {
                    smallest = der;
                }

                if (smallest == index) {
                    break;
                }

                Paciente temp = heap.get(index);
                heap.set(index, heap.get(smallest));
                heap.set(smallest, temp);
                index = smallest;
            }
        }
        return result;
    }

    public boolean colaVacia() {
        return heap.isEmpty();
    }
}

