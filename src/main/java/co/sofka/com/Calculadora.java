package co.sofka.com;

import org.jboss.logging.Logger;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Calculadora {
    static final Logger logger = Logger.getLogger("logger");
    public Integer suma(List<Integer> valores) {
        return valores.stream().reduce((x, y) -> {
            return x + y;
        }).get();
    }

    public Integer resta(List<Integer> valores) {

        return valores.stream().skip(5)
                .reduce((x, y) -> {
                    return y - x;
                }).get();
    }

    public Integer multiplicacion(List<Integer> valores) {
        return valores.stream().reduce((x, y) -> {
            return x * y;
        }).get();
    }

    public Double divicion(List<Integer> valores) {
        return Double.valueOf(valores.stream().reduce((x, y) -> {
            return y / x;
        }).get());
    }

    public Optional<Integer> SumaPares(List<Integer> valores) {
        return valores.stream().filter(x-> {
            return x%2==0;
        }).reduce(Integer::sum);
    }

    public List<Integer> PotenciaParaImpares(List<Integer> valores){
        return  valores.stream().filter(x -> {
                    return x%2==1;
                })
                .peek(e -> logger.info("La potencia es "+ e*e))
                .collect(Collectors.toList());
    }

}
