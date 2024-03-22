package com.api.iot.repository;

import com.api.iot.model.Componentes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponentesRepository extends MongoRepository<Componentes, String> {
}
