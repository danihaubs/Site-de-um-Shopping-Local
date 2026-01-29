public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas; 
    
    public Shopping(String nome, Endereco endereco, int maxLojas) 
    {
        this.nome = nome; 
        this.endereco = endereco;
        this.lojas = new Loja[maxLojas];
        for(int i=0; i<lojas.length; i++)
        {
            lojas[i] = null;
        }
    }

    public String getNome()
    {
        return nome;
    }

    public Endereco getEndereco()
    {
        return endereco;
    }

    public Loja[] getLojas()
    {
        return lojas;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
    }

    public void setLojas(Loja[] lojas)
    {
        this.lojas = lojas;
    }

    public String toString()
    {
        return "nome: " + getNome() + " endereco: " + getEndereco().toString() + " lojas: " + getLojas();
    }

    public boolean insereLoja(Loja novaLoja){
        for(int i=0; i<lojas.length; i++)
            if(lojas[i] == null){
                lojas[i] = novaLoja;
                return true;
            }            
        return false;
    }

    public boolean removeLoja(String nomeLoja)
    {
        for(int i=0; i<lojas.length; i++)
        {
            if(lojas[i] != null && nomeLoja.equals(lojas[i].getNome())){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public String tipoLoja(Loja loja)
    {
        String nomeClasse = loja.getClass().getSimpleName();

        if (nomeClasse == "Informatica")
        {
            return "Informática";
        } else {
            if(nomeClasse == "Cosmetico")
            {
                return "Cosmético";
            } else {
                if(nomeClasse == "Alimentacao")
                {
                    return "Alimentação";
                } else {
                    if(nomeClasse == "Vestuario")
                    {
                        return "Vestuário";
                    } else {
                        return nomeClasse;
                    }
                }
            }
        }
    }

    public int quantidadeLojasPorTipo(String tipoLoja)
    {
        int count = 0;
        if("Cosmético".equals(tipoLoja) || "Vestuário".equals(tipoLoja) || "Bijuteria".equals(tipoLoja) || "Alimentação".equals(tipoLoja) || "Informática".equals(tipoLoja))
        {
            for(int i=0; i<lojas.length; i++)
            {
                if(tipoLoja(lojas[i]).equals(tipoLoja)){
                    count++;
                }
            }
            return count;
        } else {
            return -1;
        }
    }

    public Informatica lojaSeguroMaisCaro()
    {
        Informatica maisCaro = null;

        for(int i=0; i<lojas.length; i++)
        {
            if(tipoLoja(lojas[i]).equals("Informática")){
                if(maisCaro == null || ((Informatica) lojas[i]).getSeguroEletronicos() > maisCaro.getSeguroEletronicos())
                {
                    maisCaro = (Informatica) lojas[i];
                }
            }
        }
        return (Informatica) maisCaro;
    }

}
