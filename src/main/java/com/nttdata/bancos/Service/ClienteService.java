package com.nttdata.bancos.Service;

import com.nttdata.bancos.entity.Cliente;
import com.nttdata.bancos.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> getCliente(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> getCliente(Long id){
        return clienteRepository.findById(id);
    }

    public void saveOrUpdate (Cliente cliente){
        clienteRepository.save(cliente);
    }

    public void delete(Long id){
        clienteRepository.deleteById(id);
    }

}
