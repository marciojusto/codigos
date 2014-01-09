package tarefas.capituloCinco;

public class PagadorDeFuncionario {

	public void pagaFuncionario(Funcionario funcionario) {
		funcionario.paga(funcionario.getSalario() + funcionario.getBonus());
	}
}
