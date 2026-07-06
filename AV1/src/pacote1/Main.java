package pacote1;

public class Main {
    // Q1 - POO (V-V-V)
    static class Carro { String modelo; }
    static void q1() {
        System.out.println("=== Q1 - POO ===");
        Carro c = new Carro();
        c.modelo = "Fusca";
        System.out.println("Classe Carro → objeto: " + c.modelo);
        System.out.println("✅ V - V - V\n");
    }

    // Q2 - Modificadores (V-F-V)
    static void q2() {
        System.out.println("=== Q2 - Modificadores ===");
        ExemploModificador obj = new ExemploModificador();
        System.out.println("public: " + obj.publico);
        System.out.println("default: " + obj.padrao);
        System.out.println("✅ V - F - V\n");
    }

    // Q3 - Construtor (B)
    static class Aluno { String nome; public Aluno(String nome) { this.nome = nome; } }
    static void q3() {
        System.out.println("=== Q3 - Construtor ===");
        Aluno a = new Aluno("João");
        System.out.println("Aluno: " + a.nome);
        System.out.println("✅ B - Um método especial para inicializar objetos\n");
    }

    // Q4 - private (B)
    static class Conta { private double saldo; public Conta(double s) { saldo = s; } public double getSaldo() { return saldo; } }
    static void q4() {
        System.out.println("=== Q4 - private ===");
        Conta c = new Conta(1000);
        System.out.println("Saldo: " + c.getSaldo());
        System.out.println("✅ B - private\n");
    }

    // Q5 - this (B)
    static class Pessoa { String nome; public Pessoa(String nome) { this.nome = nome; } }
    static void q5() {
        System.out.println("=== Q5 - this ===");
        Pessoa p = new Pessoa("Maria");
        System.out.println("Nome: " + p.nome);
        System.out.println("✅ B - Referenciar o próprio objeto\n");
    }

    // Q6 - Encapsulamento (B)
    static class Produto {
        private String nome; private double preco;
        public void setNome(String n) { if (n != null && !n.isEmpty()) nome = n; }
        public String getNome() { return nome; }
        public void setPreco(double p) { if (p > 0) preco = p; }
        public double getPreco() { return preco; }
    }
    static void q6() {
        System.out.println("=== Q6 - Encapsulamento ===");
        Produto p = new Produto();
        p.setNome("Notebook"); p.setPreco(2500);
        System.out.println("Produto: " + p.getNome() + " - R$ " + p.getPreco());
        System.out.println("✅ B - Proteção dos dados\n");
    }

    // Q7 - Classe vs Objeto (ABERTA)
    static void q7() {
        System.out.println("=== Q7 - Classe vs Objeto ===");
        System.out.println("📌 CLASSE: molde (projeto do carro)");
        System.out.println("📌 OBJETO: instância (carro construído)\n");
    }

    // Q8 - Construtor Padrão vs Parametrizado (ABERTA)
    static void q8() {
        System.out.println("=== Q8 - Construtor Padrão vs Parametrizado ===");
        System.out.println("📌 PADRÃO: sem parâmetros (new Carro())");
        System.out.println("📌 PARAMETRIZADO: com parâmetros (new Carro('Fusca'))\n");
    }

    // Q9 - Encapsulamento (ABERTA)
    static void q9() {
        System.out.println("=== Q9 - Encapsulamento ===");
        System.out.println("📌 Ocultar dados com private + getters/setters públicos.\n");
    }

    // Q10 - Modificadores (ABERTA)
    static void q10() {
        System.out.println("=== Q10 - Modificadores ===");
        System.out.println("📌 public → qualquer classe");
        System.out.println("📌 protected → pacote + subclasses");
        System.out.println("📌 default → mesmo pacote");
        System.out.println("📌 private → apenas dentro da classe\n");
    }

    public static void main(String[] args) {
        System.out.println("=".repeat(50) + "\n📝 AV1 - TODAS AS QUESTÕES\n" + "=".repeat(50) + "\n");
        q1(); q2(); q3(); q4(); q5(); q6(); q7(); q8(); q9(); q10();
        System.out.println("=".repeat(50) + "\n✅ AV1 - TODAS AS RESPOSTAS EXECUTADAS!");
    }
}