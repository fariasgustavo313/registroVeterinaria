package com.example.registroVeterinaria.controller;
import com.example.registroVeterinaria.model.Duenio;
import com.example.registroVeterinaria.service.IDuenioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuenioController {
    
    @Autowired
    private IDuenioService duenioService;
    
    @PostMapping("/duenio/crear")
    public String crearDuenio(@RequestBody Duenio duenio) {
        duenioService.crearDuenio(duenio);
        return "Dueño creado correctamente";
    }
    
    @DeleteMapping("/duenio/eliminar/{id}")
    public String eliminarDuenio(@PathVariable Long id) {
        duenioService.eliminarDuenio(id);
        return "Dueño eliminado correctamente";
    }
    
    @PutMapping("/duenio/modificar")
    public String modificarDuenio(@RequestBody Duenio duenio) {
        duenioService.crearDuenio(duenio);
        return "Dueño modificado correctamente";
    }
    
    @GetMapping("/duenio/traer/{id}")
    public Duenio traerDuenio(@PathVariable Long id) {
        return duenioService.traerDuenio(id);
    }
    
    @GetMapping("/duenios/traer")
    public List<Duenio> traerDuenios() {
        return duenioService.traerDuenios();
    }
    
}
