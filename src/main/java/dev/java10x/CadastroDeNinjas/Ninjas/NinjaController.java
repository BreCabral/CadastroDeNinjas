package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("ninja")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping
    public String boasVindas() {
        return "Bem Vindo";
    }

    @GetMapping("list")
    public List<NinjaDTO> listNinjas() {
        return ninjaService.listNinjas();
    }

    @GetMapping("find/{id}")
    public Optional<NinjaDTO> findNinjaById(@PathVariable Long id) {
        return ninjaService.getNinjaById(id);
    }

    @PostMapping("add")
    public NinjaDTO addNinja(@RequestBody NinjaDTO ninja) {
        return ninjaService.createNinja(ninja);
    }

    @PutMapping("update/{id}")
    public NinjaDTO updateNinjaById(@PathVariable Long id, @RequestBody NinjaDTO newNinja) {
        return ninjaService.updateNinja(id, newNinja);
    }

    @DeleteMapping("delete/{id}")
    public void deleteNinjaById(@PathVariable Long id) {
        ninjaService.deleteNinjaById(id);
    }

}
