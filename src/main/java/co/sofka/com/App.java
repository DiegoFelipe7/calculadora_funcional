package co.sofka.com;

import org.jboss.logging.Logger;

import java.util.Arrays;
import java.util.List;

public class App {
    static final Logger logger = Logger.getLogger("logger");

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        /**
         * Lista con los numeros a sumar y multiplicar dividir
         */
        List<Double> listaUno = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        List<Double> listaDos = Arrays.asList(9.0, 8.0, 5.0, 5.0);

        logger.info("La suma de los elementos es " + calculadora.suma(listaUno, listaDos));

        logger.info("La resta de los elementos es " + calculadora.resta(listaUno, listaDos));

        logger.info("La multiplicacion de los elementos es " + calculadora.multiplicacion(listaUno, listaDos));

        logger.info("La divicion de los elementos es " + calculadora.divicion(listaUno, listaDos));

        logger.info("El promedio es " + calculadora.promedio(listaUno, listaDos));
        /*
        logger.info("La suma de los numeros pares es " + calculadora.SumaPares(arrayNumbers));



        calculadora.PotenciaParaImpares(arrayNumbers);
    */
    }
}
