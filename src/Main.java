import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la imersion en Java!");
        // System.out.println("Pelicula Mátrix");
        //Declaración de variables
        int fechaLanzamiento = 1990;
        double evaluacion = 4.5;
        boolean incluidoEnElBasico = true;
        String nombre = "Matrix";
        String sinapsis = """
                            Fantasia
                """;

        double mediaEvaluacionUsuario = 0;


        System.out.println("Nombre de la pelicula" + nombre);
        System.out.println("Fecha de lanzamiento" +fechaLanzamiento);
        System.out.println("Evaluación que tiene " + evaluacion);
        System.out.println("Es de las Básicas a ver" + incluidoEnElBasico);

        double mediaEvaluacion = (4.5 + 3.9 + 5.0) / 3;
        System.out.println("La media de la evaluación Matrix es: " + mediaEvaluacion);

        if(fechaLanzamiento >= 2023){
            System.out.println("Pelicula popular en el momento");
        }else{
            System.out.println("Pelicula reto que vale la pena ver !");
        }

        for (int i = 0; i <3 ; i++) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Que nota le das a Matrix? ");

            double notaMatrix = entrada.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println(" La media de la pelicula Matrix " +
                "Calculada por el usuario es:  " + mediaEvaluacionUsuario / 3 );
    }
}