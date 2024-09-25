import java.util.Stack;

public class Balanceador {
    public static boolean sonBalanceados(String texto) {
        Pila pila = new Pila();
        char[] caracteres = texto.toCharArray();
        for (char c : caracteres) {
            if (c == '{' || c == '(') {
                pila.push(c);
            } else if (c == '}' || c == ')') {
                if (pila.estaVacia()) {
                    return false;
                }
                char ultimo = (char) pila.pop();
                if ((c == '}' && ultimo != '{') || (c == ')' && ultimo != '(')) {
                    return false;
                }
            }
        }
        return pila.estaVacia();
    }
}