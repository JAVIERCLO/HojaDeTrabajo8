//Clase main
import java.util.Scanner;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainHospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();

        System.out.println("Elige un tipo de cola de prioridad:");
        System.out.println("1. Cola de prioridad del Java Collections Framework");
        System.out.println("2. Cola de prioridad con VectorHeap");

        int opcion = scanner.nextInt();
        scanner.nextLine(); 

        ColaDePrioridad cola = Factory.createPriorityQueue(opcion);

        try {
            List<Paciente> pacientes = database.leerData("pacientes.txt");
            for (Paciente paciente : pacientes) {
                cola.agregarPaciente(paciente);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de pacientes: " + e.getMessage());
            return;
        }

        System.out.println("\nAtención a pacientes");
        while (!cola.colaVacia()) {
            Paciente paciente = cola.atenderPaciente();
            System.out.println(paciente);
        }

        System.out.println("\nTodos los pacientes han sido atendidos.");
        scanner.close();
    }
}
