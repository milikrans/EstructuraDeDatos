public class GameOfLife {
    private Array2d tablero;
    private int ren;
    private int col;

    public Array2d getCuadricula() {
        return tablero;
    }

    public void setCuadricula(Array2d cuadricula) {
        this.tablero = cuadricula;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRows() {
        return ren;
    }

    public void setRows(int rows) {
        this.ren = rows;
    }

    public GameOfLife() {
        this.col = 0;
        this.ren = 0;
        this.tablero = null;
    }

    public GameOfLife(int renglones, int columnas) {
        this.ren = renglones;
        this.col = columnas;
        this.tablero = new Array2d(renglones, columnas);
        tablero.clear('m');
    }

    public void setCelula(int renglon, int columna, char VoM) {
        if (VoM == 'v') {
            tablero.setItem(renglon, columna, 'v');
        }else{
            tablero.setItem(renglon, columna, 'm');
        }

    }

    public char getCelula(int renglon, int columna) {

        return this.tablero.getItem(renglon, columna);

    }

    public void imprimirTablero() {
        for (int i = 0; i < tablero.getRowSize(); i++) {
            for (int j = 0; j < tablero.getColSize(); j++) {
                if (getCelula(i, j) == 'v') {
                    System.out.print(" " + '■' + " ");
                } else {
                    System.out.print(" " + "□" + " ");
                }
            }
            System.out.println("");
        }
    }

    public int contarVecinos(int renglon, int columna) {
        int cuenta = 0;
        for (int i = renglon - 1; i <= renglon + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                if ((i == renglon && j == columna) || i < 0 || j < 0 || i >= this.ren || j >= this.ren) {
                    continue;
                } else {
                    if (getCelula(i, j) == 'v') {
                        cuenta++;
                    }
                }
            }
        }
        return cuenta;
    }

    public void nuevaGeneracion() {
        System.out.println("૮꒰ ˶• ༝ •˶꒱ა ♡ . ݁₊ ⊹ . ݁˖ . ݁ . ݁₊ ⊹ . ݁˖ . ݁ . ݁₊ ⊹ . ݁˖ . ݁ . ݁₊ ⊹ . ݁˖ . ݁ . ݁₊ ⊹ . ݁˖ . ݁ . ݁₊ ⊹ . ݁˖ . ݁");
        Array2d nuevoTablero = new Array2d(this.ren,this.col);
        nuevoTablero.clear('m');
        for (int i = 0; i < ren; i++) {
            for (int j = 0; j < col; j++) {
                int vecinos = contarVecinos(i,j);
                if (getCelula(i,j) == 'v'){
                    if(vecinos < 2 || vecinos > 3){
                        nuevoTablero.setItem(i,j,'m');
                    }else{
                        nuevoTablero.setItem(i,j,'v');                    }
                }else{
                    if (vecinos == 3){
                        nuevoTablero.setItem(i,j,'v');
                    }else{
                        nuevoTablero.setItem(i,j,'m');
                    }
                }
            }
        }
        this.tablero=nuevoTablero;

    }
}





