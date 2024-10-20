import java.util.Scanner;

public class GestionReserva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Introduce el nombre del cliente:");
        String nombreCliente = sc.nextLine();
        System.out.println("Introduce el número de días de la estadía:");
        int numDias = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Introduce el tipo de habitación (individual, doble, suite):");
        String tipoHabitacion = sc.nextLine();

        Reserva reserva = new Reserva(nombreCliente, numDias, tipoHabitacion);

        
        int opcion;
        do {
            System.out.println("\n1. Mostrar información de la reserva");
            System.out.println("2. Confirmar reserva");
            System.out.println("3. Cancelar reserva");
            System.out.println("4. Actualizar datos de la reserva");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            sc.nextLine();  

            switch (opcion) {
                case 1:
                    reserva.mostrarInfo();
                    break;
                case 2:
                    reserva.confirmar();
                    break;
                case 3:
                    reserva.cancelar();
                    break;
                case 4:
                    System.out.println("Introduce el nuevo nombre del cliente:");
                    String nuevoNombre = sc.nextLine();
                    System.out.println("Introduce el nuevo número de días:");
                    int nuevoNumDias = sc.nextInt();
                    sc.nextLine();  // Limpiar el buffer
                    System.out.println("Introduce el nuevo tipo de habitación:");
                    String nuevoTipo = sc.nextLine();
                    reserva.actualizarDatos(nuevoNombre, nuevoNumDias, nuevoTipo);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
