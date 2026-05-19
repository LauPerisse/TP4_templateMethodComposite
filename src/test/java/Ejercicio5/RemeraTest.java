package Ejercicio5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemeraTest {

    @Test
    public void calcularPrecioRemeraImportada() {
        Remera importada = new RemeraImportada(1000.0);

        double precioFinal = importada.calcularPrecioFinal();

        // Base: 1000
        // Recargo (3%): 30
        // Impuesto (5%): 50
        // Acumulado: 1000 + 30 + 50 = 1080
        // Margen (25% sobre 1080): 270
        // Esperado: 1080 + 270 = 1350.0
        assertEquals(1350.0, precioFinal, 0.01, "El cálculo de la remera importada es incorrecto");
    }

    @Test
    public void calcularPrecioRemeraNacional() {
        Remera nacional = new RemeraNacional(1000.0);

        double precioFinal = nacional.calcularPrecioFinal();

        // Base: 1000
        // Recargo de transporte (1.5%): 15
        // Bonificación (-20%): -200
        // Acumulado: 1000 + 15 - 200 = 815
        // Margen (15% sobre 815): 122.25
        // Esperado: 815 + 122.25 = 937.25
        assertEquals(937.25, precioFinal, 0.01, "El cálculo de la remera nacional es incorrecto");
    }
}