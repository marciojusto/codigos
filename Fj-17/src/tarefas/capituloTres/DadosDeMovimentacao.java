package tarefas.capituloTres;

import java.util.Calendar;

public class DadosDeMovimentacao {

	private double valor;
    private Calendar data;

    public double getEncargos() {
      return valor * 0.01;
    }

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

}
