package com.api.iot.controller;

import com.api.iot.model.Valores;
import com.api.iot.service.ValoresService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ValoresController {

    private final ValoresService valoresService;

    @PostMapping("/valores")
    public void save(@RequestBody Valores valores) {
        valoresService.save(valores);
    }

    @GetMapping("valores")
    public List<Valores> findAll() {
        return valoresService.findAll();
    }

    @GetMapping("/valores/{id}")
    public Valores findById(@PathVariable String id) {
        return valoresService.findById(id).get();
    }

    @DeleteMapping("/valores/{id}")
    public void deleteById(@PathVariable String id) {
        valoresService.deleteById(id);
    }

    @PutMapping("valores")
    public void update(@RequestBody Valores valores) {
        valoresService.save(valores);
    }
}
