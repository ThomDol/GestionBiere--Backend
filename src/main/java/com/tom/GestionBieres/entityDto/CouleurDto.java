package com.tom.GestionBieres.entityDto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CouleurDto {
    private int idCouleur;


    private String nomCouleur;
}

