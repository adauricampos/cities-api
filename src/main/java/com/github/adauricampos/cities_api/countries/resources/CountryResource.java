package com.github.adauricampos.cities_api.countries.resources;

import com.github.adauricampos.cities_api.countries.entities.Country;
import com.github.adauricampos.cities_api.countries.repositories.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.List;

@RestController
public class CountryResource {


    private CountryRepository repository;

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/countries")
    public List<Country> cities() {

        return repository.findAll();
    }

}
