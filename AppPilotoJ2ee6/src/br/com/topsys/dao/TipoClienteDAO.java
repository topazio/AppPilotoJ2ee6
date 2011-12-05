package br.com.topsys.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.topsys.database.TSDataBaseBrokerIf;
import br.com.topsys.database.factory.TSDataBaseBrokerFactory;
import br.com.topsys.model.TipoClienteModel;

public class TipoClienteDAO {
	
	@SuppressWarnings("unchecked")
	public List<TipoClienteModel> pesquisarTodos() {
		
		//TSDataBaseBrokerIf broker = TSDataBaseBrokerFactory.getDataBaseBrokerIf();
		
	//	broker.setPropertySQL("tipoclientedao.pesquisarTodos");
		
		//return broker.getCollectionBean(TipoClienteModel.class,"id","descricao");
		
		return new ArrayList<TipoClienteModel>();
	}

}
