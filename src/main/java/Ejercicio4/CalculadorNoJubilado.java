package Ejercicio4;

import java.time.Month;

public class CalculadorNoJubilado extends Calculador {

    public CalculadorNoJubilado(Month mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    protected double aplicarRecargos(double precioProducto) {
        return (precioProducto * 0.15) + (precioProducto * 0.21);
    }
}