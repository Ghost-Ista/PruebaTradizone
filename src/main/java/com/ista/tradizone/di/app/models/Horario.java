package com.ista.tradizone.di.app.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document(collection = "horarios")
public class Horario {
    
    @Id
    private String id;

    private String horaInicio;
    private String horaFin;

    /** Relaciones: ----------------------------- */
    private String idLocal;
}