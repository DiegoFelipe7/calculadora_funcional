package co.sofka.com;

import org.jboss.logging.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    static final Logger logger = Logger.getLogger("logger");

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        /**
         * Lista con los numeros a sumar y multiplicar dividir
         */
        List<Integer> listaUno = Arrays.asList(1, 2, 3, 4);
        List<Integer> listaDos = Arrays.asList(9, 8, 5, 7);
        List<Integer> arrayNumbers = Stream.concat(listaUno.stream(), listaDos.stream()).collect(Collectors.toList());

        logger.info("La suma de los elementos es " + calculadora.suma(arrayNumbers));

        logger.info("La resta de los elementos es " + calculadora.resta(arrayNumbers));

        logger.info("La multiplicacion de los elementos es " + calculadora.multiplicacion(arrayNumbers));

        logger.info("La divicion de los elementos es " + calculadora.divicion(arrayNumbers));


        logger.info("La suma de los numeros pares es " + calculadora.SumaPares(arrayNumbers));

         calculadora.PotenciaParaImpares(arrayNumbers);

    }
}
