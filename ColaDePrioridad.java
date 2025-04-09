public interface ColaDePrioridad {
        void agregarPaciente(Paciente paciente);
        Paciente atenderPaciente();
        boolean colaVacia();
}
