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
    public List<NinjaModel> listNinjas() {
        return ninjaService.listNinjas();
    }

    @GetMapping("find/{id}")
    public Optional<NinjaModel> findNinjaById(@PathVariable Long id) {
        return ninjaService.getNinjaById(id);
    }

    @PostMapping("add")
    public NinjaModel addNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.createNinja(ninja);
    }

    @PutMapping("update/id")
    public String updateNinjaById() {
        return "Ninja atualizado";
    }

    @DeleteMapping("delete/{id}")
    public void deleteNinjaById(@PathVariable Long id) {
        ninjaService.deleteNinjaById(id);
    }

}
