import java.util.Scanner;

public class GestionLibro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.println("Introduce el título del libro:");
        String titulo = sc.nextLine();
        System.out.println("Introduce el autor del libro:");
        String autor = sc.nextLine();
        System.out.println("Introduce el año de publicación:");
        int año = sc.nextInt();
        sc.nextLine(); 

        Libro libro = new Libro(titulo, autor, año);

     
        int opcion;
        do {
            System.out.println("\n1. Mostrar información del libro");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Actualizar datos del libro");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            sc.nextLine();  

            switch (opcion) {
                case 1:
                    libro.mostrarInfo();
                    break;
                case 2:
                    libro.prestar();
                    break;
                case 3:
                    libro.devolver();
                    break;
                case 4:
                    System.out.println("Introduce el nuevo título:");
                    String nuevoTitulo = sc.nextLine();
                    System.out.println("Introduce el nuevo autor:");
                    String nuevoAutor = sc.nextLine();
                    System.out.println("Introduce el nuevo año de publicación:");
                    int nuevoAño = sc.nextInt();
                    libro.actualizarDatos(nuevoTitulo, nuevoAutor, nuevoAño);
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
