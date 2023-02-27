package br.com.projetolabbeach.projetolabbeach.serveces;

import br.com.projetolabbeach.projetolabbeach.models.Bairro;
import br.com.projetolabbeach.projetolabbeach.repositorys.BairroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BairroService {
@Autowired
private BairroRepository bairroRepository;
    public Bairro salvar( Bairro bairro) throws Exception {
        if(bairro.getBairro() ==null || bairro.getBairro().isEmpty()){


            throw new Exception("Bairro obrigatorio");

        }return bairro;
}
         public List<Bairro> buscarTodas() {
            return bairroRepository.findAll();
        }

        public Bairro buscarPorId(Long id) {
            return bairroRepository.findById(id).get();
        }

        public boolean apagar(Long id) {
            try {
                bairroRepository.deleteById(id);
                return true;
            } catch (Exception e) {
                return false;
            }
        }



    private List<Bairro> bairroRepository(String nomeBairro) {
        return bairroRepository(nomeBairro);
    }

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


