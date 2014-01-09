package capituloCinco;

public class TestaPagamentos {
	public static void main(String[] args) {
		Pagamentos pagamentos = new Pagamentos();
		Pagamento pagamento1 = new Pagamento();
		Pagamento pagamento2 = new Pagamento();
		
		pagamento1.setValor(105);
		pagamento2.setValor(25);
		
		pagamentos.registra(pagamento1);
		pagamentos.registra(pagamento2);
		
		System.out.println("Valor Pago: "+ pagamentos.getValorPago());
		
		Pagamentos colecao = pagamentos;
		for (Pagamento pagamento : colecao) {
			System.out.println(pagamento.getValor());
		}
	}
}
