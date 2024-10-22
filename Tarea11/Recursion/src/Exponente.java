public class Exponente {
    public static int operacionExponente(int base, int exp){
        int res = 0;
        if(exp == 0){
            return 1;
        }
        if(exp > 0){
            res = base * (int)operacionExponente(base,exp-1);
        }
        return res;
    }
    public static void main(String[] args) {
        int base = 2;
        int exp = 3;
        System.out.println(base + " elevado a la potencia " + exp + " = " + operacionExponente(base,exp));
    }
}
