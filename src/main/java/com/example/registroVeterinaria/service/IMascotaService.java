package com.example.registroVeterinaria.service;
import com.example.registroVeterinaria.model.Mascota;
import java.util.List;

public interface IMascotaService {
    
    public void crearMascota(Mascota mascota);
    
    public void eliminarMascota(Long id);
    
    public void modificarMascota(Mascota mascota);
    
    public Mascota traerMascota(Long id);
    
    public List<Mascota> traerPerroCaniche();
    
    public List<Mascota> traerMascotas();
    
}
