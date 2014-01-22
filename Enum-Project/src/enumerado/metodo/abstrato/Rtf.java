package enumerado.metodo.abstrato;

public class Rtf implements TipoArquivo {

	private String descricao;
	private String tipo;
	
	public static Rtf getInstance() {
		return new Rtf();
	}
	
	public Rtf() {
		this.descricao = "pdf";
		this.tipo = "eu tenho um tipo porra!";
	}

	public String getDescricao() {
		return descricao;
	}

	public String getTipo() {
		return tipo;
	}
	
}
