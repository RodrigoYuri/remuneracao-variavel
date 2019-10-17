package br.com.portoseguro.rbc.remuneracaovariavel.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "PPOKRAM")
public class RamoEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4381812325408745203L;

	@Id
	@Column(name="RAMCOD")
	private Integer codRamo;
	
	@Column(name="PRDCOD")
	private Integer codProduto;
	
	@Column(name="IFXRAMCOD")
	private Integer codInformixRamo;
	
	@Column(name="RAMNOM")
	private String nomRamo;
	
	@Column(name="RAMSGL")
	private String siglaRamo;

}
