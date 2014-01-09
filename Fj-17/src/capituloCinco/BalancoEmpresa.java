package capituloCinco;
import java.util.HashMap;


public class BalancoEmpresa {

	private HashMap<Documento, Divida> dividas = new HashMap<Documento, Divida>();
	
    public void registraDivida(String credor, Documento documentoCredor, double valor) {
        Divida divida = new Divida();
        divida.setTotal(valor);
        divida.setCredor(credor);
        divida.setDocumento(documentoCredor);
        if(divida.getDocumento() != null && divida.getDocumento().ehValido()) {
        	dividas.put(documentoCredor, divida);
        }
    }

    public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
        Divida divida = dividas.get(documentoCredor);
        if (divida != null) {
            divida.registra(pagamento);
        }
    }
    
}
