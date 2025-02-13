package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaDTO> listNinjas() {
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas
                .stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }

    public Optional<NinjaDTO> getNinjaById(Long id) {
        return ninjaRepository.findById(id).map(ninjaMapper::map);
    }

    public NinjaDTO createNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        return ninjaMapper.map(ninjaRepository.save(ninja));
    }

    public void deleteNinjaById(Long id) {
        ninjaRepository.deleteById(id);
    }

    public NinjaDTO updateNinja(Long id, NinjaDTO newNinja) {
        if (ninjaRepository.existsById(id)) {
            newNinja.setId(id);
            NinjaModel newNinjaModel = ninjaMapper.map(newNinja);
            return ninjaMapper.map(ninjaRepository.save(newNinjaModel));
        }
        return null;
    }

}
