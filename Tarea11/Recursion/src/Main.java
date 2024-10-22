import java.util.List;

public class Main {
    public static void eliminarMedio (Pila pila) {
        Pila aux = new Pila();
        int cont = 0;
        while ((int) pila.peek() != -1) {
            cont++;
            aux.push(pila.pop());
        }
        if (cont%2 == 1) {
            for (int i = 0; i < cont / 2; i++) {
                pila.push(aux.pop());
            }
            aux.pop();
            for (int i = 0; i < cont / 2; i++) {
                pila.push(aux.pop());
            }
        }else{
            for (int i = 0; i < (cont / 2)-1; i++) {
                pila.push(aux.pop());
            }
            aux.pop();
            aux.pop();
            for (int i = 0; i < (cont / 2)-1; i++) {
                pila.push(aux.pop());
            }
        }

    }
    public static void main(String[] args) {
        Pila pila1 = new Pila();
        pila1.push(-1);
        List<Integer> lista = List.of(1,2,3,4,5,6,7);
        for (Integer item:lista) {
            pila1.push(item);
        }
        System.out.println(pila1);
        eliminarMedio(pila1);
        System.out.println(pila1);


    }
}
