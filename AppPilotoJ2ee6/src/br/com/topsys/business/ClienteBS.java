package br.com.topsys.business;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.com.topsys.model.ClienteModel;

/**
 * Session Bean implementation class ClienteBean
 */
@Stateless
@LocalBean
public class ClienteBS {

    /**
     * Default constructor. 
     */
    public ClienteBS() {
        // TODO Auto-generated constructor stub
    }
    
    
    public void inserir(ClienteModel model){
    	System.out.println("Cliente xx-> "+model.getNome());
    }
 
}
