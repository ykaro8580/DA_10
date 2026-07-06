package pacote2;

import pacote1.Pessoa;

public class TesteOutroPacote {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        System.out.println("=== private em OUTRO PACOTE ===");
        // p.nome = "Teste"; // ❌ ERRO! private não é acessível

        p.setNome("Ana");  // ✅ via setter público
        System.out.println("Nome: " + p.getNome());  // ✅ via getter público

        System.out.println("\n✅ private NÃO é acessível em outro pacote");
        System.out.println("✅ Getters/Setters mantêm encapsulamento");
    }
}