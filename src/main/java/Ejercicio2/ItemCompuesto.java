package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public abstract class ItemCompuesto implements ItemScrum {
    private final List<ItemScrum> elementos = new ArrayList<>();

    public void agregarItem(ItemScrum item) {
        this.elementos.add(item);
    }

    @Override
    public int obtenerTiempo() {
        int tiempoTotal = 0;
        for (ItemScrum item : elementos) {
            tiempoTotal += item.obtenerTiempo();
        }
        return tiempoTotal;
    }
}