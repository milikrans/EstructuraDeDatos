import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("hola mundo");

        ArrayADT nuevo = new ArrayADT(5);

        nuevo.establecerElemento(0, 100);

        System.out.println(nuevo.obtenerElemento(0));

        System.out.println(nuevo.longitud());

        nuevo.imprimir();

        nuevo.toString();
        */

        ConjuntoADT setA = new ConjuntoADT();
        ConjuntoADT setB = new ConjuntoADT();

        List<Integer> listaA = List.of(6,6,1,2,3,4,5,1,5,3,2,4,12,56,78);
        for (Integer item: listaA){
            setA.agregar(item);
        }
        System.out.println("el conjunto a es = " + setA.toString());

        List<Integer> listaB = List.of(7,8,6,9,5,5,5,7,4,4,8,9,5,70,50,30);
        for (Integer item: listaB){
            setB.agregar(item);
        }
        System.out.println("el conjunto b es = " + setB.toString());

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        List<Integer> listaA2 = List.of(12,11,56,12,56,78);
        for (Integer item: listaA2){
            setA.eliminar(item);
        }
        System.out.println("el conjunto a es = " + setA.toString());

        List<Integer> listaB2 = List.of(20,50,30,70,50,30);
        for (Integer item: listaB2){
            setB.eliminar(item);
        }
        System.out.println("el conjunto b es = " + setB.toString());

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        System.out.print("el conjunto a tiene " + setA.longitud() + " de largo");
        System.out.print(" y el conjunto b tiene " + setB.longitud() + " de largo \n");

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        int a = 3;
        int b = 7;

        if (setA.contiene(a)){
            System.out.println("el conjunto a contiene " + a);
        }else{
            System.out.println("el conjunto a NO contiene " + a);
        }

        if (setA.contiene(b)){
            System.out.println("el conjunto a contiene " + b);
        }else {
            System.out.println("el conjunto a NO contiene " + b);
        }

        if (setB.contiene(a)){
            System.out.println("el conjunto b contiene " + a);
        }else{
            System.out.println("el conjunto b NO contiene " + a);
        }

        if (setB.contiene(b)){
            System.out.println("el conjunto b contiene " + b);
        }else{
            System.out.println("el conjunto b NO contiene " + b);
        }

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        if (setA.equals(setB)){
            System.out.println("el conjunto a es igual al conjunto b");
        }else{
            System.out.println("el conjunto a NO es igual al conjunto b");
        }

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        if (setA.esSubConjunto(setB)){
            System.out.println("el conjunto a es subconjunto de b");
        }else{
            System.out.println("el conjunto a NO es subconjunto de b");
        }

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        if (setB.esSubConjunto(setA)){
            System.out.println("el conjunto b es subconjunto de a");
        }else{
            System.out.println("el conjunto b NO es subconjunto de a");
        }

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        System.out.println("la union de a y b es = " + setA.union(setB).toString());

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        System.out.println("la interseccion de a y b es = " + setA.interseccion(setB).toString());

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        System.out.println("la diferencia de a y b es = " + setA.diferencia(setB).toString());

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        System.out.println("la diferencia de b y a es = " + setB.diferencia(setA).toString());

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
}