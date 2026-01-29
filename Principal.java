import java.util.*;

public class Principal {
    public static void main(String[] args) {
        String opcao = "";
        boolean inicio = true;
        Scanner leitor = new Scanner(System.in);

        while (inicio == true){
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");

            opcao = leitor.next();

            if("3".equals(opcao) || "2".equals(opcao) || "1".equals(opcao)) {
                inicio = false;
            } else {
                System.out.println("Opção inválida: " + opcao);
            }
        }
        if ("3".equals(opcao)) {
            System.out.println("Encerrando programa");
        } else {
            if ("2".equals(opcao)){
                System.out.println("Criando um produto");
                System.out.println("Digite o nome do produto");
                String nomeProduto = leitor.next();
                System.out.println("Digite o preco do produto");
                double precoProduto = Double.parseDouble(leitor.next());
                System.out.println("Digite o dia da validade do produto");
                int diaValidade = Integer.parseInt(leitor.next());
                System.out.println("Digite o mes da validade do produto");
                int mesValidade = Integer.parseInt(leitor.next());;
                System.out.println("Digite o ano da validade do produto");
                int anoValidade = Integer.parseInt(leitor.next());;
                Data validadeProduto = new Data(diaValidade, mesValidade, anoValidade);
                Produto produto = new Produto(nomeProduto, precoProduto, validadeProduto);
                System.out.println(produto.toString());
                Data data = new Data(20, 10, 2023);

                if(produto.estaVencido(data)) {
                    System.out.println("PRODUTO VENCIDO");
                } else {
                    System.out.println("PRODUTO NÃO VENCIDO");
                }
            } else {
                if ("1".equals(opcao)){
                    System.out.println("Criando uma loja");
                    System.out.println("Digite o nome da loja");
                    String nomeLoja = leitor.next();
                    System.out.println("Digite a quantidade de funcionários");
                    int quantidadeFuncionarios = Integer.parseInt(leitor.next());;
                    System.out.println("Digite o nome da rua");
                    String rua = leitor.next();
                    System.out.println("Digite o nome da cidade");
                    String cidade = leitor.next();
                    System.out.println("Digite o nome da estado");
                    String estado = leitor.next();
                    System.out.println("Digite o nome do país");
                    String pais = leitor.next();
                    System.out.println("Digite o CEP");
                    String cep = leitor.next();
                    System.out.println("Digite o número");
                    String numero = leitor.next();
                    System.out.println("Digite o complemento");
                    String complemento = leitor.next();
                    Endereco enderecoLoja = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);
                    System.out.println("Digite o dia de fundação");
                    int fundacaoDia = Integer.parseInt(leitor.next());
                    System.out.println("Digite o mês de fundação");
                    int fundacaoMes = Integer.parseInt(leitor.next());
                    System.out.println("Digite o ano de fundação");
                    int fundacaoAno = Integer.parseInt(leitor.next());
                    System.out.println("Digite o salário base");
                    double salarioBase = Double.parseDouble(leitor.next());
                    Data dataFundacao = new Data(fundacaoDia, fundacaoMes, fundacaoAno);
                    System.out.println("Digite o numero maximo de produtos no estoque");
                    int maxProdutos = Integer.parseInt(leitor.next());
                    Loja loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBase, enderecoLoja, dataFundacao, maxProdutos);
                    System.out.println("Informacoes da loja");
                    System.out.println(loja.toString());
                }
            }

        }
    }
}
