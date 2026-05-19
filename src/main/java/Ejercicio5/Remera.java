package Ejercicio5;

public abstract class Remera {
    private double precioUnitarioBase;

    public Remera(double precioUnitarioBase) {
        this.precioUnitarioBase = precioUnitarioBase;
    }


    public final double calcularPrecioFinal() {
        double precioAcumulado = this.precioUnitarioBase;

        precioAcumulado += calcularModificadoresSobrePrecioBase(this.precioUnitarioBase);

        precioAcumulado += (precioAcumulado * porcentajeMargenComercio());

        return precioAcumulado;
    }

    protected abstract double calcularModificadoresSobrePrecioBase(double precioBase);

    protected abstract double porcentajeMargenComercio();

    public double precioUnitarioBase() {
        return precioUnitarioBase;
    }
}