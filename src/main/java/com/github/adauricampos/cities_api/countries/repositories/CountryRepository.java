package com.github.adauricampos.cities_api.countries.repositories;


import com.github.adauricampos.cities_api.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
    }
