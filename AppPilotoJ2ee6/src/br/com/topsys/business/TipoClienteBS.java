package br.com.topsys.business;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.topsys.dao.TipoClienteDAO;
import br.com.topsys.model.TipoClienteModel;

@Stateless
@LocalBean
public class TipoClienteBS {
	
	
	private TipoClienteDAO tipoClienteDAO;
	
	public TipoClienteBS() {
		this.tipoClienteDAO = new TipoClienteDAO();
	}
	
	public List<TipoClienteModel> pesquisarTodos() {
		
		return this.tipoClienteDAO.pesquisarTodos();
		
	}

}
