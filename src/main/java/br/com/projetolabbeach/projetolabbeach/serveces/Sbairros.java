package br.com.projetolabbeach.projetolabbeach.serveces;

import br.com.projetolabbeach.projetolabbeach.repositorys.Rbairros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Sbairros {
    @Autowired
    private Rbairros rbairros;

    public Mbairro salvar(Mbairro mbairro) throws Exception {
        if(mbairro.getBairro() ==null || mbairro.getBairro().isEmpty()){

            trow new Exception("Bairro obrigatorio");

        }return mbairro;
}








    /*
    CREATE TABLE beach(
id bigserial PRIMARY KEY ,
bairro_id biginit NOT NULL REFERENCES bairro(id);
nome_beach varchar(60) NOT NULL ,
acessibilidade varchar(100) NULL ,
status  varchar(80) NOT NULL

);


CREATE TABLE bairro(
id bigserial  PRIMARY KEY ,
nome_bairro varchar(60)  NOT NULL,
descricao varchar(500) NULL,
populacao varchar(300) NULL

);

     */

}
