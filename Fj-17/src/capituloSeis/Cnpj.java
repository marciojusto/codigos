package capituloSeis;

public class Cnpj implements Documento {

	String valor;
	
	public Cnpj(String cnpj) {
		this.valor = cnpj;
	}
	
	public boolean ehValido() {
        return true;
    }

	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
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
