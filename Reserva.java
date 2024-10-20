public class Reserva {
    private String nombreCliente;
    private int numDias;
    private String tipoHabitacion;  
    private String estado;  

    
    public Reserva(String nombreCliente, int numDias, String tipoHabitacion) {
        this.nombreCliente = nombreCliente;
        this.numDias = numDias;
        this.tipoHabitacion = tipoHabitacion;
        this.estado = "confirmada";  
    }

 
    public void mostrarInfo() {
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Número de días: " + numDias);
        System.out.println("Tipo de habitación: " + tipoHabitacion);
        System.out.println("Estado: " + estado);
    }

    public void confirmar() {
        if (estado.equals("cancelada")) {
            estado = "confirmada";
            System.out.println("La reserva ha sido confirmada.");
        } else {
            System.out.println("La reserva ya está confirmada.");
        }
    }

    public void cancelar() {
        if (estado.equals("confirmada")) {
            estado = "cancelada";
            System.out.println("La reserva ha sido cancelada.");
        } else {
            System.out.println("La reserva ya está cancelada.");
        }
    }

    public void actualizarDatos(String nombreCliente, int numDias, String tipoHabitacion) {
        this.nombreCliente = nombreCliente;
        this.numDias = numDias;
        this.tipoHabitacion = tipoHabitacion;
        System.out.println("Datos de la reserva actualizados.");
    }
}
