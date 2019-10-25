package br.com.portoseguro.rbc.remuneracaovariavel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portoseguro.rbc.remuneracaovariavel.domain.AgrupamentoProdutoComercialEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.domain.ComposicaoProdutoComercialEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.domain.EmpresaEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.domain.GrupoProdutoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.domain.ModalidadeEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.domain.ProdutoComercialEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.domain.ProdutoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.domain.RamoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.domain.SubGrupoProdutoEntity;
import br.com.portoseguro.rbc.remuneracaovariavel.serve.PopularTabelaService;

@RestController
@RequestMapping(value = "/api/")
public class RetornoTabelaController {

	@Autowired
	private PopularTabelaService popularTabelaService;

	@GetMapping(value = "grupoProduto")
	public ResponseEntity<List<GrupoProdutoEntity>> retornaGrupoProduto() {
		return ResponseEntity.ok().body(popularTabelaService.bucarGrupoProduto());

	}

	@GetMapping(value = "subGrupoProduto")
	public ResponseEntity<List<SubGrupoProdutoEntity>> retornaSubGrupoProduto() {
		return ResponseEntity.ok().body(popularTabelaService.buscarSubGrupoProduto());
	}

	@GetMapping(value = "empresa")
	public ResponseEntity<List<EmpresaEntity>> retornaEmpresa() {
		return ResponseEntity.ok().body(popularTabelaService.buscarEmpresa());
	}

	@GetMapping(value = "modalidade")
	public ResponseEntity<List<ModalidadeEntity>> retornaModalidade() {

		return ResponseEntity.ok(popularTabelaService.buscarModalidade());
	}

	@GetMapping(value = "ramo")
	public ResponseEntity<List<RamoEntity>> retornoRamo() {
		return ResponseEntity.ok(popularTabelaService.buscarRamo());
	}

	@GetMapping(value = "composicaoProdutoComercial")
	public ResponseEntity<List<ComposicaoProdutoComercialEntity>> retornaComposicaoProduto() {
		return ResponseEntity.ok(popularTabelaService.buscarComposicaoProduto());
	}

	@GetMapping(value = "agrupamentoProdutoComercial")
	public ResponseEntity<List<AgrupamentoProdutoComercialEntity>> retornaAgrupamentoProduto() {
		return ResponseEntity.ok(popularTabelaService.bucarAgrupamneto());
	}

	@GetMapping(value = "produto")
	public ResponseEntity<List<ProdutoEntity>> retornaProduto() {
		return ResponseEntity.ok(popularTabelaService.buscarProduto());

	}

	@GetMapping(value = "produtoComercial")
	public ResponseEntity<List<ProdutoComercialEntity>> retornaProdutoComercial() {
		return ResponseEntity.ok(popularTabelaService.buscarProdutoComercial());
	}


}