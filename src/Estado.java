class Estado {
    int x, y;
    int costo;

    public Estado(int x, int y) {
        this.x = x;
        this.y = y;
        this.costo = 0;
    }

    public Estado(int x, int y, int costo) {
        this.x = x;
        this.y = y;
        this.costo = costo;
    }
}