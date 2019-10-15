package br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.ComposicaoProdutoComercialEntity;

@Repository
public interface ComposicaoProdutoComercialDAO extends JpaRepository<ComposicaoProdutoComercialEntity, Long>{

}
