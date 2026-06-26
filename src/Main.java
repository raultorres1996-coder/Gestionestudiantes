// Clase principal de la aplicación
public class Main {

    public static void main(String[] args) {

        // Creación de dos objetos de tipo Estudiante
        Estudiante estudiante1 =
                new Estudiante("Juan", 20, "Ingeniería");

        Estudiante estudiante2 =
                new Estudiante("María", 22, "Sistemas");

        // Mostrar la información del primer estudiante
        estudiante1.mostrarInformacion();

        System.out.println("----------------");

        // Mostrar la información del segundo estudiante
        estudiante2.mostrarInformacion();
    }
}
