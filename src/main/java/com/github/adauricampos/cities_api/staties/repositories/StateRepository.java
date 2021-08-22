package com.github.adauricampos.cities_api.staties.repositories;

;
import com.github.adauricampos.cities_api.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
