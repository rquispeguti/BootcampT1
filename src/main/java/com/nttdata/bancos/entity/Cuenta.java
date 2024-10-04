package com.nttdata.bancos.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "cuenta")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CuentaID;

    private String NroCuenta;
    private Double Saldo;

    @Column (nullable = false)
    private Long TipoCta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "ID_Cli")
    private Cliente cliente;


}
