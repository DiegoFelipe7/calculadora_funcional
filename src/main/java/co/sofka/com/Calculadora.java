package co.sofka.com;


import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Clase calculador la cual contiene los metodos como suma multiplicacion divicion resta entreo otros
 *  * @author Diego Felipe Munoz Mosquera - diegofelipem99@gmail.com
 *  * @version 1.0.0 07-07-2022
 */
public class Calculadora {

    /**
     *  Metodo para realizar la sumatoria de dos listas posicion por posicion
     * @param listaUno recibe la lista de tipo double
     * @param listDos recibe la lista de tipo double
     * @return una nueva lista con la suma de cada posicion
     */

    public List<Double> suma(List<Double> listaUno, List<Double> listDos) {
        AtomicInteger contador = new AtomicInteger();
        return listaUno.stream().map((x) -> {
            if (listaUno.size() != listDos.size()) {
                throw new IllegalArgumentException("Error las listas deben tener el mismo tamaño");
            }
            return x + listDos.get(contador.getAndIncrement());
        }).collect(Collectors.toList());
    }


    /**
     *  Metodo para realizar la resta de dos listas posicion por posicion
     * @param listaUno recibe la lista de tipo double
     * @param listaDos recibe la lista de tipo double
     * @return una nueva lista con la resta de cada posicion
     */
    public List<Double> resta(List<Double> listaUno, List<Double> listaDos) {
        AtomicInteger contador = new AtomicInteger();
        return listaUno.stream().map((x) -> {
            if (listaUno.size() != listaDos.size()) {
                throw new IllegalArgumentException("Error las listas deben tener el mismo tamaño");
            }
            return x - listaDos.get(contador.getAndIncrement());
        }).collect(Collectors.toList());
    }

    /**
     *  Metodo para realizar la multiplocacion de dos listas posicion por posicion
     * @param listaUno recibe la lista de tipo double
     * @param listaDos recibe la lista de tipo double
     * @return una nueva lista con la resta de cada posicion
     */

    public List<Double> multiplicacion(List<Double> listaUno, List<Double> listaDos) {
        AtomicInteger contador = new AtomicInteger();
        return listaUno.stream().map((x) -> {
            if (listaUno.size() != listaDos.size()) {
                throw new IllegalArgumentException("Error las listas deben tener el mismo tamaño");
            }
            return x * listaDos.get(contador.getAndIncrement());
        }).collect(Collectors.toList());
    }
    /**
     *  Metodo para realizar la divicion de dos listas posicion por posicion
     * @param listaUno recibe la lista de tipo double
     * @param listaDos recibe la lista de tipo double
     * @return una nueva lista con la resta de cada posicion
     */

    public List<Double> divicion(List<Double> listaUno, List<Double> listaDos) {
        AtomicInteger contador = new AtomicInteger();
        return listaUno.stream().map((x) -> {
            if (listaUno.size() != listaDos.size()) {
                throw new IllegalArgumentException("Error las listas deben tener el mismo tamaño");
            }
            if(listaDos.get(contador.getAndIncrement()).equals(0.0)){

                throw new IllegalArgumentException("La divicion por cero no esta definida");

            }
            return x / listaDos.indexOf(x);
        }).collect(Collectors.toList());
    }

    /**
     *  Metodo para  calcular el promedio de 2 listas
     * @param listaUno recibe la lista de tipo double
     * @param listaDos recibe la lista de tipo double
     * @return una nueva lista con la resta de cada posicion
     */
    public double promedio(List<Double> listaUno, List<Double> listaDos) {
        AtomicInteger contador = new AtomicInteger();
        List<Double> valor = listaUno.stream().map((x) -> {
            if (listaUno.size() != listaDos.size()) {
                throw new IllegalArgumentException("Error las listas deben tener el mismo tamaño");
            }
            return x + listaDos.get(contador.getAndIncrement());
        }).collect(Collectors.toList());

        return valor.stream().reduce((x, y) -> {
            return x + y;
        }).get() / ((listaDos.size() * 2));
    }
    /**
     *  Metodo para calcular los numero de una lista elevados al cuadrado
     * @param listaUno recibe la lista de tipo double
     * @return una nueva lista los numeros elevados al cuadrado de cada posicion
     */
    public List<Double> potencia(List<Double> listaUno) {
        return listaUno.stream().map(y -> {
            return y * y;
        }).collect(Collectors.toList());

    }
    /**
     *  Metodo para calcular el modulo de dos listas
     * @param listaUno recibe la lista de tipo double
     * @return una nueva lista con los modulos de cada posicion
     */
    public List<Double> modulo(List<Double> listaUno, List<Double> listaDos) {
        AtomicInteger contador = new AtomicInteger();
        return listaUno.stream().map(x -> {
            if (listaUno.size() != listaDos.size()) {
                throw new IllegalArgumentException("Error las listas deben tener el mismo tamaño");
            }
            return x %listaDos.get(contador.getAndIncrement());
        }).collect(Collectors.toList());
    }


}
