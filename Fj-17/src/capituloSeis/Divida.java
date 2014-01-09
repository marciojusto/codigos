package capituloSeis;

public class Divida {
    
	private double total;
    private String credor;
    private Documento documento;
    private Pagamentos pagamentos = new Pagamentos();

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getCredor() {
        return this.credor;
    }
    
    public double getTotal() {
        return this.total;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    public void setTotal(double total) {
        this.total = total;
    }

	public void registra(Pagamento pagamento) {
		pagamentos.registra(pagamento);
	}
	
	public double getValorPago() {
		return pagamentos.getValorPago();
	}

}