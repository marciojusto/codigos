package metodo.abstrato;

import java.util.HashMap;
import java.util.Map;

public enum Formato {

	PDF(1, Pdf.getInstance()), 
	XLS(2, Xls.getInstance()), 
	RTF(3, Rtf.getInstance());
	
	private final Integer codigo;
	private final TipoArquivo arquivo;
	
	private Formato(Integer codigo, TipoArquivo valor) {
		this.codigo = codigo;
		this.arquivo = valor;
	}
	
	public static Map<Integer, TipoArquivo> retornaMap() {
		Map<Integer, TipoArquivo> mapa = new HashMap<Integer, TipoArquivo>();
		for(Formato formato : Formato.values()) {
			mapa.put(formato.codigo, formato.arquivo);
		}
		return mapa;
	}
	
	public static void main(String[] args) {
		Map<Integer, TipoArquivo> mapa = Formato.retornaMap();
		TipoArquivo arquivo = mapa.get(3);
		System.out.println(arquivo.getTipo());
	}

}
