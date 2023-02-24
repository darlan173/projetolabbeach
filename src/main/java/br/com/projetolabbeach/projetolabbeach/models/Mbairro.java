package br.com.projetolabbeach.projetolabbeach.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bairro")


public class Mbairro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nomeBairro", nullable = false,length =60)
    private String bairro;
    @Column(name = "descricao", length =500)
    private String description;
    @Column(name = "populacao", length =300)
    private String population;


}






