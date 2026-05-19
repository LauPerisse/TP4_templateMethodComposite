package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public abstract class EmpleadoJerarquico implements Empleado {
    private final double salarioPropio;
    private final List<Empleado> subordinados;

    public EmpleadoJerarquico(double salarioPropio) {
        this.salarioPropio = salarioPropio;
        this.subordinados = new ArrayList<>();
    }

    public void agregarSubordinado(Empleado empleado) {
        this.subordinados.add(empleado);
    }

    @Override
    public double obtenerSalario() {
        double salarioTotal = this.salarioPropio;

        for (Empleado empleado : subordinados) {
            salarioTotal += empleado.obtenerSalario();
        }
        return salarioTotal;
    }
}