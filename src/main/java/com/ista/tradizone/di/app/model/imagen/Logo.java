package com.ista.tradizone.di.app.model.imagen;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document(collection = "logos")
public class Logo extends Imagen{
    
    /** Relaciones: --------------------------------- */
    private String idRestaurante;
}
