package com.nttdata.bancos.Service;

import com.nttdata.bancos.entity.Operacion;
import com.nttdata.bancos.repository.OperacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class OperacionService {
    @Autowired
    OperacionRepository operacionRepository;

    public List<Operacion> listaOperacion() {
        return operacionRepository.findAll();
    }

    public Optional<Operacion> getOperacion(Long Id) {
        return operacionRepository.findById(Id);
    }

    public void saveOrUpdate(Operacion operacion) {
        operacionRepository.save(operacion);

    }





}

