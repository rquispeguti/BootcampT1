package com.nttdata.bancos.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Clientes")

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Cli;
    private String Nombre_Cli;
    private String Apellido_Cli;

    @Column(unique = true, nullable = false)
    private String DNI;

    @Column(unique = true, nullable = false)
    private String email;

}