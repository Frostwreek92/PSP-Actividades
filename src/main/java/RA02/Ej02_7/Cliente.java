package RA02.Ej02_7;

// Cliente.java
public class Cliente extends Thread {
    private Tienda tienda;
    private int cantidad;

    public Cliente(String nombre, Tienda tienda, int cantidad) {
        super(nombre); // asigna el nombre del hilo (cliente)
        this.tienda = tienda;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        tienda.comprarProducto(getName(), cantidad);
    }
}

