public class Teste1 {
    //classe de aplicação
    public static void main(String[] args) {
        MeuVetor v1 = new MeuVetor(4);
        System.out.println("ultima posicao depois da construcao: " + v1.getUltimaPos());
        System.out.println("vetor recem construido: " + v1);

        for (int i=0; i <=100; i++){
            v1.adiciona(i);
            System.out.println("adicionou " + i + " capacidade: " + v1.getV().length);
        }
        System.out.println("/////////////////////");
        while (!v1.estaVazio()) {
            System.out.println(v1.remove() + " foi atendido, capacidade: " + v1.getV().length);
        }
        System.out.println("/////////////////////");
        for (int i=0; i <=100; i++){
            v1.adiciona(i);
            System.out.println("adicionou " + i + " capacidade: " + v1.getV().length);
        }
    }
}