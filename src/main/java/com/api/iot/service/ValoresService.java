package com.api.iot.service;

import com.api.iot.model.Valores;
import com.api.iot.repository.ValoresRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ValoresService {
    private  final ValoresRepository valoresRepository;

    public void save(Valores valores) {
        valoresRepository.save(valores);
    }

    public List<Valores> findAll() {
        return valoresRepository.findAll();
    }

    public Optional<Valores> findById(String id) {
        return valoresRepository.findById(id);
    }

    public void deleteById(String id) {
        valoresRepository.deleteById(id);
    }
}
