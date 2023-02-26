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
       // public Long id;
        private List<Praia>praias= new ArrayList<>();

        @GetMapping
        public ResponseEntity<?> readList() {
            return ResponseEntity.ok(praias);
        }

    @GetMapping
    public String get() {

        public List<Praia> get(String nome) {
            if (nomePraia != null && !nomePraia.isEmpty()) {
                return praiaService.buscarPorNome(nomePraia);
            }
            return praiaService.buscarTodas();
        }
        @GetMapping
        public String get() {

            public List<Praia> get (String status){
                if (nomePraia != null && !nomePraia.isEmpty()) {
                    return praiaService.buscarPorStatus(String propria, String impropria);
                }
                return praiaService.buscarStatus(status);
            }


            @GetMapping(value = "/{id}")
            public ResponseEntity<?> read (@PathVariable Long id){
                if (id != null) {
                    Praia praiaLocalizada = findById(id);
                    if (praiaLocalizada != null) {
                        return ResponseEntity.ok(praiaLocalizada);
                    }
                }
                return ResponseEntity.status(404).body("Praia não encontrada!");
            }


            @PostMapping
            public Praia create () {
                Praia praia = new Praia(


                );
                praias.add(praia);
                bairros.add(bairro);
                return praia;
            }

            @PutMapping
            public Praia update (Long id, String nome, String nome_bairro){
                Praia praiaLocalizada = findById(id);
                if (praiaLocalizada != null) {
                    praiaLocalizada.setNomePraia(nome);
                    praiaLocalizada.setNomeBairro(nomeBairro);
                }
                return praiaLocalizada;
            }

            @DeleteMapping
            public boolean delete (Long id){
                Praia praiaLocalizada = findById(id);
                if (praiaLocalizada != null) {
                    praias.remove(praiaLocalizada);
                    return true;
                }
                return false;
            }

            private Praia findById (Long id){
                for (Praia praia : praias) {
                    if (Praia.bairro_id().equals(id)) {
                        return praia;
                    }
                }
                return null;
            }
        @GetMapping("/acessibilidade")
                public  ResponseEntity<List<Praia>>  acessibilidade(){
                return ResponseEntity.ok(this.praiaService.findByAcessibilidade());
            }
            @GetMapping("/status")
            public Optional ResponseEntity<List<Praia>> status(){
                return ResponseEntity.ok(this.praiaService.findByStatus());

    }



        }