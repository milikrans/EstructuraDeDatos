import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class ConjuntoADT<T> {

    private Set<T> conjunto;

    public ConjuntoADT(){

        conjunto = new HashSet<>();

    }

    public int longitud(){

        return conjunto.size();

    }

    public boolean contiene(T elemento) {

        return conjunto.contains(elemento);

    }

    public void agregar(T elemento){

        //System.out.println("agregando " + elemento);

        if(conjunto.contains(elemento) == false) {

            conjunto.add(elemento);
            //System.out.println(elemento + " ah sido agregado");

        }else{

            System.out.println("el conjunto ya contiene " + elemento);

        }
    }

    public void eliminar(T elemento){

        //System.out.println("eliminando " + elemento);

        if (conjunto.contains(elemento) == true){

            conjunto.remove(elemento);
            //System.out.println(elemento + " ah sido eliminado");

        }else{

            System.out.println("el conjunto no contiene " + elemento);

        }
    }

    public boolean equals(ConjuntoADT<T> otroConjunto){

        return conjunto.equals(otroConjunto.conjunto);

    }

    public boolean esSubConjunto(ConjuntoADT<T> otroConjunto) {

        return otroConjunto.conjunto.containsAll(conjunto);

    }

    public ConjuntoADT<T> union(ConjuntoADT<T> otroConjunto){

        ConjuntoADT union = new ConjuntoADT<>();

        union.conjunto.addAll(this.conjunto);
        union.conjunto.addAll(otroConjunto.conjunto);

        return union;

    }

    public ConjuntoADT<T> interseccion(ConjuntoADT<T> otroConjunto) {

        ConjuntoADT<T> interseccion = new ConjuntoADT<>();

        interseccion.conjunto.addAll(this.conjunto);
        interseccion.conjunto.retainAll(otroConjunto.conjunto);

        return interseccion;

    }

    public ConjuntoADT<T> diferencia(ConjuntoADT<T> otroConjunto) {

        ConjuntoADT<T> diferencia = new ConjuntoADT<>();

        diferencia.conjunto.addAll(this.conjunto);
        diferencia.conjunto.removeAll(otroConjunto.conjunto);

        return diferencia;

    }

    @Override
    public String toString(){

        return conjunto.toString();

    }
}