package br.com.topsys.faces;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.topsys.model.ClienteModel;
import br.com.topsys.util.TSUtil;

@SessionScoped
@ManagedBean(name = "clientePesquisaFaces")
public class ClientePesquisaFaces extends ClienteABFaces {
	
	private List<ClienteModel> clientes;
	
	protected String find() {
		
		this.clientes = this.clienteBS.pesquisar(this.getClienteModel());
		
		this.addInfoMessage(TSUtil.msgResultado(this.clientes));
		
		return SUCESSO;
		
	}
	
	
	@Override
	@PostConstruct
	protected void clearFields() {
		super.clearFields();
		
		this.clientes = new ArrayList<ClienteModel>();
	}
	
	
	public List<ClienteModel> getClientes() {
		return clientes;
	}

	public void setClientes(List<ClienteModel> clientes) {
		this.clientes = clientes;
	}
	
	
	
}
