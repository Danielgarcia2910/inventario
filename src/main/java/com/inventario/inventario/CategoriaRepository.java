package com.inventario.inventario;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class CategoriaRepository {
    private final Map<Long, Categoria> categorias = new HashMap<>();
    private long nextId = 1L;

    public Categoria guardar(Categoria categoria) {
        categoria.setId(nextId++);
        categorias.put(categoria.getId(), categoria);
        return categoria;
    }
    public List<Categoria> obtenerTodas() {
        return new ArrayList<>(categorias.values());
    }
    public Categoria buscarPorId(Long id) {
        return categorias.get(id);
    }

}