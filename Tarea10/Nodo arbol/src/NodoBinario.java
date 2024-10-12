import java.util.Objects;

public class NodoBinario<T> {
    private T dato;
    private NodoBinario<T> hijoIzquierdo;
    private NodoBinario<T> hijoDerecho;

    public NodoBinario() {
    }

    public NodoBinario(T dato) {
        this.dato = dato;
    }

    public NodoBinario(T dato, NodoBinario<T> hijoIzquierdo, NodoBinario<T> hijoDerecho) {
        this.dato = dato;
        this.hijoIzquierdo = hijoIzquierdo;
        this.hijoDerecho = hijoDerecho;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoBinario<T> getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoBinario<T> hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoBinario<T> getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoBinario<T> hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        NodoBinario<?> nodoArbol = (NodoBinario<?>) object;
        return Objects.equals(dato, nodoArbol.dato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dato);
    }

    @Override
    public String toString() {
        return "NodoArbol{" + "dato=" + dato + "\n" +
                "   hijoIzquierdo=" + hijoIzquierdo + "\n" +
                "   hijoDerecho=" + hijoDerecho +
                '}';
    }
}
