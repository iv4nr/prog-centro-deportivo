public class Main {

    public static void main(String[] args) {

        CentroDeportivo Gimansio = new CentroDeportivo(15);


        Entrenador entrenador1 = new Entrenador(01,"Bowser", "Fuerza ",50);
        Entrenador entrenador2 = new Entrenador(02,"Sonic", "Atletismo ",100);
        Entrenador entrenador3 = new Entrenador(03,"Peach", "Baile ",15);


        System.out.println("Entrenador registrado = " + Gimansio.registrarEntrenador(entrenador1));
        System.out.println("Entrenador registrado = " + Gimansio.registrarEntrenador(entrenador2));
        System.out.println("Entrenador registrado = " + Gimansio.registrarEntrenador(entrenador3));


        System.out.println("El entrenador buscado: " + Gimansio.buscarEntrenador(2));
        System.out.println("El entrenador buscado: " + Gimansio.buscarEntrenador(5));

        System.out.println("Los entrenadores registrados son: " + Gimansio.contarEntrenadores());

        System.out.println(Gimansio.mostrarEntrenadores());




    }



}