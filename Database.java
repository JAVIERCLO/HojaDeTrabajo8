import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

//Clase para manejar el csv
public class Database {
    String nombreArchivo = "pacientes.txt";
    private List<Paciente> listaPacientes = new ArrayList<>();

    public List<Paciente> leerData(String nombreArchivo) throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))){
            String linea;

            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(",");

                if (datos.length < 3){
                    System.err.println("Esta línea no tiene toda la información del paciente." + linea);
                    continue;
                }
                String nombre = datos[0].trim();
                String condicionMedica = datos[1].trim();
                String prioridad = datos[2].trim();
                
                Paciente paciente = new Paciente(nombre, condicionMedica, prioridad);
                listaPacientes.add(paciente);
            }
        }
        return listaPacientes;
    }
}
