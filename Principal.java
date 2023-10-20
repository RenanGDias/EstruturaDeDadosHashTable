public class Principal {
    public static void main(String[] args) {
        TabelaHash tabelaHash = new TabelaHash(10);

        // Inserir elementos na tabela hash
        tabelaHash.inserir(15, "Objeto1");
        tabelaHash.inserir(25, "Objeto2");
        tabelaHash.inserir(35, "Objeto3");
        tabelaHash.inserir(45, "Objeto4");

        // Exibir a tabela hash
        System.out.println("Tabela Hash:");
        tabelaHash.exibir();
    }
}
