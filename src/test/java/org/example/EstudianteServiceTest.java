package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstudianteServiceTest {

    @Test
    void testAgregarYListar() {
        EstudianteService service = new EstudianteService();
        service.agregar(new Estudiante(1, "Juan Lopez"));

        assertEquals(1, service.listar().size());
    }

    @Test
    void testBuscar() {
        EstudianteService service = new EstudianteService();
        service.agregar(new Estudiante(1, "Ana Perz"));

        assertNotNull(service.buscarPorId(1));
    }

    @Test
    void testActualizar() {
        EstudianteService service = new EstudianteService();
        service.agregar(new Estudiante(1, "Luis Gomez"));

        service.actualizar(1, "Carlos");
        assertEquals("Carlos", service.buscarPorId(1).getNombre());
    }

    @Test
    void testEliminar() {
        EstudianteService service = new EstudianteService();
        service.agregar(new Estudiante(1, "Pedro Salgado"));

        assertTrue(service.eliminar(1));
        assertNull(service.buscarPorId(1));
    }
}
