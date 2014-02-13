package specialcaseobject.carro;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.utilizarVeiculo();

        pessoa = new Pessoa(new Carro());
        pessoa.utilizarVeiculo();

        pessoa = new Pessoa(new Moto());
        pessoa.utilizarVeiculo();
    }

}