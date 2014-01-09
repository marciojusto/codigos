package tarefas.capituloQuatro;

import java.text.NumberFormat;
import java.util.Locale;

import tarefas.capituloQuatro.Divida;
import tarefas.capituloQuatro.Pagamento;
import tarefas.capituloQuatro.RelatorioDeDivida;

public class ImprimeRelatorio {

	public static void main(String[] args) {
		Divida divida = new Divida();
		divida.setCredor("Uma empresa");
		divida.setTotal(100);
		divida.getCnpjCredor().setValor("00.000.001/0001-01");
		
		Pagamento pagamento = new Pagamento();
		pagamento.setCnpjPagador("00.000.002/0002-02");
		pagamento.setPagador("Outra Empresa");
		pagamento.setValor(20);
		
		divida.registra(pagamento);
		
		RelatorioDeDivida relatorioDeDivida = new RelatorioDeDivida(divida);
		
		NumberFormat formatadorBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		relatorioDeDivida.geraRelatorio(formatadorBR);
		
		NumberFormat formatadorUS = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		relatorioDeDivida.geraRelatorio(formatadorUS);
	}
}
