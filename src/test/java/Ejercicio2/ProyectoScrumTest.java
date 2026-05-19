package Ejercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProyectoScrumTest {

    @Test
    public void testTiempoHistoriaDeUsuarioConMultiplesTareas() {
        HistoriaDeUsuario historiaLogin = new HistoriaDeUsuario("Implementar Login");
        historiaLogin.agregarItem(new Tarea(5));
        historiaLogin.agregarItem(new Tarea(3));

        int tiempoObtenido = historiaLogin.obtenerTiempo();

        assertEquals(8, tiempoObtenido, "El tiempo de la historia debe ser la suma exacta del tiempo de sus tareas");
    }

    @Test
    public void testTiempoTotalProyectoConHistoriasYSpikes() {
        Proyecto proyecto = new Proyecto("App E-Commerce");

        HistoriaDeUsuario historiaCarrito = new HistoriaDeUsuario("Carrito de Compras");
        historiaCarrito.agregarItem(new Tarea(10));
        historiaCarrito.agregarItem(new Tarea(4));

        HistoriaDeUsuario historiaPagos = new HistoriaDeUsuario("Pasarela de Pagos");
        historiaPagos.agregarItem(new Tarea(8));

        Spike analisisSeguridad = new Spike(12);

        proyecto.agregarItem(historiaCarrito);
        proyecto.agregarItem(historiaPagos);
        proyecto.agregarItem(analisisSeguridad);

        int tiempoObtenido = proyecto.obtenerTiempo();


        assertEquals(34, tiempoObtenido, "El tiempo total del proyecto debe sumar la recursividad de todas sus historias y spikes");
    }
}