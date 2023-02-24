package br.com.projetolabbeach.projetolabbeach.controllers;

import br.com.projetolabbeach.projetolabbeach.models.Mbairro;
import br.com.projetolabbeach.projetolabbeach.serveces.Sbairros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bairro")

public class Controllerbairros {
    @Autowired
    private Sbairros sbairros;



    @GetMapping
    public String leitura(){
        return "bairros";

    }
    @PostMapping
    public Mbairro post (@RequestBody Mbairro bairro){
        sbairros.salvar(bairro);
        return bairro;

        }
    @PutMapping
    public  String  atualiza(){
        return "put bairro";
    }
    @DeleteMapping
    public  String apaga (){
        return "apaga bairro";

    }


}
