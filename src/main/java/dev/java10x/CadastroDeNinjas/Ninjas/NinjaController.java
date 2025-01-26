package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ninja")
public class NinjaController {

    @GetMapping
    public String boasVindas() {
        return "Bem Vindo";
    }

    @GetMapping("list")
    public String listNinjas() {
        return "Lista de Ninjas";
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
