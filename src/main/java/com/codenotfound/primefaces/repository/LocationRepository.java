package com.codenotfound.primefaces.repository;

import com.codenotfound.primefaces.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Integer> {
}
