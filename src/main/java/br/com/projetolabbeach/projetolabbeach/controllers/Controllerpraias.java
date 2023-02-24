package br.com.projetolabbeach.projetolabbeach.controllers;

import br.com.projetolabbeach.projetolabbeach.models.Mpraia;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/beach")

public class Controllerpraias {

       // public Long id;
        private List<Mpraia> mpraias = new ArrayList<>();

        @GetMapping
        public ResponseEntity<?> readList() {
            return ResponseEntity.ok(mpraias);
        }

        @GetMapping(value = "/{id}")
        public ResponseEntity<?> read(@PathVariable Long id) {
            if (id != null) {
                Mpraia praiaLocalizada = findById(id);
                if (praiaLocalizada != null) {
                    return ResponseEntity.ok(praiaLocalizada);
                }
            }
            return ResponseEntity.status(404).body("Praia não encontrada!");
        }

        @PostMapping
        public Mpraia create() {
            Mpraia mpraia = new Mpraia(


            );
            mpraias.add(mpraia);
            return mpraia;
        }

        @PutMapping
        public Mpraia update(Long id, String nome, String nome_bairro) {
            Mpraia praiaLocalizada = findById(id);
            if (praiaLocalizada != null) {
               praiaLocalizada.setName(nome);
               praiaLocalizada.setNome_bairro(nome_bairro);
            }
            return praiaLocalizada;
        }

        @DeleteMapping
        public boolean delete(Long id) {
            Mpraia praiaLocalizada = findById(id);
            if (praiaLocalizada != null) {
                mpraias.remove(praiaLocalizada);
                return true;
            }
            return false;
        }

        private Mpraia findById(Long id) {
            for (Mpraia mpraia : mpraias) {
                if (Mpraia.bairro_id().equals(id)) {
                    return mpraia;
                }
            }
            return null;
        }

    }





