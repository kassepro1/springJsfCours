package com.codenotfound.primefaces.repository;

import com.codenotfound.primefaces.model.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeRepository  extends JpaRepository<Vehicule, Integer> {

    Vehicule findVehiculeByMatricule(String matricule);
}
