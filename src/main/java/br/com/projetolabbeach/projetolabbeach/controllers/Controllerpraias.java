package br.com.projetolabbeach.projetolabbeach.controllers;

import br.com.projetolabbeach.projetolabbeach.models.Praia;
import br.com.projetolabbeach.projetolabbeach.repositorys.PraiaRepository;
import br.com.projetolabbeach.projetolabbeach.serveces.PraiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/beach")

public class Controllerpraias {
    @Autowired
    private PraiaRepository praiaRepository;
    @Autowired
    private PraiaService praiaService;


    private List<Praia> praias = new ArrayList<>();


    @GetMapping
    public ResponseEntity<?> readList() {
        return ResponseEntity.ok(praias);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> read(@PathVariable Long id) {

        if (id != null) {
            Praia nomePraia = findById(id);
            if (nomePraia != null) {
                return ResponseEntity.ok(nomePraia);
            }
        }
        return ResponseEntity.status(404).body("Praia não cadastrada!");
    }


    @PostMapping
    public Praia create() {
        Praia praia = new Praia();
        praias.add(praia);
        return praia;

    }

    private Praia findById(Long id) {
        for (Praia praia : praias) {
            if (praia.getId().equals(id)) {
                return praia;
            }
        }
        return null;
    }

    @PutMapping
    public boolean update(Long id, String nomePraia) {
        Praia praia = findById(id);
        if (id != null) {
            //  public Praia update(Long id, String nomePraia) {
            Praia praiaId = findById(id);
            if (id != null) {
                praia.setNomePraia(nomePraia);
                return true;
            }

        }
        return false;
    }
        @DeleteMapping(value="/{id}")
       public boolean deletePath(@PathVariable Long id){
          return false;
        }

        @GetMapping("/acessibilidade")
        public ResponseEntity<List<Praia>> acessibilidade () {
            return ResponseEntity.ok(this.praiaService.findByAcessibilidade());
        }

        @GetMapping("/status")
        public ResponseEntity<List<Praia>> status () {
            return ResponseEntity.ok(this.praiaService.findByStatus());

        }
    }


