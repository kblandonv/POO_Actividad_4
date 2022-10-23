package Actividad_4_POO_Clases_Abstractas.src.Animales;

/**
 * Esta clase abstracta denominada Animal modela un animal genérico
 * que cuenta con atributos como un sonido, alimentos que consume,
 * un hábitat y un nombre científico.
 */

public abstract class Animal {

    protected String sonido; /* Atributo que identifica el sonido emitido por un animal */
    protected String alimentos; /* Atributo que identifica los alimentos que consume un animal */
    protected String habitat; /* Atributo que identifica el hábitat de un animal */
    protected String nombreCientifico; /* Atributo que identifica el nombre científico de un animal */


    public abstract String getNombreCientifico();
    /**
     * Método abstracto que permite obtener el nombre científico del animal
     * @return El nombre científico del animal
     */


    public abstract String getSonido();
    /**
     * Método abstracto que permite obtener el sonido producido por el
     * animal
     * @return El sonido producido por el animal
     */

    public abstract String getAlimentos();
    /**
     * Método abstracto que permite obtener los alimentos que consume
     * un animal
     * @return Los alimentos que consume el animal
     */

    public abstract String getHabitat();
    /**
     * Método abstracto que permite obtener el hábitat de un animal
     * @return El hábitat del animal
     */

}
