package metodo.abstrato;

public class Pdf implements TipoArquivo {

	private String descricao;
	private String tipo;
	
	public static Pdf getInstance() {
		return new Pdf();
	}
	
	public Pdf() {
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
