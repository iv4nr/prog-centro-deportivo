public class Entrenador {

    private int  id;
    private String nombre;
    private String especialidad;
    private int añosExperiencia;

    /**
     * Metodo constructor de Entrenador
     * @param id id del entrenador
     * @param nombre nombre del entrenador
     * @param especialidad especialidad del entrenador
     */
    public Entrenador(int id, String nombre, String especialidad, int añosExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    /**
     *Devuelve el id del entrenador
     * @return id entrenador
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el nombre del entrenador
     * @return nombre del entrenador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la especialidad del entrenador
     * @return especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Devuelve los años de experiencia del entrenador
     * @return
     */
    public int getAñosExperiencia(){
        return añosExperiencia;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Entrenador { ");
        sb.append(String.format("id: %d,", id));
        sb.append(String.format(" nombre: %s,", nombre));
        sb.append(String.format(" especialidad: %s,", especialidad));
        sb.append(String.format(" años de experiecia: %d", añosExperiencia));
        sb.append(" }");

        return sb.toString();
    }

}
