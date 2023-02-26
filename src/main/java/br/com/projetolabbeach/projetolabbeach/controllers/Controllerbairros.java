package br.com.projetolabbeach.projetolabbeach.controllers;

import br.com.projetolabbeach.projetolabbeach.models.Bairro;
import br.com.projetolabbeach.projetolabbeach.serveces.BairroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bairro")

public class Controllerbairros {
    @Autowired
    private BairroService bairroService;



    @GetMapping
    public String leitura(){
        return "bairros";

    }
    @PostMapping
    public Bairro post (@RequestBody Bairro bairro){
        bairroService.salvar(bairroService);
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
