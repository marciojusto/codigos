package specialcaseobject.carro;

public final class Pessoa {

    private Veiculo veiculo = new VeiculoNull();

    public Pessoa() {
    }

    public Pessoa(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void utilizarVeiculo() {
        //if (veiculo != null) {
            veiculo.mover();
        //}
    }

}