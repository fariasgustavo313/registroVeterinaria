package com.example.registroVeterinaria.controller;
import com.example.registroVeterinaria.model.Mascota;
import com.example.registroVeterinaria.service.IMascotaService;
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
public class MascotaController {
    
    @Autowired
    private IMascotaService mascoService;
    
    @PostMapping("/mascota/crear")
    public String crearMascota(@RequestBody Mascota mascota) {
        mascoService.crearMascota(mascota);
        return "Mascota creada correctamente";
    }
    
    @DeleteMapping("/mascota/eliminar/{id}")
    public String eliminarMascota(@PathVariable Long id) {
        mascoService.eliminarMascota(id);
        return "Mascota eliminada correctamente";
    }
    
    @PutMapping("/mascota/modificar")
    public String modificarMascota(@RequestBody Mascota mascota) {
        mascoService.modificarMascota(mascota);
        return "Mascota modificada correctamente";
    }
    
    @GetMapping("/mascota/traer/{id}")
    public Mascota traerMascota(@PathVariable Long id) {
        return mascoService.traerMascota(id);
    }
    
    @GetMapping("/mascotas/traer")
    public List<Mascota> traerMascotas() {
        return mascoService.traerMascotas();
    }
    
    @GetMapping("/mascota/traercaniche")
    public List<Mascota> traerPerroCaniche() {
        return mascoService.traerPerroCaniche();
    }
    
}
