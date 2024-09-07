public class Main {
    public static void main(String[] args) {

        DoubleLinkedList<Integer> ll = new DoubleLinkedList<>();

        ll.agregarAlInicio(50);
        ll.agregarAlFinal(60);
        ll.agregarAlFinal(65);
        ll.agregarAlFinal(70);
        ll.agregarAlFinal(80);
        ll.agregarAlFinal(90);
        ll.transversal(0);
        ll.eliminar(2);
        ll.transversal(0);
        ll.actualizar(80,88);
        ll.transversal(0);
        ll.buscar(80);
        System.out.println(ll.buscar(88));
        //en la tarea pide encontrar el elemnto 80, el 4to elemento era antes 80
        //y fue actualizado a 88
        //no se si queria que actializaramos 90 (poscicion 4, quinto elemento)
        //o que encontrasemos 88
        //de todas maneras al buscar 80 que no existe solo imprimirá un mensaje de error
    }
}