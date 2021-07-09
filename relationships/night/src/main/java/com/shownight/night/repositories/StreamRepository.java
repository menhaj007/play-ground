package com.shownight.night.repositories;

import com.shownight.night.models.Stream;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamRepository extends CrudRepository<Stream, Long> {
}
