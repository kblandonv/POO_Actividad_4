package CarreraCiclista;

public class Contrarrelojista extends Ciclista{
    // Atributo que define la velocidad máxima de un contrarrelojista
    private double velocidadMaxima;
    /**
     * Constructor de la clase Escalador
     * @param identificador Parámetro que define el identificador de un
     * contrarrelojista
     * @param nombre Parámetro que define el nombre de un
     * contrarrelojista
     * @param velocidadMaxima Parámetro que define la velocidad
     * máxima de un contrarrelojista
     */
    public Contrarrelojista(int identificador, String nombre, double
            velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }


    /**
     * Método que devuelve la velocidad máxima de un contrarrelojista
     * @return La velocidad máxima de un contrarrelojista
     */
    protected double getVelocidadMaxima() {
        return velocidadMaxima;
    }


    /**
     * Método que establece la velocidad máxima de un contrarrelojista
     * @param Parámetro que especifica la velocidad máxima de un
     * contrarrelojista
     */
    protected void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }


    /**
     * Método que muestra en pantalla los datos de un contrarrelojista
     */
    protected void imprimir() {
        super.imprimir(); // Invoca el método imprimir de la clase padre
        System.out.println("Aceleración promedio = " + velocidadMaxima);
    }


    /**
     * Método que devuelve el tipo de ciclista
     * @return Un valor String con el texto "Es un constrarrelojista"
     */
    protected String imprimirTipo() {
        return "Es un constrarrelojista";
    }
}
