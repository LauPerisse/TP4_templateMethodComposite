package Ejercicio4;

import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Logger;

public abstract class Calculador {

    private final Month mesEnPromocion;
    private static final Logger logger = Logger.getLogger(Calculador.class.getName());

    public Calculador(Month mesEnPromocion) {
        this.mesEnPromocion = mesEnPromocion;
    }

    public final double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;

        if (!LocalDate.now().getMonth().equals(mesEnPromocion)) {
            precioTotal += aplicarRecargos(precioProducto);
        }

        registrarLog();

        return precioTotal;
    }

    protected abstract double aplicarRecargos(double precioProducto);

    private void registrarLog() {
        logger.info("Cálculo realizado por: " + this.getClass().getName());
    }
}