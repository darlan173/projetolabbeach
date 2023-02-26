package br.com.projetolabbeach.projetolabbeach.repositorys;

import br.com.projetolabbeach.projetolabbeach.models.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BairroRepository extends JpaRepository <Bairro,Long> {


    //public List<Bairro> findByBairroContainingIgnoreCaseOrderByBairroAscBairroAsc(String bairro);
}












