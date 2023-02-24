package br.com.projetolabbeach.projetolabbeach.models;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "beach")
public class Mpraia {

    private Long id;
    private String nome;
    private String nome_bairro;

    private String nome_praia;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "bairro_id", nullable = false)
    private Mpraia mpraia;

    @Column(name ="nome_bairro", nullable = false, length= 50)
    private String bairroPraia;

    @Column(name = "nome_beach", nullable = false, length = 50)
    private String name;

    @Column(name = "acessibilidade", nullable = false, length = 120)
    private String accessibility;

    @Column(name = "status_praia", nullable = false, length = 50)
    private String status;


    public Mpraia(String nome_praia, String nome_bairro) {

        this.nome_praia = nome_praia;
        this.nome_bairro = nome_bairro;
    }

    public Mpraia() {

    }


    public static Object bairro_id() {
        return bairro_id();
    }
}


