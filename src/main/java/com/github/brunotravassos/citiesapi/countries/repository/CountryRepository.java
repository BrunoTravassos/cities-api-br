package com.github.brunotravassos.citiesapi.countries.repository;

import com.github.brunotravassos.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
