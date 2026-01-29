public class Cosmetico extends Loja{
    private double taxaComercializacao;
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int maxProdutos, double taxaComercializacao){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, maxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    } 
    public double getTaxaComercializacao()
    {
        return taxaComercializacao;
    }
    public void setTaxaComercializacao(double taxaComercializacao)
    {
        this.taxaComercializacao = taxaComercializacao;
    }
    public String toString()
    {
        return "nome: " + getNome() + " quantidadeFuncionarios: " + getQuantidadeFuncionarios() + " salarioBaseFuncionario: " + getSalarioBaseFuncionario() + " endereco: " + getEndereco().toString() + " data de fundação: " + getDataFundacao().toString() + " taxa de comercialização: " + getTaxaComercializacao();
    }
}

