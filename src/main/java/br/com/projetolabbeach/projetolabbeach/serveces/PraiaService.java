package br.com.projetolabbeach.projetolabbeach.serveces;

import br.com.projetolabbeach.projetolabbeach.models.Praia;
import br.com.projetolabbeach.projetolabbeach.repositorys.PraiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PraiaService {
    @Autowired
    private PraiaRepository praiaRepository;
        public Praia salvar(Praia praia) throws Exception {
            if(praia.getNomePraia() == null || praia.getNomePraia().isEmpty()){


                throw new Exception("Bairro obrigatorio");

            }return praia;
        }

    public List<Praia> findByAcessibilidade(){
            return this.praiaRepository.findAllByAcessibilidadeContainingIgnoreCase("acessibilidade");
    }
    public List<Praia> findByStatus(){
        return this.praiaRepository.findAllByStatusContainingIgnoreCase("status");
    }


}
