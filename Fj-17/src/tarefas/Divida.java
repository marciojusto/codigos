package tarefas;

public class Divida {

	private String nomeCredor;
	private String cnpjCredor;
	private double valorPago;
	
	public String getNomeCredor() {
		return nomeCredor;
	}
	public void setNomeCredor(String nomeCredor) {
		this.nomeCredor = nomeCredor;
	}
	public String getCnpjCredor() {
		return cnpjCredor;
	}
	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}
	public double getValorPago() {
		return valorPago;
	}
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	
	public void paga(double valor) {
		this.valorPago += valor;
	}
}
