package subsistema2;


public class API_Cep {

    private static API_Cep instancia = new API_Cep();

    private API_Cep() {
        super();
    }

    public static API_Cep getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Caieiras";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
