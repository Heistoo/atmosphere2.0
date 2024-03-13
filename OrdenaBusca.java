import java.util.Scanner;

public class OrdenaBusca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MeuVetor v1; // não instanciado so declarado, vamos alocar memoria e liberar
        System.out.println("digite n para o tamanho do vetor, 0 encerra: ");
        int n = sc.nextInt();
        while (n > 0){
            v1 = new MeuVetor(n); // alocamos um novo vetor que recebe um vetor de parametro capacidade digitado pelo usuário
            v1.preencheVetor(); // invocamos o v1 e falamos para ele se preencher
            //System.out.println("vetor gerado: " + v1);
            System.out.println("digite um valor para busca: ");
            double x = sc.nextDouble();
            Retorno r = v1.buscaSimples(x);
            // esse cara não é mais sum boolean temos que mudar o retorno, veja que a atribuição ocorre no = v1.buscaSimples(x);
            //estamos instanciando o vetor dentro do laço, então ele é recriado a cada vez que o laço é executado
            // a cada vetor que o usuário digita, um novo vetor é ocupado na memória, e o antigo é liberado
            // vamos realizar o método de busca usando os atributos do vetor
            if(r.getAchou())
                System.out.println(x + " valor encontrado pela busca simples ");
            else
                System.out.println(x + " valor não encontrado pela busca simples");
            System.out.println("Busca Simples realizou " + r.getCont() + " comparacoes");

            System.out.println("\nOrdenando...");
            v1.bubbleSort();
            // aqui é onde o programa fica lento, por causa da ordenação
            //System.out.println("vetor ordenado: " + v1);
            r = v1.buscaBinaria(x);
            // recebe o que a buscaBinária devolve

            if (r.getAchou())
                System.out.println(x + " valor encontrado pela busca binaria");
            else
                System.out.println(x + " valor nao encontrado pela busca binaria");
            System.out.println("Busca Binaria realizou " + r.getCont() + " comparacoes");
            
            System.out.println("digite n para o tamanho do vetor, 0 encerra: ");
            n = sc.nextInt();
        }
    }
}
