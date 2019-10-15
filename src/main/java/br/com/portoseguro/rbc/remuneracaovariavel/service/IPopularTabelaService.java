package br.com.portoseguro.rbc.remuneracaovariavel.service;

import java.util.List;

import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.AgrupamentoProdutoComercialEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.ComposicaoProdutoComercialEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.EmpresaEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.GrupoProdutoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.ModadlidadeEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.ProdutoComercialEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.ProdutoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.RamoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.SubGrupoProdutoEntity;

public interface IPopularTabelaService {
	
	public List<EmpresaEntity> buscarEmpresa();
	
	public List<ModadlidadeEntity> buscarModalidade();
	
	public List<GrupoProdutoEntity> bucarGrupoProduto();
	
	public List<SubGrupoProdutoEntity> buscarSubGrupoProduto();
	
	public List<ProdutoEntity> buscarProduto();
	
	public List<ProdutoComercialEntity> buscarProdutoComercial();
	
	public List<AgrupamentoProdutoComercialEntity> bucarAgrupamneto();
	
	public List<ComposicaoProdutoComercialEntity> buscarComposicaoProduto();
	
	public List<RamoEntity> buscarRamo();
}
