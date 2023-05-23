package br.edu.fesfafic.vetorGenericoCoringa.Model;

public abstract class Ave extends Animal {
    public Ave(String nome, int idade, String cor) {
        super(nome, idade, cor);
    }

    @Override
    public void emitirSom() {
        System.out.println("Cantando...");
    }
    public void voar(){
        System.out.println("Voando...");
    }

    @Override
    public String toString() {
        return "Ave{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
}
