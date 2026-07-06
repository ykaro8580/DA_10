package pacote2;

import pacote1.ExemploModificador;

public class TesteOutroPacote {
    public static void main(String[] args) {
        ExemploModificador obj = new ExemploModificador();
        System.out.println("=== public em OUTRO PACOTE ===");
        System.out.println("public: " + obj.publico);  // ✅ funciona!
        System.out.println("\n✅ public funciona em qualquer pacote");
    }
}