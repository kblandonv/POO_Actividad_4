package Animales;

/**
 * Esta clase prueba diferentes animales y sus métodos.
 */

public class Prueba {
    /**
     * Método main que crea un array de varios animales y para cada uno
     * muestra en pantalla su nombre científico, su sonido, alimentos y
     * hábitat
     */
    public static void main(String[] args) {
        Animal[] animales = new Animal[4]; /* Define un array de cuatro elementos de tipo Animal */
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();
        for (Animal animale : animales) { /* Recorre el array de animales */
            System.out.println(animale.getNombreCientifico());
            System.out.println("Sonido: " + animale.getSonido());
            System.out.println("Alimentos: " + animale.getAlimentos());
            System.out.println("Hábitat: " + animale.getHabitat());
            System.out.println();
        }
    }
}