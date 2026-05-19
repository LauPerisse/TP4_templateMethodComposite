package Ejercicio3;

public class SeguroIndividual implements ItemSeguro {
    private String nombre;
    private TipoSeguro tipo;
    private double precioBase;

    public SeguroIndividual(String nombre, TipoSeguro tipo, double precioBase) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioBase = precioBase;
    }

    @Override
    public double calcularCosto() {
        return this.precioBase;
    }

    public TipoSeguro getTipo() {
        return tipo;
    }
}