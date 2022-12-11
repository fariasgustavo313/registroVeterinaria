package com.example.registroVeterinaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Duenio {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idDuenio;
    private int dni;
    private String nombre;
    private String apellido;
    private int celular;
    @OneToOne
    @JoinColumn(name = "una_mascota_id_mascota", referencedColumnName = "idMascota")
    private Mascota unaMascota;

    public Duenio() {
    }

    public Duenio(Long idDuenio, int dni, String nombre, String apellido, int celular, Mascota unaMascota) {
        this.idDuenio = idDuenio;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.unaMascota = unaMascota;
    }
    
    
}
