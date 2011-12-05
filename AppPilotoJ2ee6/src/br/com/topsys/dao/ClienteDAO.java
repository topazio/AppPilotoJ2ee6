package br.com.topsys.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.topsys.database.TSDataBaseBrokerIf;
import br.com.topsys.database.factory.TSDataBaseBrokerFactory;
import br.com.topsys.exception.TSApplicationException;
import br.com.topsys.model.ClienteModel;
import br.com.topsys.util.Constantes;

public class ClienteDAO {
	
	public ClienteModel inserir(final ClienteModel model) throws TSApplicationException {
		
		TSDataBaseBrokerIf broker = TSDataBaseBrokerFactory.getDataBaseBrokerIf();
		
		model.setId(broker.getSequenceNextValue(Constantes.CLIENTE_ID_SEQ));
		
		broker.setPropertySQL("clientedao.inserir",model.getId(),model.getNome(),model.getTipoClienteModel().getId(),model.getFlagAtivo());
		
		broker.execute();
		
		return model;
		
	}
	
	@SuppressWarnings("unchecked")
	public List<ClienteModel> pesquisar(final ClienteModel model) {
		
		//TSDataBaseBrokerIf broker = TSDataBaseBrokerFactory.getDataBaseBrokerIf();
		
	//	broker.setPropertySQL("clientedao.pesquisar","%" + model.getNome() + "%");
		
		//return broker.getCollectionBean(ClienteModel.class, "id","nome");
		return new ArrayList<ClienteModel>();
	}
	
	public ClienteModel obter(final ClienteModel model) {
		
		TSDataBaseBrokerIf broker = TSDataBaseBrokerFactory.getDataBaseBrokerIf();
		
		broker.setPropertySQL("clientedao.obter",model.getId());
		
		return (ClienteModel) broker.getObjectBean(ClienteModel.class, "id","nome","tipoClienteModel.id","flagAtivo");
		
	}
	
	public void alterar(final ClienteModel model) throws TSApplicationException {
		
		TSDataBaseBrokerIf broker = TSDataBaseBrokerFactory.getDataBaseBrokerIf();
		
		broker.setPropertySQL("clientedao.alterar",model.getNome(),model.getTipoClienteModel().getId(),model.getFlagAtivo(),model.getId());
		
		broker.execute();
		
	}
	
	public void excluir(final ClienteModel model) throws TSApplicationException {
		
		TSDataBaseBrokerIf broker = TSDataBaseBrokerFactory.getDataBaseBrokerIf();
		
		broker.setPropertySQL("clientedao.excluir",model.getId());
		
		broker.execute();
		
	}

}
