package br.edu.fesfafic.vetorGenericoCoringa.Model;

public class Passaro extends Ave{
    public Passaro(String nome, int idade, String cor) {
        super(nome, idade, cor);
    }

    @Override
    public String toString() {
        return "Passaro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
}
