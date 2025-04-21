package EjerciciosJava.Practico_colecciones;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // KATA 1
        Producto p1 = new Producto("A1", "Pan", 200, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E1", "Celular", 1500, 15, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R1", "Camisa", 500, 20, CategoriaProducto.ROPA);
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);

        System.out.println("----- Listado de productos (Kata 1) -----");
        inventario.listarProductos();

        // KATA 2
        Producto p4 = new Producto("H1", "Silla", 1000, 10, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("E2", "Auriculares", 1200, 5, CategoriaProducto.ELECTRONICA);
        Producto p6 = new Producto("A2", "Leche", 300, 25, CategoriaProducto.ALIMENTOS);
        Producto p7 = new Producto("R2", "Pantalón", 800, 18, CategoriaProducto.ROPA);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        inventario.agregarProducto(p6);
        inventario.agregarProducto(p7);

        System.out.println("\n----- Buscar producto por ID: 'E1' (Kata 2) -----");
        Producto buscado = inventario.buscarProductoPorId("E1");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("\n----- Filtrar productos ELECTRONICA (Kata 2) -----");
        for (Producto p : inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA)) {
            p.mostrarInfo();
        }

        System.out.println("\n----- Eliminar producto ID 'A1' y listar (Kata 2) -----");
        inventario.eliminarProducto("A1");
        inventario.listarProductos();

        // KATA 3
        System.out.println("\n----- Total de stock (Kata 3) -----");
        System.out.println("Total en stock: " + inventario.obtenerTotalStock());

        System.out.println("\n----- Producto con mayor stock (Kata 3) -----");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) mayorStock.mostrarInfo();

        System.out.println("\n----- Productos con precio entre $1000 y $3000 (Kata 3) -----");
        for (Producto p : inventario.filtrarProductosPorPrecio(1000, 3000)) {
            p.mostrarInfo();
        }

        System.out.println("\n----- Categorías disponibles con descripciones (Kata 3) -----");
        inventario.mostrarCategoriasDisponibles();
    }
}
