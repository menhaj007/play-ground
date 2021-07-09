package com.shownight.night.repositories;

import com.shownight.night.models.Viewer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewerRepository extends CrudRepository<Viewer, Long> {
}
