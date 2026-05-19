package Ejercicio4;

import java.time.Month;

public class CalculadorJubilado extends Calculador {

    public CalculadorJubilado(Month mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    protected double aplicarRecargos(double precioProducto) {
        return precioProducto * 0.10;
    }
}