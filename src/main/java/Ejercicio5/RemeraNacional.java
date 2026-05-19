package Ejercicio5;

public class RemeraNacional extends Remera {

    public RemeraNacional(double precioUnitarioBase) {
        super(precioUnitarioBase);
    }

    @Override
    protected double calcularModificadoresSobrePrecioBase(double precioBase) {
        double recargoTransporte = precioBase * 0.015;
        double bonificacion = precioBase * 0.20;

        return recargoTransporte - bonificacion;
    }

    @Override
    protected double porcentajeMargenComercio() {
        return 0.15;
    }
}