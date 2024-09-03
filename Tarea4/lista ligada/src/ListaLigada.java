public class ListaLigada<T> {
    private Nodo<T> head;
    private int tamanio;

    public ListaLigada() {
    }

    public boolean estaVacia(){

        boolean resultado = false;

        if (this.head == null) {

            resultado = true;

        }

        return resultado;

    }

    public int getTamanio(){
        Nodo aux = this.head;
        int contador = 0;
        while (aux!=null){
            contador++;
            aux = aux.getSiguiente();


        }
        return contador;

    }

    public void agregarAlFinal(T dato){
        Nodo<T> nuevo = new Nodo<>(dato);
        if(head == null){
            head = nuevo;
        }else {
            Nodo<T> aux = this.head;
            while (aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public void agregarAlInicio(T dato){

        this.head = new Nodo<>(dato, this.head);

    }

    public void agregarDespuesDe(T referencia, T dato){

        Nodo<T> auxiliar = this.head;

        while (auxiliar.getDato() != referencia){

            auxiliar = auxiliar.getSiguiente();

        }

        auxiliar.setSiguiente(new Nodo<T>(dato,auxiliar.getSiguiente()));

    }

    public void eliminar(Integer pos){

        Nodo<T> aux = this.head;

        if(pos != 0) {
            for (int i = 0; i == pos; i++) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }else{
            this.head = this.head.getSiguiente();
        }
    }

    public void eliminarElPrimero(){

        this.head = this.head.getSiguiente();

    }

    public void eliminarElFinal(){
        Nodo<T> auxiliar = this.head;
        if (getTamanio() > 1){

            while (auxiliar.getSiguiente().getSiguiente() != null){

                auxiliar = auxiliar.getSiguiente();

            }

            auxiliar.setSiguiente(null);

        }else {

            this.head = null;

        }
    }

    public int buscar(T valor){

        if (estaVacia() == true){
            return -1;
        }
        Nodo<T> auxiliar = this.head;

        int contador = 0;

        while (auxiliar.getDato() != valor){

            auxiliar = auxiliar.getSiguiente();

            contador++;

        }

        return contador;

    }

    public void actualizar(T aBuscar,T dato){

        Nodo<T> auxiliar = this.head;

        while (auxiliar.getDato() != aBuscar){

            auxiliar = auxiliar.getSiguiente();

        }

        auxiliar.setDato(dato);

    }

    public void transversal(){
        Nodo<T> aux = this.head;
        while (aux != null){
            System.out.print(aux.getDato() + " --> ");
            aux = aux.getSiguiente();
        }
        System.out.print("null");
        System.out.println("");
    }


}
