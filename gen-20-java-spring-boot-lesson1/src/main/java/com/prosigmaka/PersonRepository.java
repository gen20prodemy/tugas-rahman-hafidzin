package com.prosigmaka;

import com.prosigmaka.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface PersonRepository
        extends JpaRepository<PersonModel, Integer> {
}
