import java.util.Scanner;
import java.util.Date;

public class Ordenacao{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um tamanho pro vetor, 0 encerra: ");
        int n = sc.nextInt();
        MeuVetor v1;
        while (n > 0){
            v1 = new MeuVetor(n);
            v1.preencheVetor();

            // System.out.println("Vetor gerado: \n " + v1);
            // int comparacoes = v1.BubbleSort();
            // System.out.println("Vetor ordenado: \n"+ v1);
            // System.out.println("Tamanho = " + n + ", comparacoes = " + comparacoes);

            long inicio = new Date().getTime();
            v1.BubbleSort();
            long fim = new Date().getTime();
            System.out.println("Tamanho: "+ n + ", demorou " + (fim - inicio) + " ms");
            System.out.println("Digite um tamanho pro vetor, 0 encerra: ");
            n = sc.nextInt();
        }
        sc.close();
    }
}