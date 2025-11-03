package RA02.Ej02_7;

// Tienda.java
public class Tienda {
    private int stock;

    public Tienda(int stockInicial) {
        this.stock = stockInicial;
    }

    // Método sincronizado para evitar condiciones de carrera
    public synchronized void comprarProducto(String nombreCliente, int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println(nombreCliente + " compró " + cantidad + " productos.");
            System.out.println("Stock disponible: " + stock);
        } else {
            System.out.println(nombreCliente + " intentó comprar " + cantidad +
                    " productos, pero no hay suficiente stock.");
        }
    }
}

