package com.example.registroVeterinaria.service;
import com.example.registroVeterinaria.model.Mascota;
import com.example.registroVeterinaria.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascotaRepo;
    
    @Override
    public void crearMascota(Mascota mascota) {
        mascotaRepo.saveAndFlush(mascota);
    }

    @Override
    public void eliminarMascota(Long id) {
        mascotaRepo.deleteById(id);
    }

    @Override
    public void modificarMascota(Mascota mascota) {
        this.crearMascota(mascota);
    }

    @Override
    public Mascota traerMascota(Long id) {
        return mascotaRepo.findById(id).orElse(null);
    }
    
    @Override
    public List<Mascota> traerMascotas() {
        return mascotaRepo.findAll();
    }

    @Override
    public List<Mascota> traerPerroCaniche() {
        
        List<Mascota> listaMascotas = this.traerMascotas();
        List<Mascota> listaPerroCani = new ArrayList<Mascota>();
        
        for (Mascota masco : listaMascotas) {
            if (masco.getEspecie().equalsIgnoreCase("perro") && masco.getRaza().equalsIgnoreCase("caniche")) {
                listaPerroCani.add(masco);
            }
        }
        return listaPerroCani;
    }

    
}
