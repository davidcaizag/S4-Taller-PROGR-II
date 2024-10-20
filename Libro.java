public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String estado; 

    
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.estado = "disponible";  
    }


    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Estado: " + estado);
    }

    public void prestar() {
        if (estado.equals("disponible")) {
            estado = "prestado";
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    public void devolver() {
        if (estado.equals("prestado")) {
            estado = "disponible";
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro no está prestado.");
        }
    }

    public void actualizarDatos(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        System.out.println("Datos del libro actualizados.");
    }
}
