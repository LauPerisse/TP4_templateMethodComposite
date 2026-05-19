package Ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpresaSalarioTest {

    @Test
    public void testCalcularSalarioDeMandoMedioConSubordinados() {
        MandoMedio mandoMedio = new MandoMedio(2000.0);
        LiderDeProyecto lider = new LiderDeProyecto(1500.0);
        EmpleadoRegular empleado1 = new EmpleadoRegular(1000.0);
        EmpleadoRegular empleado2 = new EmpleadoRegular(1000.0);

        lider.agregarSubordinado(empleado1);
        lider.agregarSubordinado(empleado2);
        mandoMedio.agregarSubordinado(lider);

        double salarioTotal = mandoMedio.obtenerSalario();

        assertEquals(5500.0, salarioTotal,
                "El salario del mando medio y sus subordinados debe sumar 5500.0");
    }

    @Test
    public void testCalcularSalarioTotalTodaLaEmpresa() {
        Director director = new Director(5000.0);
        Gerente gerente = new Gerente(3000.0);
        MandoMedio mandoMedio = new MandoMedio(2000.0);
        LiderDeProyecto lider = new LiderDeProyecto(1500.0);
        EmpleadoRegular regular = new EmpleadoRegular(1000.0);

        lider.agregarSubordinado(regular);
        mandoMedio.agregarSubordinado(lider);
        gerente.agregarSubordinado(mandoMedio);
        director.agregarSubordinado(gerente);

        double salarioEmpresa = director.obtenerSalario();

        assertEquals(12500.0, salarioEmpresa,
                "El salario total de la empresa (raíz) debe sumar 12500.0");
    }
}