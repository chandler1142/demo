package com.pcf.example.demo.repo;

import com.pcf.example.demo.entity.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "cities", path = "cities")
public interface CityRepo extends PagingAndSortingRepository<City, Long> {

    Page<City> findAll(Pageable pageable);

    @RestResource(exported = false)
    Optional<City> findById(Long id);

    @RestResource(path = "name", rel = "name", exported = true)
    Page<City> findByNameIgnoreCase(@Param("q") String name, Pageable pageable);

}
