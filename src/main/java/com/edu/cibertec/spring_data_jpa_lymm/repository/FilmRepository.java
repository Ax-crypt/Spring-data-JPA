package com.edu.cibertec.spring_data_jpa_lymm.repository;

import com.edu.cibertec.spring_data_jpa_lymm.entity.Film;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<Film, Integer> {
    @Cacheable(value = "films")
    Iterable<Film> findAll();

    @CacheEvict(value = "films", allEntries = true)
    Film save(Film film);
}
