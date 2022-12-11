package com.example.registroVeterinaria.service;
import com.example.registroVeterinaria.model.Duenio;
import com.example.registroVeterinaria.repository.IDuenioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenioService implements IDuenioService {

    @Autowired
    private IDuenioRepository duenioRepo;
    
    @Override
    public void crearDuenio(Duenio duenio) {
        duenioRepo.saveAndFlush(duenio);
    }

    @Override
    public void eliminarDuenio(Long id) {
        duenioRepo.deleteById(id);
    }

    @Override
    public void modificarDuenio(Duenio duenio) {
        duenioRepo.saveAndFlush(duenio);
    }

    @Override
    public Duenio traerDuenio(Long id) {
        return duenioRepo.findById(id).orElse(null);
    }

    @Override
    public List<Duenio> traerDuenios() {
        return duenioRepo.findAll();
    }

    
}
