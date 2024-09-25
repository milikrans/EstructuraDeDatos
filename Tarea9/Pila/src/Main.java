public class Main {
    public static void main(String[] args) {
        Balanceador eval = new Balanceador();

        String textoPrueba = "(este es){un ejemplo}(buen{ejemplo})";
        String textoPrueba2 = "(este es){un ejemplo}(mal{ejemplo)";

        if (eval.sonBalanceados(textoPrueba)) {
            System.out.println("Las llaves y paréntesis están balanceados.");
        } else {
            System.out.println("Las llaves y paréntesis NO están balanceados.");
        }
        if (eval.sonBalanceados(textoPrueba2)) {
            System.out.println("Las llaves y paréntesis están balanceados.");
        } else {
            System.out.println("Las llaves y paréntesis NO están balanceados.");
        }
    }
}