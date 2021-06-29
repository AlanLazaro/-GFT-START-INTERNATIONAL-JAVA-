public class Produto {
    private String Nome;
    private double Valor;
    private int Tipo;

    public Produto(String nome, double valor, int tipo) {
        Nome = nome;
        Valor = valor;
        Tipo = tipo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int tipo) {
        Tipo = tipo;
    }

}

