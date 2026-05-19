package Ejercicio1;

public class EmpleadoRegular implements Empleado {
    private final double salarioBase;

    public EmpleadoRegular(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double obtenerSalario() {
        return this.salarioBase;
    }
}