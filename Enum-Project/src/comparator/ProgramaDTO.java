package comparator;

import java.util.Comparator;

public class ProgramaDTO implements Comparator<ProgramaDTO>{

	private int codigo;
	private String nome;
	
	@Override
	public int compare(ProgramaDTO o1, ProgramaDTO o2) {
		return o1.getNome().compareTo(o2.getNome());
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
