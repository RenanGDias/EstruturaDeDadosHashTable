import java.util.LinkedList;

class TabelaHash {
    private LinkedList<LinkedList<Object>> primeiroNivel;
    private int tamanho;

    public TabelaHash(int tamanho) {
        this.tamanho = tamanho;
        primeiroNivel = new LinkedList<>();
        for (int i = 0; i < tamanho; i++) {
            primeiroNivel.add(new LinkedList<>());
        }
    }

    private int funcaoHash1(int chave) {
        return chave % tamanho;
    }

    private int funcaoHash2(int chave) {
        return chave / 10 % (tamanho / 10);
    }

    public void inserir(int chave, Object valor) {
        int indice1 = funcaoHash1(chave);
        int indice2 = funcaoHash2(chave);
        LinkedList<Object> segundoNivel = primeiroNivel.get(indice1).get(indice2);
        segundoNivel.add(valor);
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            LinkedList<Object> segundoNivel = primeiroNivel.get(i);
            for (Object item : segundoNivel) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}