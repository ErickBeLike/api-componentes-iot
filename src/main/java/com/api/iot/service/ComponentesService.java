package com.api.iot.service;

import com.api.iot.model.Componentes;
import com.api.iot.repository.ComponentesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ComponentesService {
    private final ComponentesRepository componentesRepository;

    public void save(Componentes componentes) {
        componentesRepository.save(componentes);
    }

    public void update(Componentes componentes) {
        // Verifica si el componente existe antes de actualizarlo
        if (componentes.getId() != null && componentesRepository.existsById(componentes.getId())) {
            componentesRepository.save(componentes);
        } else {
            throw new IllegalArgumentException("El componente no existe o no se puede actualizar.");
        }
    }

    public List<Componentes> findAll() {
        return componentesRepository.findAll();
    }

    public Optional<Componentes> findById(String id) {
        return componentesRepository.findById(id);
    }

    public void deleteById(String id) {
        componentesRepository.deleteById(id);
    }
}
