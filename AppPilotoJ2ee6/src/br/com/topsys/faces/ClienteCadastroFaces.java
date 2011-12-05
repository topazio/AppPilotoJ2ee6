package br.com.topsys.faces;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import br.com.topsys.exception.TSApplicationException;

@RequestScoped
@ManagedBean(name = "clienteCadastroFaces")
public class ClienteCadastroFaces extends ClienteABFaces {

	
	protected String insert() throws TSApplicationException {

		if (this.validaCampos()) {

			this.clienteBS.inserir(this.clienteModel);
			
		}

		return SUCESSO;

	}
	
	
	protected String detail() {
		
		this.clienteModel = this.clienteBS.obter(this.clienteModel);
		
		this.setAlterar(Boolean.TRUE);
		
		return SUCESSO;
		
	}
	

	
	protected String update() throws TSApplicationException {
		
			
		if(this.validaCampos()) {
			
			this.clienteBS.alterar(this.clienteModel);
		
			
		}
		
		return SUCESSO;
		
	}
	
	protected String delete() throws TSApplicationException {
		
		this.clienteBS.excluir(this.clienteModel);
		
		return SUCESSO;
		
	}
	
	@Override
	@PostConstruct
	protected void clearFields() {
		// TODO Auto-generated method stub
		super.clearFields();
		
	}

	
}
