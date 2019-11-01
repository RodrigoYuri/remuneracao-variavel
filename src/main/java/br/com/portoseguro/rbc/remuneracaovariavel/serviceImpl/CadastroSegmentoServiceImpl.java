package br.com.portoseguro.rbc.remuneracaovariavel.serviceImpl;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import br.com.portoseguro.rbc.remuneracaovariavel.domain.CadastroSegmentoRVDomain;

@Service
public class CadastroSegmentoServiceImpl extends GenericService<CadastroSegmentoRVDomain> {
	
	public CadastroSegmentoServiceImpl(PagingAndSortingRepository<CadastroSegmentoRVDomain, Long> repo) {
		super(repo);
	}

}
