package dio_facade;

import subsistema.Crm;
import subsistema2.API_Cep;

public class facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = API_Cep.getInstancia().recuperarCidade(cep);
        String estado = API_Cep.getInstancia().recuperarEstado(cep);

        Crm.gravarCliente(nome, cep, cidade, estado);
    }
}

