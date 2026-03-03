public class CentroDeportivo {

    private Entrenador[] entrenadores;
    private final int NUM_MAX_ENTRENADORES;

    public CentroDeportivo(int num_entrenadores) {
        NUM_MAX_ENTRENADORES = num_entrenadores;
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



}
