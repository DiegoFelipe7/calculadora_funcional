package co.sofka.com;

import org.jboss.logging.Logger;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Calculadora {
    static final Logger logger = Logger.getLogger("logger");

    public List<Double> suma(List<Double> listaUno ,List<Double> listDos) {
        AtomicInteger contador= new AtomicInteger();
        return listaUno.stream().map((x)->{
            if(listaUno.size()!=listDos.size()){
                throw  new IllegalArgumentException("Error las listas deben tener el mismo tamaño");
            }
            return x + listDos.get(contador.getAndIncrement());
        }).collect(Collectors.toList());
    }

    public List<Double> resta(List<Double> listaUno , List<Double> listaDos) {
        AtomicInteger contador= new AtomicInteger();
        return listaUno.stream().map((x)->{
            if(listaUno.size()!=listaDos.size()){
                throw  new IllegalArgumentException("Error las listas deben tener el mismo tamaño");
            }
            return x - listaDos.get(contador.getAndIncrement());
        }).collect(Collectors.toList());
    }

    public List<Double> multiplicacion(List<Double> listaUno , List<Double> listaDos) {
        AtomicInteger contador= new AtomicInteger();
        return listaUno.stream().map((x)->{
            if(listaUno.size()!=listaDos.size()){
                throw  new IllegalArgumentException("Error las listas deben tener el mismo tamaño");
            }
            return x * listaDos.get(contador.getAndIncrement());
        }).collect(Collectors.toList());
    }

    public List<Double> divicion(List<Double> listaUno , List<Double> listaDos) {
        AtomicInteger contador= new AtomicInteger();
        return listaUno.stream().map((x)->{
            if(listaUno.size()!=listaDos.size()){
                throw  new IllegalArgumentException("Error las listas deben tener el mismo tamaño");
            }

            return x / listaDos.get(contador.getAndIncrement());
        }).collect(Collectors.toList());
    }

    public double promedio(List<Double> listaUno , List<Double>listaDos){
        AtomicInteger contador= new AtomicInteger();
        List<Double> valor=  listaUno.stream().map((x)->{
                if(listaUno.size()!=listaDos.size()){
                    throw  new IllegalArgumentException("Error las listas deben tener el mismo tamaño");
                }
                return x + listaDos.get(contador.getAndIncrement());
            }).collect(Collectors.toList());

        return valor.stream().reduce((x,y)->{
            return x+y;
        }).get()/((listaDos.size()*2));
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
