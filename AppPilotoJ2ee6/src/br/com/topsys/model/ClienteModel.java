package br.com.topsys.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ClienteModel implements Serializable {

	private Long id;
	private String nome;
	private TipoClienteModel tipoClienteModel;
	private Boolean flagAtivo;
	
	public ClienteModel() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public TipoClienteModel getTipoClienteModel() {
		return tipoClienteModel;
	}


	public void setTipoClienteModel(TipoClienteModel tipoClienteModel) {
		this.tipoClienteModel = tipoClienteModel;
	}


	public Boolean getFlagAtivo() {
		return flagAtivo;
	}


	public void setFlagAtivo(Boolean flagAtivo) {
		this.flagAtivo = flagAtivo;
	}

	
	
}
