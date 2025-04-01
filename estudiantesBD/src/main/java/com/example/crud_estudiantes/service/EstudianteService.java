package com.example.crud_estudiantes.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.crud_estudiantes.model.Estudiante;
import com.example.crud_estudiantes.repository.EstudianteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> listarEstudiantes() {
        return estudianteRepository.findAll();
    }

    public Optional<Estudiante> obtenerEstudiante(Long id) {
        return estudianteRepository.findById(id);
    }

    public Estudiante crearEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public Optional<Estudiante> actualizarEstudiante(Long id, Estudiante estudianteActualizado) {
        return estudianteRepository.findById(id).map(estudiante -> {
            estudiante.setNombre(estudianteActualizado.getNombre());
            estudiante.setApellido(estudianteActualizado.getApellido());
            estudiante.setEmail(estudianteActualizado.getEmail());
            estudiante.setFechaNacimiento(estudianteActualizado.getFechaNacimiento());
            estudiante.setNumeroInscripcion(estudianteActualizado.getNumeroInscripcion());
            return estudianteRepository.save(estudiante);
        });
    }

    public boolean eliminarEstudiante(Long id) {
        if (estudianteRepository.existsById(id)) {
            estudianteRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
