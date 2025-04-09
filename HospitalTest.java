//Clase de pruebas unitarias
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HospitalTest {

    @Test
    public void testColaPrioridadJCF() {
        ColaPrioridadJCF<Paciente> colaJCF = new ColaPrioridadJCF<>();

        Paciente paciente1 = new Paciente("Ana", "Dolor de cabeza", "C");
        Paciente paciente2 = new Paciente("Luis", "Fractura", "A");
        Paciente paciente3 = new Paciente("Claudia", "Gripe", "B");

        colaJCF.agregarPaciente(paciente1);
        colaJCF.agregarPaciente(paciente2);
        colaJCF.agregarPaciente(paciente3);

        assertEquals(paciente2, colaJCF.atenderPaciente()); // Prioridad A
        assertEquals(paciente3, colaJCF.atenderPaciente()); // Prioridad B
        assertEquals(paciente1, colaJCF.atenderPaciente()); // Prioridad C
        assertTrue(colaJCF.colaVacia());
    }

    @Test
    public void testColaPrioridadVectorHeap() {
        ColaPrioridadVectorHeap<Paciente> colaVectorHeap = new ColaPrioridadVectorHeap<>();

        Paciente paciente1 = new Paciente("Ana", "Dolor de cabeza", "C");
        Paciente paciente2 = new Paciente("Luis", "Fractura", "A");
        Paciente paciente3 = new Paciente("Claudia", "Gripe", "B");

        colaVectorHeap.agregarPaciente(paciente1);
        colaVectorHeap.agregarPaciente(paciente2);
        colaVectorHeap.agregarPaciente(paciente3);

        assertEquals(paciente2, colaVectorHeap.atenderPaciente()); // Prioridad A
        assertEquals(paciente3, colaVectorHeap.atenderPaciente()); // Prioridad B
        assertEquals(paciente1, colaVectorHeap.atenderPaciente()); // Prioridad C
        assertTrue(colaVectorHeap.colaVacia());
    }
}
