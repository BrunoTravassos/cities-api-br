package com.github.brunotravassos.citiesapi.states.repository;

import com.github.brunotravassos.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
