public class Alimentacao extends Loja{
    private Data dataAlvara;
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int maxProdutos){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, maxProdutos);
        this.dataAlvara = dataAlvara;
    } 
    public Data getDataAlvara()
    {
        return dataAlvara;
    }
    public void setDataAlvara(Data dataAlvara)
    {
        this.dataAlvara = dataAlvara;
    }
    public String toString()
    {
        return "nome: " + getNome() + " quantidadeFuncionarios: " + getQuantidadeFuncionarios() + " salarioBaseFuncionario: " + getSalarioBaseFuncionario() + " endereco: " + getEndereco().toString() + " data de fundação: " + getDataFundacao().toString() + " data alvará " + getDataAlvara();
    }
}

