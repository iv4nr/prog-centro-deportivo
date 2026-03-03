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


}
