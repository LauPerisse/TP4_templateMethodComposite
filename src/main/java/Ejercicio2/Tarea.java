package Ejercicio2;

public class Tarea implements ItemScrum {
    private int tiempoEstimado;

    public Tarea(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    @Override
    public int obtenerTiempo() {
        return this.tiempoEstimado;
    }
}