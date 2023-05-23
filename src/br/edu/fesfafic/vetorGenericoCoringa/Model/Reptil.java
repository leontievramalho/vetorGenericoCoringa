package br.edu.fesfafic.vetorGenericoCoringa.Model;

public abstract class Reptil extends Animal{
    public Reptil(String nome, int idade, String cor) {
        super(nome, idade, cor);
    }

    @Override
    public String toString() {
        return "Reptil{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
}
