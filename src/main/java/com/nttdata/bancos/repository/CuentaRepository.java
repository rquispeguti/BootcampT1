package com.nttdata.bancos.repository;

import com.nttdata.bancos.entity.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
}
