package com.nttdata.bancos.repository;

import com.nttdata.bancos.entity.Operacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OperacionRepository extends JpaRepository<Operacion, Long> {

   //@Query ("select x from operacion x where x.cuentaid like =:var_parm")
    //public abstract List<Operacion> buscarCta(@Param(":var_parm") long id);


}
