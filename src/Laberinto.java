class Laberinto {
    private final int[][] mapa;
    private final int filas, columnas;

    public Laberinto(int[][] mapa) {
        this.mapa = mapa;
        this.filas = mapa.length;
        this.columnas = mapa[0].length;
    }

    public boolean esValido(int x, int y) {
        return x >= 0 && x < filas && y >= 0 && y < columnas && mapa[x][y] == 0;
    }
}
