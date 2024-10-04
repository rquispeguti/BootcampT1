package com.nttdata.bancos.controller;


import com.nttdata.bancos.Service.OperacionService;
import com.nttdata.bancos.entity.Operacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/operacion")

public class OperacionController {

    @Autowired
    private OperacionService operacionService;


    @RequestMapping("/")
    public List<Operacion> listaOperacion(){
        return operacionService.listaOperacion();
    }

    @PostMapping
    public void saveUpdate(@RequestBody Operacion operacion){
        operacionService.saveOrUpdate(operacion);
}


}