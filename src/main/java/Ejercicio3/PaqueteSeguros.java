package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class PaqueteSeguros implements ItemSeguro {
    private List<ItemSeguro> elementos;

    public PaqueteSeguros() {
        this.elementos = new ArrayList<>();
    }

    public void agregar(ItemSeguro item) {
        this.elementos.add(item);
    }

    public void remover(ItemSeguro item) {
        this.elementos.remove(item);
    }

    @Override
    public double calcularCosto() {
        double costoSuma = 0;

        for (ItemSeguro item : elementos) {
            costoSuma += item.calcularCosto();
        }

        double costoFinal = costoSuma;
        for (int i = 0; i < elementos.size(); i++) {
            costoFinal -= (costoFinal * 0.05);
        }

        return costoFinal;
    }
}