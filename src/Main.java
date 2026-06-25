public class Main {

    public static void main(String[] args) {

        Estudiante estudiante1 =
                new Estudiante("Juan", 20, "Ingeniería");

        Estudiante estudiante2 =
                new Estudiante("María", 22, "Sistemas");

        estudiante1.mostrarInformacion();

        System.out.println("----------------");

        estudiante2.mostrarInformacion();
    }
}