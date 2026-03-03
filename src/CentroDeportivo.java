public class CentroDeportivo {

    private Entrenador[] entrenadores;
    private final int NUM_MAX_ENTRENADORES;
    //private int num_minimo_entrenadores;

    public CentroDeportivo(int num_entrenadores) {
        /*
        num_minimo_entrenadores = numero_minimo;
        if (num_entrenadores <= numero_minimo) {
            throw new IllegalArgumentException("El numero de entrenadores tiene que ser mayor a 0");
        }
         */

        this.NUM_MAX_ENTRENADORES = num_entrenadores;
        entrenadores = new Entrenador[NUM_MAX_ENTRENADORES];


    }

    /**
     * Busca un entrenador por su id
     * @param id_entrenador id del entrenador recibido
     * @return el entrenador o null
     */
    public Entrenador buscarEntrenador(int id_entrenador) {
        boolean seguirBuscando = true;
        Entrenador entrenadorEncontrado = null;

        for (int i = 0; i < NUM_MAX_ENTRENADORES &&  seguirBuscando; i++) {
            if (entrenadores[i] != null && entrenadores[i].getId() == id_entrenador) {
                entrenadorEncontrado = entrenadores[i];
                seguirBuscando = false;
            }
        }
        return entrenadorEncontrado;
    }

    /**
     * Busca la primera poscion libre en los entrenadores
     * @return la primera poscion libre
     */
    private int buscarPrimerHuecoLibre(){
        int poscionLibre = -1;
        boolean seguirBuscando = true;

        for (int i = 0; i < NUM_MAX_ENTRENADORES && seguirBuscando; i++) {
            if (entrenadores[i] == null) {
                poscionLibre = i;
                seguirBuscando = false;
            }
        }
        return poscionLibre;
    }

    /**
     * Registra un entrenador si no existe ya y hay hueco.
     * @param entrenador entrenador recibido
     * @return true si se ha añadido correctamente o false si no se ha podido añadir
     */
    public boolean registrarEntrenador(Entrenador entrenador) {
        boolean entrenadorRegistrado = false;
        int posicionEntrenador;

        if (buscarEntrenador(entrenador.getId()) == null) {
            posicionEntrenador = buscarPrimerHuecoLibre();
            if (posicionEntrenador >= 0){
                entrenadores[posicionEntrenador] = entrenador;
                entrenadorRegistrado = true;
            }
        }

        return entrenadorRegistrado;
    }

    /**
     * Muestra los entrenadores registrados
     * @return String con los entrenadores
     */
    public String mostrarEntrenadores(){
        StringBuilder sb = new StringBuilder("Entrenadores registrados: \n");

        for (int i = 0; i < NUM_MAX_ENTRENADORES; i++) {
            if (entrenadores[i] != null) {
                sb.append(entrenadores[i].toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /**
     * Cuenta el numero de entrenadores que hay
     * @return el numero de entrenadores
     */
    public int contarEntrenadores(){
        int contador = 0;
        for (int i = 0; i < NUM_MAX_ENTRENADORES; i++) {
            if (entrenadores[i] != null) {
                contador++;
            }
        }
        return contador;
    }
}
