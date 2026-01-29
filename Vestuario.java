public class Vestuario extends Loja{
    private boolean produtosImportados;
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int maxProdutos){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, maxProdutos);
        this.produtosImportados = produtosImportados;
    } 
    public boolean getProdutosImportados()
    {
        return produtosImportados;
    }
    public void setProdutosImportados(boolean produtosImportados)
    {
        this.produtosImportados = produtosImportados;
    }
    public String toString()
    {
        return "nome: " + getNome() + " quantidadeFuncionarios: " + getQuantidadeFuncionarios() + " salarioBaseFuncionario: " + getSalarioBaseFuncionario() + " endereco: " + getEndereco().toString() + " data de fundação: " + getDataFundacao().toString() + " produtos importados " + getProdutosImportados();
    }
}

