package br.com.projetolabbeach.projetolabbeach.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "bairro")

@AllArgsConstructor
@NoArgsConstructor
public class Bairro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nomeBairro", nullable = false,length =60)
    private String bairro;
    @Column(name = "descricao", length =500)
    private String descricao;
    @Column(name = "populacao", length =300)
    private String populacao;


}






