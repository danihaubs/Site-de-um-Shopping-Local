public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String toString() {
        return "nome: " + getNome() + " preco: " + getPreco() + " data de validade: " + getDataValidade().toString();
    }

    public boolean estaVencido(Data data) {
        Data dataValidade = getDataValidade();
        if (data.getAno() <= dataValidade.getAno()) {
            if (data.getAno() < dataValidade.getAno()) {
                return false;
            } else {
                if (data.getMes() <= dataValidade.getMes()) {
                    if (data.getMes() < dataValidade.getMes()) {
                        return false;
                    } else {
                        if (data.getDia() <= dataValidade.getDia()) {
                            return false;
                        }
                        return true;
                    }
                } else {
                    return false;
                }
            }
        } else {
            return true;
        }

    }
}