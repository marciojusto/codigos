package tarefas.capituloTres;

public class Pagamento {
    private String favorecido;
    private String formaDePagamento;
	private DadosDeMovimentacao dadosDeMovimentacao = new DadosDeMovimentacao();
    
    public double getEncargos() {
    	return dadosDeMovimentacao.getEncargos();
    }
	
    public String getFavorecido() {
		return favorecido;
	}
	
    public void setFavorecido(String favorecido) {
		this.favorecido = favorecido;
	}
	
    public String getFormaDePagamento() {
		return formaDePagamento;
	}
	
    public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

}
