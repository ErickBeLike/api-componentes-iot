package com.api.iot.repository;

import com.api.iot.model.Valores;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValoresRepository extends MongoRepository <Valores, String> {
}
