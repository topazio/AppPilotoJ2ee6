package br.com.topsys.business;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.topsys.dao.ClienteDAO;
import br.com.topsys.exception.TSApplicationException;
import br.com.topsys.model.ClienteModel;

/**
 * Session Bean implementation class ClienteBS
 */
@Stateless
@LocalBean
public class ClienteBS {

   
	private ClienteDAO clienteDAO;
	
    public ClienteBS() {
        this.clienteDAO = new ClienteDAO();
    }
    
    
    public ClienteModel inserir(ClienteModel model) throws TSApplicationException {
    	
    	return this.clienteDAO.inserir(model);
    	
    }
    
    public List<ClienteModel> pesquisar(ClienteModel model) {
    	
    	return this.clienteDAO.pesquisar(model);
    	
    }
    
    public void alterar(ClienteModel model) throws TSApplicationException {
    	
    	this.clienteDAO.alterar(model);
    	
    }
    
    public ClienteModel obter(ClienteModel model) {
    	
    	return this.clienteDAO.obter(model);
    	
    }
    
    public void excluir(ClienteModel model) throws TSApplicationException {
    	
    	this.clienteDAO.excluir(model);
    	
    }

}
