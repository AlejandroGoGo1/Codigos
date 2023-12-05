import java.util.HashSet;
import java.util.Set;


public class OperacionesConjuntos {
    public static Set<Integer> union(Set<Integer> conjunto1, Set<Integer> conjunto2) {
        Set<Integer> resultado = new HashSet<>(conjunto1);
        resultado.addAll(conjunto2);
        return resultado;
    }

    public static Set<Integer> interseccion(Set<Integer> conjunto1, Set<Integer> conjunto2) {
        Set<Integer> resultado = new HashSet<>(conjunto1);
        resultado.retainAll(conjunto2);
        return resultado;
    }
}