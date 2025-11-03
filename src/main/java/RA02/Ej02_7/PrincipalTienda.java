package RA02.Ej02_7;

// PrincipalTienda.java
public class PrincipalTienda {
    public static void main(String[] args) {
        Tienda tienda = new Tienda(10); // stock inicial de 10

        // Crear varios clientes (hilos)
        Cliente c1 = new Cliente("Cliente 1", tienda, 5);
        Cliente c2 = new Cliente("Cliente 2", tienda, 8);
        Cliente c3 = new Cliente("Cliente 3", tienda, 3);

        // Iniciar los hilos
        c1.start();
        c3.start();
        c2.start();
    }
}

