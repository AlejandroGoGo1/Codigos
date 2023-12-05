import java.util.HashSet;
import java.util.Set;

class ConjuntoDataset {
    public static Set<Integer> getConjuntoA() {
        return new HashSet<>(Set.of(1, 3, 5, 7, 9));
    }

    public static Set<Integer> getConjuntoB() {
        return new HashSet<>(Set.of(2, 4, 6, 8, 10));
    }

    public static Set<Integer> getConjuntoC() {
        return new HashSet<>(Set.of(5, 6, 7, 8));
    }

    public static Set<Integer> getConjuntoD() {
        return new HashSet<>(Set.of(7, 8, 9, 10));
    }

    public static Set<Integer> getConjuntoE(){
        return new HashSet<>(Set.of(1 ,2 ,3 ,4));
    }

    public static Set<Integer> getConjuntoF() {
        return new HashSet<>(Set.of(2, 4, 6, 8));
    }

    public static Set<Integer> getConjuntoG() {
        return new HashSet<>(Set.of(3, 6, 9, 10));
    }
}