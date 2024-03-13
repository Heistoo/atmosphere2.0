public class TesteRandomico {
    public static void main(String[] args){
        MeuVetor v1 = new MeuVetor(6);
        v1.preencheVetor();
        System.out.println("Vetor gerado: \n" +  v1);
        v1.BubbleSort();
        System.out.println("vetor ordenado pelo Bubble:\n" + v1);
    }
}