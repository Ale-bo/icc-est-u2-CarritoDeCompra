package ec.edu.ec.Servicio;
import ec.edu.ec.Modelo.ItemDelCarrito;
import ec.edu.ec.Modelo.Producto;

import java.util.ArrayList;

public class CarritoDeCompras {
    private ArrayList<ItemDelCarrito> items = new ArrayList<>();

    public void addItem(Producto producto, int cantidad) {
        if (cantidad <= 0) return;
        for (ItemDelCarrito item : items) {
        }
    }
}
