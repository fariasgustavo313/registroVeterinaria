package com.example.registroVeterinaria.service;
import com.example.registroVeterinaria.model.Duenio;
import java.util.List;

public interface IDuenioService {
    
    public void crearDuenio(Duenio duenio);
    
    public void eliminarDuenio(Long id);
    
    public void modificarDuenio(Duenio duenio);
    
    public Duenio traerDuenio(Long id);
    
    public List<Duenio> traerDuenios();
    
}
