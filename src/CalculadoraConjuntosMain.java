import java.util.Set;

public class CalculadoraConjuntosMain {
    public static void main(String[] args) {
        Set<Integer> conjuntoA = ConjuntoDataset.getConjuntoA();
        Set<Integer> conjuntoB = ConjuntoDataset.getConjuntoB();
        Set<Integer> conjuntoC = ConjuntoDataset.getConjuntoC();
        Set<Integer> conjuntoD = ConjuntoDataset.getConjuntoD();
        Set<Integer> conjuntoF = ConjuntoDataset.getConjuntoF();
        Set<Integer> conjuntoG = ConjuntoDataset.getConjuntoG();

        System.out.println("Conjunto A: " + conjuntoA);
        System.out.println("Conjunto B: " + conjuntoB);
        System.out.println("Conjunto C: " + conjuntoC);
        System.out.println("Conjunto D: " + conjuntoD);
        System.out.println("Conjunto F: " + conjuntoF);
        System.out.println("Conjunto G: " + conjuntoG);

        System.out.println("Realizando Operaciones Adicionales:");

        Set<Integer> resultado1 = OperacionesConjuntos.union(conjuntoA, conjuntoB);
        System.out.println("A unión B: " + resultado1);

        Set<Integer> resultado2 = OperacionesConjuntos.interseccion(conjuntoA, conjuntoB);
        System.out.println("A unión B intersección C: " + resultado2);

        Set<Integer> unionAB = OperacionesConjuntos.union(conjuntoA, conjuntoB);
        Set<Integer> interseccionCD = OperacionesConjuntos.interseccion(conjuntoC, conjuntoD);
        Set<Integer> resultado3 = OperacionesConjuntos.interseccion(unionAB, interseccionCD);
        System.out.println("(A unión B) unión (C intersección D): " + resultado3 + " El conjunto es nulo");

        Set<Integer> resultado5 = OperacionesConjuntos.interseccion(conjuntoF, conjuntoG);
        Set<Integer> resultado4 = OperacionesConjuntos.interseccion(resultado3, resultado5);
        System.out.println("[(A unión B) unión (C intersección D)] - (F intersección G): " + resultado5);
    }
}