package Ejercicio5;

public class RemeraImportada extends Remera {

    public RemeraImportada(double precioUnitarioBase) {
        super(precioUnitarioBase);
    }

    @Override
    protected double calcularModificadoresSobrePrecioBase(double precioBase) {
        double recargo = precioBase * 0.03;
        double impuestoAduanero = precioBase * 0.05;

        return recargo + impuestoAduanero;
    }

    @Override
    protected double porcentajeMargenComercio() {
        return 0.25;
    }
}