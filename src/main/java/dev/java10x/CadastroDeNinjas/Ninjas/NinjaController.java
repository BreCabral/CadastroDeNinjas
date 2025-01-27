package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("find/id")
    public String findNinjaById() {
        return "Ninja Find";
    }

    @PostMapping("add")
    public String addNinja() {
        return "Ninja adicionado";
    }

    @PutMapping("update/id")
    public String updateNinjaById() {
        return "Ninja atualizado";
    }

    @DeleteMapping("delete/id")
    public String deleteNinjaById() {
        return "Ninja deletado";
    }

}
