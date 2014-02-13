package specialcaseobject.empregado;

public class NullEmpregado implements Empregado {

	public static final String DEFAULT_STRING = "";
	
	@Override
	public String nome() {
		return DEFAULT_STRING;
	}

	@Override
	public String sobrenome() {
		return DEFAULT_STRING;
	}

}
