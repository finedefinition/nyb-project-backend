package com.norwayyachtbrockers.repository;

import com.norwayyachtbrockers.model.Town;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "towns", path = "towns")
public interface TownRepository extends JpaRepository<Town, Long> {
}
