package capituloTres;

public class GerenciadorDeDividas {

	public void efetuaPagamento(Divida divida, Pagamento pagamento) {
		divida.getPagamentos().registra(pagamento);
	}
}
