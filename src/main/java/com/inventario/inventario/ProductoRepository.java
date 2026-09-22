package com.inventario.inventario;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository 
public class ProductoRepository {
    private final Map<Long, Producto> productos = new HashMap<>();
    private long nextId = 1L;

    public Producto guardar(Producto producto) {
        producto.setId(nextId++);
        productos.put(producto.getId(), producto);
        return producto;
    }

    public List<Producto> obtenerTodas() {
        return new ArrayList<>(productos.values());
    }

    public Producto buscarPorId(Long id) {
        return productos.get(id);
    }

    public void eliminar(Long id) {
        productos.remove(id);
    }

    

    public void actualizar(Producto producto) {
        productos.put(producto.getId(), producto);
    }
}
