package br.com.topsys.faces;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.topsys.business.ClienteBS;
import br.com.topsys.model.ClienteModel;

@RequestScoped
@ManagedBean(name="clienteFaces")
public class ClienteFaces {
	
	private ClienteModel clienteModel;
	
	@EJB
	private ClienteBS clienteBean;
	
	

	public ClienteFaces(){
		
	}
	
	@PostConstruct
	private void inicializar(){
		this.clienteModel = new ClienteModel();
	}
	
	
	public String inserir(){
		
		this.clienteBean.inserir(this.getClienteModel());
		
		this.inicializar();
		
		return null;
	}
	
	
	
	
	
	public ClienteModel getClienteModel() {
		return clienteModel;
	}


	public void setClienteModel(ClienteModel clienteModel) {
		this.clienteModel = clienteModel;
	}

	
	
	
}
