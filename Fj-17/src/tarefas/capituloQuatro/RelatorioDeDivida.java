package tarefas.capituloQuatro;

import java.text.NumberFormat;

public class RelatorioDeDivida {

	Divida divida;
	
	public RelatorioDeDivida(Divida divida) {
		this.divida = divida;
	}
	
	public void geraRelatorio(NumberFormat formatador) {
		System.out.println("Cnpj Credor: " + divida.getCnpjCredor());
		System.out.println("Credor: " + divida.getCredor());
		
		System.out.println("Valor da Divida: " + formatador.format(divida.getTotal()));
		System.out.println("Valor pago: " + formatador.format(divida.getValorPago()));
	}
}
