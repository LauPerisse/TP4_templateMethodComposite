package Ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SegurosTest {

    @Test
    public void testCostoSeguroIndividual() {
        ItemSeguro seguroAuto = new SeguroIndividual("Auto Todo Riesgo", TipoSeguro.AUTOMOVIL, 2000.0);

        assertEquals(2000.0, seguroAuto.calcularCosto(), "El costo individual debe ser igual al precio base");
    }

    @Test
    public void testCostoPaqueteComplejoConDescuentoAcumulativo() {
        ItemSeguro seguroHogar = new SeguroIndividual("Hogar Premium", TipoSeguro.HOGAR, 1000.0);
        ItemSeguro seguroMedico = new SeguroIndividual("Cobertura Médica Base", TipoSeguro.MEDICOS, 3000.0);

        PaqueteSeguros paqueteFamiliar = new PaqueteSeguros();
        paqueteFamiliar.agregar(seguroHogar);
        paqueteFamiliar.agregar(seguroMedico);

        // Suma base: 1000.0 + 3000.0 = 4000.0
        // Descuento iteración 1 (5% de 4000): 4000 - 200 = 3800.0
        // Descuento iteración 2 (5% de 3800): 3800 - 190 = 3610.0
        double costoEsperado = 3610.0;

        assertEquals(costoEsperado, paqueteFamiliar.calcularCosto(), 0.01,
                "El costo del paquete debe aplicar el 5% de descuento acumulativo por cada seguro");
    }
}