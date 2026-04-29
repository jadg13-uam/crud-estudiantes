package org.example;

import java.util.ArrayList;
import java.util.List;

public class EstudianteService {
    private List<Estudiante> lista = new ArrayList<>();

    public void agregar(Estudiante e) {
        lista.add(e);
    }

    public List<Estudiante> listar() {
        return lista;
    }

    public Estudiante buscarPorId(int id) {
        return lista.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean actualizar(int id, String nuevoNombre) {
        Estudiante e = buscarPorId(id);
        if (e != null) {
            e.setNombre(nuevoNombre);
            return true;
        }
        return false;
    }

    public boolean eliminar(int id) {
        return lista.removeIf(e -> e.getId() == id);
    }
}
