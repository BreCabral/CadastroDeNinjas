package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missao")
public class MissaoController {

    @GetMapping("list")
    public String listMissoes() {
        return "Lista as missoes";
    }

    @PostMapping("add")
    public String addMissao() {
        return "Missao adicionada";
    }

    @PutMapping("update")
    public String updateMissoes() {
        return "Atualiza missoes";
    }

    @DeleteMapping("delete")
    public String deleteMissoes() {
        return "Deleta Missoes";
    }

}
