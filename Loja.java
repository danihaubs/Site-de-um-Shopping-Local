public class Loja
{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int maxProdutos) 
    {
        this.nome = nome; 
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[maxProdutos];
        for(int i=0; i<estoqueProdutos.length; i++)
        {
            estoqueProdutos[i] = null;
        }
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int maxProdutos)
    {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.dataFundacao = dataFundacao;
        this.endereco = endereco;
        this.estoqueProdutos = new Produto[maxProdutos];
        for(int i=0; i<estoqueProdutos.length; i++)
        {
            estoqueProdutos[i] = null;
        }
    }

    public String getNome()
    {
        return nome;
    }

    public int getQuantidadeFuncionarios()
    {
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario()
    {
        return salarioBaseFuncionario;
    }

    public Endereco getEndereco()
    {
        return endereco;
    }

    public Data getDataFundacao()
    {
        return dataFundacao;
    }

    public Produto[] getEstoqueProdutos()
    {
        return estoqueProdutos;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios)
    {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario)
    {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
    }

    public void setDataFundacao(Data dataFundacao)
    {
        this.dataFundacao = dataFundacao;
    }

    public void setEstoqueProdutos(Produto[] produtos)
    {
        this.estoqueProdutos = produtos;
    }

    public String toString()
    {
        return "nome: " + getNome() + " quantidadeFuncionarios: " + getQuantidadeFuncionarios() + " salarioBaseFuncionario: " + getSalarioBaseFuncionario() + " endereco: " + getEndereco().toString() + " data de fundação: " + getDataFundacao().toString() + " estoque de produtos: " + getEstoqueProdutos();
    }

    public double gastosComSalario()
    {
        double salarioBaseFuncionario = getSalarioBaseFuncionario();
        if (salarioBaseFuncionario == -1) {
            return -1;
        } else {
            return salarioBaseFuncionario * getQuantidadeFuncionarios();
        }
    }

    public char tamanhoDaLoja() {
        int quantidadeFuncionarios = getQuantidadeFuncionarios();
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else {
            if (quantidadeFuncionarios < 31) {
                return 'M';
            } else {
                return 'G';
            }
        }
    }

    public void imprimeProdutos()
    {
        Produto[] produtos = getEstoqueProdutos();
        System.out.println(produtos);
    }

    public boolean insereProduto(Produto novoProduto){
        for(int i=0; i<estoqueProdutos.length; i++)
            if(estoqueProdutos[i] == null){
                estoqueProdutos[i] = novoProduto;
                return true;
            }            
        return false;
    }

    public boolean removeProduto(String nomeProduto)
    {
        for(int i=0; i<estoqueProdutos.length; i++)
        {
            if(estoqueProdutos[i] != null && nomeProduto.equals(estoqueProdutos[i].getNome())){
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }
}
