package Ejercicio4;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.Month;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorPrecioTest {

    @Test
    public void testCalculadorJubiladoSinPromocion() {
        Month mesSinPromo = LocalDate.now().plusMonths(1).getMonth();
        Calculador calculador = new CalculadorJubilado(mesSinPromo);

        double precioFinal = calculador.calcularPrecio(100.0);

        assertEquals(110.0, precioFinal, 0.01, "El precio final para jubilado sin promo debería ser 110.0");
    }

    @Test
    public void testCalculadorNoJubiladoConPromocion() {
        Month mesConPromo = LocalDate.now().getMonth();
        Calculador calculador = new CalculadorNoJubilado(mesConPromo);

        double precioFinal = calculador.calcularPrecio(100.0);

        assertEquals(100.0, precioFinal, 0.01, "El precio final para no jubilado con promo debería ser el base (100.0)");
    }

    @Test
    public void testCalculadorNoJubiladoSinPromocion() {
        Month mesSinPromo = LocalDate.now().plusMonths(1).getMonth();
        Calculador calculador = new CalculadorNoJubilado(mesSinPromo);

        double precioFinal = calculador.calcularPrecio(100.0);

        assertEquals(136.0, precioFinal, 0.01, "El precio final para no jubilado sin promo debería ser 136.0");
    }
}