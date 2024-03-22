package com.api.iot.controller;

import com.api.iot.model.Componentes;
import com.api.iot.service.ComponentesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ComponentesController {

    private final ComponentesService componentesService;

    @PostMapping("/componentes")
    public void save(@RequestBody Componentes componentes) {
        componentesService.save(componentes);
    }

    @GetMapping("componentes")
    public Map<String, Integer> findAll() {
        List<Componentes> componentesList = componentesService.findAll();

        // Crear un mapa para almacenar los elementos y sus estados
        Map<String, Integer> elementosMap = new HashMap<>();

        // Iterar sobre la lista de componentes y agregarlos al mapa
        for (Componentes componente : componentesList) {
            elementosMap.put(componente.getElemento(), componente.getStatus());
        }

        return elementosMap;
    }

    @GetMapping("/componentes/{id}")
    public Componentes findById(@PathVariable String id) {
        return componentesService.findById(id).get();
    }

    @DeleteMapping("/componentes/{id}")
    public void deleteById(@PathVariable String id) {
        componentesService.deleteById(id);
    }

    @PutMapping("/componentes/{id}")
    public void update(@PathVariable String id, @RequestBody Componentes componentes) {
        // Asegúrate de que el componente tenga el ID correcto
        componentes.setId(id);
        componentesService.save(componentes);
    }
}
