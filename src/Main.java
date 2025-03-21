public class Main {

    public static void main(String[] args) {

        int[][] mapa = {
                {0, 1, 0, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0}
        };

        Laberinto laberinto = new Laberinto(mapa);
        Estado inicio = new Estado(0, 0);
        Estado meta = new Estado(4, 4);

        HillClimbing buscador = new HillClimbing(laberinto);
        Estado resultado = buscador.buscarCamino(inicio, meta);
        System.out.println("Estado final: (" + resultado.x + ", " + resultado.y + ")");
    }
}