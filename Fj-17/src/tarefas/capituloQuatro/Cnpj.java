package tarefas.capituloQuatro;

public class Cnpj {

	String valor;
	
	public Cnpj(String cnpj) {
		this.valor = cnpj;
	}
	
	public boolean ehValido() {
        return primeiroDigitoVerificadorDoCnpj() == primeiroDigitoCorretoParaCnpj()
                && segundoDigitoVerificadorDoCnpj() == segundoDigitoCorretoParaCnpj();
    }

	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}

	private int primeiroDigitoCorretoParaCnpj() {
        // Calcula o primeiro d’gito verificador correto para
        // o CNPJ armazenado no atributo valor
        return 0;
    }
    private int primeiroDigitoVerificadorDoCnpj() {
        // Extrai o primeiro d’gito verificador do CNPJ armazenado
        // no atributo valor
        return 0;
    }
    private int segundoDigitoCorretoParaCnpj() {
        // Calcula o segundo d’gito verificador correto para
        // o CNPJ armazenado no atributo valor
        return 0;
    }
    private int segundoDigitoVerificadorDoCnpj() {
        // Extrai o segundo d’gito verificador do CNPJ armazenado
        // no atributo valor
        return 0;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if(obj != null) {
	    	if(obj instanceof Cnpj && ((Cnpj) obj).valor == this.valor) {
	    		return true;
	    	} else {
	    		return false;
	    	}
    	} else return false;	
    }
    
    @Override
    public int hashCode() {
    	if(this.valor != null) {
    		return this.valor.hashCode();
    	} else return 0;
    }

    @Override
    public String toString() {
    	return this.valor;
    }
}
