package capituloUm;

public class GerenciadorDeDividas {

	public void efetuaPagamento(Divida divida, double valor, String nomePagador, String cnpjPagador) {
		Pagamento pagamento = new Pagamento();
		pagamento.setPagador(nomePagador);
		pagamento.setCnpjPagador(cnpjPagador);
		pagamento.setValor(valor);
		divida.registra(pagamento);
	}
}
