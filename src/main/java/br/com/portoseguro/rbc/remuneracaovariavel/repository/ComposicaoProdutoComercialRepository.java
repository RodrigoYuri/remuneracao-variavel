package br.com.portoseguro.rbc.remuneracaovariavel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.portoseguro.rbc.remuneracaovariavel.domain.ComposicaoProdutoComercialEntity;

@Repository
public interface ComposicaoProdutoComercialRepository extends JpaRepository<ComposicaoProdutoComercialEntity, Long>{

}
