//Clase factory de los 2 tipos de colas de prioridad
import java.util.PriorityQueue;
import java.util.Vector;

public class Factory {
    public static String createPriorityQueue(int opcion){

        switch (opcion) {
            case 1: //Cola de prioridad de JCF
                return new ColaPrioridadJCF();
            case 2: //Cola de prioridad usando VectorHeap
                return new ColaPrioridadVectorHeap();
            default:
                return "Elige una opcion valida";
        }

    }
}