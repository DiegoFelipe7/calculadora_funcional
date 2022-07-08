package co.sofka.com;

import org.jboss.logging.Logger;

import java.util.Arrays;
import java.util.List;
/**
 * clase main
 * @author Diego Felipe Munoz Mosquera - diegofelipem99@gmail.com
 * @version 1.0.0 07-07-2022
 */
public class App {
    static final Logger logger = Logger.getLogger("logger");

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        List<Double> listaUno = Arrays.asList(1.0, 2.0, 3.0, 3.0);
        List<Double> listaDos = Arrays.asList(9.0, 1.0, 5.0, 1.0);

        logger.info("La suma de los elementos es " + calculadora.suma(listaUno, listaDos));

        logger.info("La resta de los elementos es " + calculadora.resta(listaUno, listaDos));

        logger.info("La multiplicacion de los elementos es " + calculadora.multiplicacion(listaUno, listaDos));

        logger.info("La divicion de los elementos es " + calculadora.divicion(listaUno, listaDos));

        logger.info("El promedio es " + calculadora.promedio(listaUno, listaDos));

        logger.info("La potencia de los arreglos es " + calculadora.potencia(listaUno));

        logger.info("El modulo es" + calculadora.modulo(listaUno,listaDos));



    }
}
