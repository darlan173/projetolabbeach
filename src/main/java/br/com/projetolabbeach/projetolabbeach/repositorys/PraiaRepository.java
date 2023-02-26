package br.com.projetolabbeach.projetolabbeach.repositorys;

import br.com.projetolabbeach.projetolabbeach.models.Praia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PraiaRepository extends JpaRepository <Praia,Long> {

  //  PraiaRepository findById(Long id);

    List<Praia> findAllByAcessibilidadeContainingIgnoreCase(String acessibilidade);

    List<Praia>findAllByStatusContainingIgnoreCase(String status);

    }









