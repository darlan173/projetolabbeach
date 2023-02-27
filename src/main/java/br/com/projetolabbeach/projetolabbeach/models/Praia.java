package br.com.projetolabbeach.projetolabbeach.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "beach")
public class Praia {

    private Long id;
    private String nome;
    private String nomeBairro;

    private String nomePraia;
    private String status;
    private String acessibilidade;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "bairro_id", nullable = false)
    private Praia praia;

    @Column(name = "nomeBairro", nullable = false, length = 50)
    private String nomeBairro;

    @Column(name = "nomePraia", nullable = false, length = 50)
    private String nomePraia;

    @Column(name = "acessibilidade", nullable = false, length = 120)
    private String acessibilidade;

    @Column(name = "status", nullable = false, length = 50)
    private String status;

    public Praia() {

    }

    public void remove(Praia praia) {

    }
}


