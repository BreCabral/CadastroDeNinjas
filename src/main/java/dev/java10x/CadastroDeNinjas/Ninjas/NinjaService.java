package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listNinjas() {
        return ninjaRepository.findAll();
    }

    public Optional<NinjaModel> getNinjaById(Long id) {
        return ninjaRepository.findById(id);
    }

    public NinjaModel createNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

}
