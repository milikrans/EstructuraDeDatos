import java.util.List;

public class Main {

    private static void Imprimir(Nodo<Integer> head) {
        Nodo<Integer> aux = head;
        System.out.print("|");
        while (aux != null) {
            System.out.print(aux.getDato() + "| -> |");
            aux = aux.getSiguiente();
        }
        System.out.print("null| \n");
    }

    public static void main(String[] args) {

        Nodo<Integer> head = new Nodo<>(null, null);

        //hace setup de nodos
        Nodo <Integer> auxiliar = head;

        List<Integer> listaA = List.of(100,200,300,400,600);
        for (Integer item: listaA){
            if (auxiliar.getDato() == null){

                auxiliar.setDato(item);

            }else {

                auxiliar.setSiguiente(new Nodo<Integer>(item, null));
                auxiliar = auxiliar.getSiguiente();
            }
        }

        Imprimir(head);

        head.getSiguiente().getSiguiente().setDato(333);

        Imprimir(head);

        head.getSiguiente().getSiguiente().getSiguiente().getSiguiente().setSiguiente(new Nodo<Integer>(700,null));

        Imprimir(head);

        Nodo <Integer> head2 = new Nodo<>(50, head);

        Imprimir(head2);

    }
}
