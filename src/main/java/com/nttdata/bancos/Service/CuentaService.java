package com.nttdata.bancos.Service;

import com.nttdata.bancos.entity.Cuenta;
import com.nttdata.bancos.repository.ClienteRepository;
import com.nttdata.bancos.repository.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CuentaService {
    @Autowired
    CuentaRepository cuentaRepository;
    private Optional<Cuenta> cuenta1;


    public List<Cuenta> getCuenta(){
        return cuentaRepository.findAll();
    }

    public Optional<Cuenta> getCuenta(Long Id){
        return  cuentaRepository.findById(Id);
    }

    public void saveOrUpdate(Cuenta cuenta) {
        cuentaRepository.save(cuenta);
    }

    public void delete(Long Id) {
        cuentaRepository.deleteById(Id);

    }


}
