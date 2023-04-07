package com.upes.devopsproj.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.upes.devopsproj.entity.Product;
import com.upes.devopsproj.entity.Workers;


@RepositoryRestResource(collectionResourceRel = "workers", path = "workers")
public interface WorkerRepository  extends JpaRepository<Workers, Long> {
	
	 List<Workers> findAllById(Long id);

}
