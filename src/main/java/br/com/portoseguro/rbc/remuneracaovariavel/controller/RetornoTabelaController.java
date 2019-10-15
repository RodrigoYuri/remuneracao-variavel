package br.com.portoseguro.rbc.remuneracaovariavel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.AgrupamentoProdutoComercialEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.ComposicaoProdutoComercialEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.EmpresaEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.GrupoProdutoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.ModadlidadeEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.ProdutoComercialEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.ProdutoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.RamoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.model.oracle.entity.SubGrupoProdutoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.service.PopularTabelaService;

@RestController
@RequestMapping(value = "/api/")
public class RetornoTabelaController {
	
	@Autowired
	private PopularTabelaService popularTabelaService;
	
	@GetMapping(value = "grupoProduto")
	public ResponseEntity<List<GrupoProdutoEntity>> retornaGrupoProduto() {
		return  ResponseEntity.ok().body(popularTabelaService.bucarGrupoProduto());
		
	}
	
	@GetMapping(value = "subGrupoProduto")
	public ResponseEntity<List<SubGrupoProdutoEntity>> retornaSubGrupoProduto(){
		return ResponseEntity.ok().body(popularTabelaService.buscarSubGrupoProduto());
	}
	
	@GetMapping(value = "empresa")
	public ResponseEntity<List<EmpresaEntity>> retornaEmpresa(){
		return ResponseEntity.ok().body(popularTabelaService.buscarEmpresa());	}
	
	@GetMapping(value = "modalidade")
	public ResponseEntity<List<ModadlidadeEntity>> retornaModalidade(){
		return ResponseEntity.ok(popularTabelaService.buscarModalidade());
	}
	
	@GetMapping(value = "ramo")
	public ResponseEntity<List<RamoEntity>> retornoRamo(){
		return ResponseEntity.ok(popularTabelaService.buscarRamo());
	}
	
	@GetMapping(value = "composicaoProdutoComercial")
	public ResponseEntity<List<ComposicaoProdutoComercialEntity>> retornaComposicaoProduto(){
		return ResponseEntity.ok(popularTabelaService.buscarComposicaoProduto());
	}
	
	@GetMapping(value = "agrupamentoProdutoComercial")
	public ResponseEntity<List<AgrupamentoProdutoComercialEntity>> retornaAgrupamentoProduto(){
		return ResponseEntity.ok(popularTabelaService.bucarAgrupamneto());
	}
	
	@GetMapping(value = "produto")
	public ResponseEntity<List<ProdutoEntity>> retornaProduto(){
		return ResponseEntity.ok(popularTabelaService.buscarProduto());
		
	}
	
	@GetMapping(value = "produtoComercial")
	public ResponseEntity<List<ProdutoComercialEntity>> retornaProdutoComercial(){
		return ResponseEntity.ok(popularTabelaService.buscarProdutoComercial());
	}
	
	
}