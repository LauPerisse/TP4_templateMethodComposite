package Ejercicio2;

public class Spike implements ItemScrum {
    private int tiempoEstimado;

    public Spike(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    @Override
    public int obtenerTiempo() {
        return this.tiempoEstimado;
    }
}