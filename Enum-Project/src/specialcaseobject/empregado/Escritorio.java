package specialcaseobject.empregado;

public final class Escritorio {

	Empregado empregado = new NullEmpregado();
	
	public Escritorio() {}
	
	public Escritorio(Empregado empregado) {
		this.empregado = empregado;
	}
	
	public String imprimirNomeCompletoDoFuncionario() {
		return empregado.nome() + " " + empregado.sobrenome();
	}
	
	public static void main(String[] args) {
		
		Escritorio escritorio = new Escritorio();
		System.out.println(escritorio.imprimirNomeCompletoDoFuncionario());
		
		escritorio = new Escritorio(new Funcionario());
		System.out.println(escritorio.imprimirNomeCompletoDoFuncionario());
		
		escritorio = new Escritorio(new Diretor());
		System.out.println(escritorio.imprimirNomeCompletoDoFuncionario());
	}
}
