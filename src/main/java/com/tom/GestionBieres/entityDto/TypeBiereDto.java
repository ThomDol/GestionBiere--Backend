package com.tom.GestionBieres.entityDto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeBiereDto {
    private Long idType;


    private String nomType;
}
