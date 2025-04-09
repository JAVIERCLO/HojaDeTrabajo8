//Clase factory de los 2 tipos de colas de prioridad
import java.util.PriorityQueue;
import java.util.Vector;

public class Factory {
    public static ColaDePrioridad createPriorityQueue(int opcion){

        switch (opcion) {
            case 1: //Cola de prioridad de JCF
                return (ColaDePrioridad) new ColaPrioridadJCF();
            case 2: //Cola de prioridad usando VectorHeap
                return (ColaDePrioridad) new ColaPrioridadVectorHeap();
            default:
            throw new IllegalArgumentException("Elige una opción válida");
        }

    }
}