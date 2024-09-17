public class Main {
    public static void main(String[] args) {
    GameOfLife cgol = new GameOfLife(10,10);
    cgol.setCelula(0,0,'v');
    cgol.setCelula(0,2,'v');
    cgol.setCelula(1,1,'v');
    cgol.setCelula(1,2,'v');
    cgol.setCelula(2,1,'v');
    cgol.imprimirTablero();
        for (int i = 0; i < 10; i++) {
            cgol.nuevaGeneracion();
            cgol.imprimirTablero();
        }
    }
}