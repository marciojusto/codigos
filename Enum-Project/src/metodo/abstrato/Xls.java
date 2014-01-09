package metodo.abstrato;

public class Xls implements TipoArquivo {

	private String descricao;
	private String tipo;
	
	public static Xls getInstance() {
		return new Xls();
	}
	
	public Xls() {
		this.descricao = "pdf";
		this.tipo = null;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getTipo() {
		return tipo;
	}
	
}
