package com.nttdata.bancos.controller;

import com.nttdata.bancos.Service.ClienteService;
import com.nttdata.bancos.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;
import java.util.Optional;

@RestController ()
@RequestMapping (path = "api/v1/clientes")

public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAll(){
        return clienteService.getCliente();
    }

    @GetMapping("/{clienteId}")
    public Optional<Cliente> getById(@PathVariable("clienteId") Long clienteId){
        return clienteService.getCliente(clienteId);
    }

    @PostMapping
    public Cliente saveUpdate(@RequestBody Cliente cliente){
        clienteService.saveOrUpdate(cliente);
        return cliente;
    }

    @DeleteMapping("/{clienteId}")
    public void delete(@PathVariable("clienteId") Long clienteId){
        clienteService.delete(clienteId);
    }


}
