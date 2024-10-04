package com.nttdata.bancos.controller;

import com.nttdata.bancos.Service.CuentaService;
import com.nttdata.bancos.entity.Cuenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/cuentas")



public class CuentaController {
    @Autowired
    private CuentaService cuentaService;

    @GetMapping
    public List<Cuenta> getAll() {
        return cuentaService.getCuenta();

    }

    @GetMapping("/{cuentaId}")
    public Optional<Cuenta> getById(@PathVariable("cuentaId") Long cuentaId) {
        return cuentaService.getCuenta(cuentaId);

    }

    @PostMapping
    public void saveUpdate(@RequestBody Cuenta cuenta) {
        cuentaService.saveOrUpdate(cuenta);

    }

    @DeleteMapping("/{cuentaId}")
    public void saveUpdate(@PathVariable("cuentaId") Long cuentaId) {
        cuentaService.delete(cuentaId);

    }

    @PutMapping ("/cuentas/{cuentaId}")
    public Cuenta update (@RequestBody Cuenta cuenta, @PathVariable Long Id ){
        Optional<Cuenta> cuenta1  = cuentaService.getCuenta(Id);
        cuenta1.setNroCuenta(cuenta.getNroCuenta());
        cuenta1.setID_Cli(cuenta.getID_Cli());
        cuenta1.setsaldo(cuenta.getsaldo());
        cuentaService.saveOrUpdate(cuenta1.orElse(null));

    }


}
