package com.nttdata.bancos.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Operacion")

public class Operacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long OperId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "ID_Cli")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "CuentaID")
    private Cuenta cuenta;

    @Column(nullable = false)
    private Long TipOper_Id;
    private double monto;


}
