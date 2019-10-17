package br.com.portoseguro.rbc.remuneracaovariavel.serve;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portoseguro.rbc.remuneracaovariavel.domain.AgrupamentoProdutoComercialEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.domain.ComposicaoProdutoComercialEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.domain.EmpresaEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.domain.GrupoProdutoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.domain.ModalidadeEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.domain.ProdutoComercialEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.domain.ProdutoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.domain.RamoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.domain.SubGrupoProdutoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.repository.AgrupamentoProdutoComercialRepository;
import br.com.portoseguro.rbc.remuneracaovariavel.repository.ComposicaoProdutoComercialRepository;
import br.com.portoseguro.rbc.remuneracaovariavel.repository.EmpresaRepository;
import br.com.portoseguro.rbc.remuneracaovariavel.repository.GrupoProdutoRepository;
import br.com.portoseguro.rbc.remuneracaovariavel.repository.ModalidadeRepository;
import br.com.portoseguro.rbc.remuneracaovariavel.repository.ProdutoComercialRepository;
import br.com.portoseguro.rbc.remuneracaovariavel.repository.ProdutoRepository;
import br.com.portoseguro.rbc.remuneracaovariavel.repository.RamoRepository;
import br.com.portoseguro.rbc.remuneracaovariavel.repository.SubGrupoProdutoRepository;

@Service
public class PopularTabelaService {
	
	@Autowired
	private EmpresaRepository empresaDAO;
	
	@Autowired
	private ModalidadeRepository modalidadeDAO;
	
	@Autowired
	private GrupoProdutoRepository grupoProdutoDAO;
	
	@Autowired
	private SubGrupoProdutoRepository subGrupoProdutoDAO;
	
	@Autowired
	private ProdutoRepository produtoDAO;
	
	@Autowired
	private ProdutoComercialRepository produtoComercialDAO;
	
	@Autowired
	private AgrupamentoProdutoComercialRepository agrupamentoProdutoComercialDAO;
	
	@Autowired
	private RamoRepository ramoDAO;
	
	@Autowired
	private ComposicaoProdutoComercialRepository composicaoProdutoComercialDAO;
	
	
	
	public List<EmpresaEntity> buscarEmpresa(){
		return empresaDAO.findAll();
	}
	
	public List<ModalidadeEntity> buscarModalidade() {
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
