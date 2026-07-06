package pacote1;

public class Main {
    // Q1 - Construtores (V-V-V)
    static class Carro {
        String modelo;
        public Carro() { this.modelo = "Padrão"; }
        public Carro(String modelo) { this.modelo = modelo; }
    }
    static void q1() {
        System.out.println("=== Q1 - Construtores ===");
        Carro c1 = new Carro();
        Carro c2 = new Carro("Fusca");
        System.out.println("c1: " + c1.modelo + " | c2: " + c2.modelo);
        System.out.println("✅ V - V - V\n");
    }

    // Q2 - Encapsulamento e Modificadores (V-V-F)
    static void q2() {
        System.out.println("=== Q2 - Encapsulamento e Modificadores ===");
        Pessoa p = new Pessoa();
        p.setNome("João");
        System.out.println("Nome: " + p.getNome());
        System.out.println("✅ V - V - F\n");
    }

    // Q3 - Função do construtor (B)
    static class Produto { String nome; double preco; public Produto(String n, double p) { nome = n; preco = p; } }
    static void q3() {
        System.out.println("=== Q3 - Função do construtor ===");
        Produto p = new Produto("Mouse", 50);
        System.out.println("Produto: " + p.nome + " - R$ " + p.preco);
        System.out.println("✅ B - Inicializar atributos do objeto\n");
    }

    // Q4 - public (C)
    static class ExemploPublic { public String msg = "Acessível!"; }
    static void q4() {
        System.out.println("=== Q4 - public ===");
        ExemploPublic obj = new ExemploPublic();
        System.out.println(obj.msg);
        System.out.println("✅ C - public\n");
    }

    // Q5 - Getter (A)
    static class Aluno { private String nome; public String getNome() { return nome; } public void setNome(String n) { nome = n; } }
    static void q5() {
        System.out.println("=== Q5 - Getter ===");
        Aluno a = new Aluno();
        a.setNome("Maria");
        System.out.println("Nome: " + a.getNome());
        System.out.println("✅ A - getNomeAtributo()\n");
    }

    // Q6 - Sobrecarga (A)
    static class Livro {
        String titulo, autor;
        public Livro() { this.titulo = "Desconhecido"; this.autor = "Desconhecido"; }
        public Livro(String t) { this.titulo = t; this.autor = "Desconhecido"; }
        public Livro(String t, String a) { this.titulo = t; this.autor = a; }
    }
    static void q6() {
        System.out.println("=== Q6 - Sobrecarga ===");
        Livro l1 = new Livro(); Livro l2 = new Livro("Java"); Livro l3 = new Livro("POO", "Maria");
        System.out.println("l1: " + l1.titulo + " | l2: " + l2.titulo + " | l3: " + l3.titulo);
        System.out.println("✅ A - Vários construtores com mesmo nome e parâmetros diferentes\n");
    }

    // Q7 a Q10 - Abertas
    static void q7() { System.out.println("=== Q7 - Encapsulamento ===\n📌 Ocultar dados com private + getters/setters.\n"); }
    static void q8() {
        System.out.println("=== Q8 - Modificadores ===");
        System.out.println("📌 private → classe | default → pacote | protected → pacote+sub | public → qualquer\n");
    }
    static void q9() {
        System.out.println("=== Q9 - Sobrecarga ===");
        System.out.println("📌 Múltiplos construtores com parâmetros diferentes.\n");
    }
    static void q10() {
        System.out.println("=== Q10 - Getters/Setters ===");
        System.out.println("📌 Getters leem, Setters modificam, mantendo encapsulamento.\n");
    }

    public static void main(String[] args) {
        System.out.println("=".repeat(50) + "\n📝 AV2 - TODAS AS QUESTÕES\n" + "=".repeat(50) + "\n");
        q1(); q2(); q3(); q4(); q5(); q6(); q7(); q8(); q9(); q10();
        System.out.println("=".repeat(50) + "\n✅ AV2 - TODAS AS RESPOSTAS EXECUTADAS!");
    }
}