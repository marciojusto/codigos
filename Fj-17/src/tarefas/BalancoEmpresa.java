package tarefas;

import java.util.HashMap;
import java.util.Map;

public class BalancoEmpresa {

	Map<String, Divida> listaDividas = new HashMap<String, Divida>();
	
	public void criaDivida(String nomeCredor, String cnpjCredor, double valor) {
		Divida divida = new Divida();
		divida.setNomeCredor(nomeCredor);
		divida.setCnpjCredor(cnpjCredor);
		divida.setValorPago(valor);
		listaDividas.put(cnpjCredor, divida);
	}
	
	public void pagaParteDaDivida(String cnpjCredor, double valorAPagar) {
		Divida divida = listaDividas.get(cnpjCredor);
		if(divida != null) {
			divida.paga(valorAPagar);
		}
	}
}
