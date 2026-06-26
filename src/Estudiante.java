// Clase que representa a un estudiante
public class Estudiante {

    // Atributos del estudiante
    String nombre;
    int edad;
    String carrera;

    // Constructor que inicializa los datos del estudiante
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    // Método que muestra la información del estudiante en la consola
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
    }
}
