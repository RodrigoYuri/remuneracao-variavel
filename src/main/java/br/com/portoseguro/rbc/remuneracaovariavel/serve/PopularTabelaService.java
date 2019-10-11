package br.com.portoseguro.rbc.remuneracaovariavel.serve;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portoseguro.rbc.remuneracaovariavel.Entity.AgrupamentoProdutoComercialEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.Entity.ComposicaoProdutoComercialEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.Entity.EmpresaEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.Entity.GrupoProdutoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.Entity.ModadlidadeEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.Entity.ProdutoComercialEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.Entity.ProdutoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.Entity.RamoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.Entity.SubGrupoProdutoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.repository.AgrupamentoProdutoComercialDAO;
import br.com.portoseguro.rbc.remuneracaovariavel.repository.ComposicaoProdutoComercialDAO;
import br.com.portoseguro.rbc.remuneracaovariavel.repository.EmpresaDAO;
import br.com.portoseguro.rbc.remuneracaovariavel.repository.GrupoProdutoDAO;
import br.com.portoseguro.rbc.remuneracaovariavel.repository.ModalidadeDAO;
import br.com.portoseguro.rbc.remuneracaovariavel.repository.ProdutoComercialDAO;
import br.com.portoseguro.rbc.remuneracaovariavel.repository.ProdutoDAO;
import br.com.portoseguro.rbc.remuneracaovariavel.repository.RamoDAO;
import br.com.portoseguro.rbc.remuneracaovariavel.repository.SubGrupoProdutoDAO;

@Service
public class PopularTabelaService {
	
	@Autowired
	private EmpresaDAO empresaDAO;
	
	@Autowired
	private ModalidadeDAO modalidadeDAO;
	
	@Autowired
	private GrupoProdutoDAO grupoProdutoDAO;
	
	@Autowired
	private SubGrupoProdutoDAO subGrupoProdutoDAO;
	
	@Autowired
	private ProdutoDAO produtoDAO;
	
	@Autowired
	private ProdutoComercialDAO produtoComercialDAO;
	
	@Autowired
	private AgrupamentoProdutoComercialDAO agrupamentoProdutoComercialDAO;
	
	@Autowired
	private RamoDAO ramoDAO;
	
	@Autowired
	private ComposicaoProdutoComercialDAO composicaoProdutoComercialDAO;
	
	
	
	public List<EmpresaEntity> buscarEmpresa(){
		return empresaDAO.findAll();
	}
	
	public List<ModadlidadeEntity> buscarModalidade() {
		return modalidadeDAO.findAll();
	}
	
	public List<GrupoProdutoEntity> bucarGrupoProduto() {
		return grupoProdutoDAO.findAll();
	}

	public List<SubGrupoProdutoEntity> buscarSubGrupoProduto() {
		return subGrupoProdutoDAO.findAll();
	}
	
	public List<ProdutoEntity> buscarProduto(){
		return produtoDAO.findAll();
	}
	 public List<ProdutoComercialEntity> buscarProdutoComercial() {
		return produtoComercialDAO.findAll();
	}
	 public List<AgrupamentoProdutoComercialEntity> bucarAgrupamneto(){
		 return agrupamentoProdutoComercialDAO.findAll();
	 }
	 public List<ComposicaoProdutoComercialEntity> buscarComposicaoProduto() {
		return composicaoProdutoComercialDAO.findAll();
	}
	 public List<RamoEntity> buscarRamo() {
		return ramoDAO.findAll();
	}
}
