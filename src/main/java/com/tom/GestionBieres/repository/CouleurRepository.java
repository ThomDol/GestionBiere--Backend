package com.tom.GestionBieres.repository;

import com.tom.GestionBieres.entity.Couleur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouleurRepository  extends JpaRepository <Couleur,Long> {
}
