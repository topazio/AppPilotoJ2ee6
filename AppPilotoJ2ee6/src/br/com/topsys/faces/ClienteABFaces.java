package br.com.topsys.faces;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

import br.com.topsys.business.ClienteBS;
import br.com.topsys.business.TipoClienteBS;
import br.com.topsys.exception.TSApplicationException;
import br.com.topsys.model.ClienteModel;
import br.com.topsys.model.TipoClienteModel;
import br.com.topsys.util.TSUtil;
import br.com.topsys.web.faces.TSMainFaces;



public abstract class ClienteABFaces extends TSMainFaces {

	protected ClienteModel clienteModel;
	
	
	
	protected List<SelectItem> comboTipoCliente;
	
	private Boolean alterar;
	
	@EJB
	protected ClienteBS clienteBS;
	
	@EJB
	protected TipoClienteBS tipoClienteBS;
	
	public ClienteABFaces() {
	}

	
	protected void clearFields() {
		this.clienteModel = new ClienteModel();
		this.clienteModel.setTipoClienteModel(new TipoClienteModel());
		this.comboTipoCliente = super.initCombo(tipoClienteBS.pesquisarTodos(), "id", "descricao");
		this.alterar = Boolean.FALSE;
	}

	
	
	
	
		
	public String limpar() {
		
		this.clearFields();
		
		return SUCESSO;
		
	}
	
	

	protected boolean validaCampos() {

		boolean valida = true;

		if (TSUtil.isEmpty(this.clienteModel.getNome())) {

			this.addErrorMessage("Nome: Este valor é obrigatório");

			valida = false;

		}

		if (TSUtil.isEmpty(TSUtil.tratarLong(this.clienteModel.getTipoClienteModel().getId()))) {

			this.addErrorMessage("Tipo de cliente: Este valor é obrigatório");

			valida = false;

		}
		
		if(!valida){
			super.setClearFields(false);

			super.setDefaultMessage(false);
		}

		return valida;

	}

	public ClienteModel getClienteModel() {
		return clienteModel;
	}

	public void setClienteModel(ClienteModel clienteModel) {
		this.clienteModel = clienteModel;
	}



	public List<SelectItem> getComboTipoCliente() {
		return comboTipoCliente;
	}

	public void setComboTipoCliente(List<SelectItem> comboTipoCliente) {
		this.comboTipoCliente = comboTipoCliente;
	}

	public Boolean getAlterar() {
		return alterar;
	}

	public void setAlterar(Boolean alterar) {
		this.alterar = alterar;
	}
	
	
	
}
