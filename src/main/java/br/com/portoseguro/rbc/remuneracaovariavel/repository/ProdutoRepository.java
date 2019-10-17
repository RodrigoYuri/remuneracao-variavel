package br.com.portoseguro.rbc.remuneracaovariavel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.portoseguro.rbc.remuneracaovariavel.domain.ProdutoEntity;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long>{

}
