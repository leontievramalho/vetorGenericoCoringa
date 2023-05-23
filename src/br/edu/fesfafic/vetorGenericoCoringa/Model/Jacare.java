package br.edu.fesfafic.vetorGenericoCoringa.Model;

public class Jacare extends Reptil{
    public Jacare(String nome, int idade, String cor) {
        super(nome, idade, cor);
    }

    @Override
    public void emitirSom() {
        System.out.println("Raaar");
    }

    @Override
    public String toString() {
        return "Jacare{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
}
