package br.com.projetolabbeach.projetolabbeach.repositorys;

import br.com.projetolabbeach.projetolabbeach.models.Mbairro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Rbairros extends JpaRepository <Mbairro,Long>{
    // DerivedQuery
    public List<Mbairro> findByNameContainingIgnoreCaseOrderByNameAsc(String neighborhood);

    // JPQL
    @Query("SELECT m FROM Mbairro m WHERE UPPER(m.neighborhood) LIKE UPPER(:neighborhood) ")
    public List<Mbairro> findByName(String neighborhood);

    // NativeQuery
    @Query(value = "SELECT m.* FROM  m WHERE m.neighborhood ILIKE :neighborhood", nativeQuery = true)
    public List<Mbairro> findByNameNative(String neighborhood);

}













