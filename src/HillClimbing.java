class HillClimbing {
    private final Laberinto laberinto;
    private final int[][] movimientos = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public HillClimbing(Laberinto laberinto) {
        this.laberinto = laberinto;
    }

    public Estado buscarCamino(Estado inicio, Estado meta) {
        Estado actual = inicio;
        while (actual.x != meta.x || actual.y != meta.y) {
            Estado mejorVecino = actual;
            int mejorCosto = calcularHeuristica(actual, meta);

            for (int[] mov : movimientos) {
                int nuevoX = actual.x + mov[0];
                int nuevoY = actual.y + mov[1];
                if (laberinto.esValido(nuevoX, nuevoY)) {
                    Estado vecino = new Estado(nuevoX, nuevoY, calcularHeuristica(new Estado(nuevoX, nuevoY), meta));
                    if (vecino.costo < mejorCosto) {
                        mejorVecino = vecino;
                        mejorCosto = vecino.costo;
                    }
                }
            }

            if (mejorVecino == actual) {
                System.out.println("No se encontró una mejor solución.");
                return actual;
            }
            actual = mejorVecino;
            System.out.println("Moviendo a: (" + actual.x + ", " + actual.y + ")");
        }
        return actual;
    }

    private int calcularHeuristica(Estado actual, Estado meta) {
        return Math.abs(actual.x - meta.x) + Math.abs(actual.y - meta.y);
    }
}