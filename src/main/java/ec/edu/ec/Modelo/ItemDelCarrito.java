package ec.edu.ec.Modelo;

public class ItemDelCarrito {
    private Producto producto;
    private int cantidad;

    public ItemDelCarrito(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal(){
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return "ItemDelCarrito{" +
                "cantidad=" + cantidad +
                ", producto=" + producto +
                '}';
    }
}
