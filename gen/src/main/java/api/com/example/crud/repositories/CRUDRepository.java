// CRUDRepository.java

package com.example.crud.repositories;

import com.example.crud.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface CRUDRepository extends CrudRepository<Person, Long> {
}

