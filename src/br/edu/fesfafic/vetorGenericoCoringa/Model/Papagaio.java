package br.edu.fesfafic.vetorGenericoCoringa.Model;

public class Papagaio extends Ave{
    public Papagaio(String nome, int idade, String cor) {
        super(nome, idade, cor);
    }

    @Override
    public void emitirSom() {
        System.out.println("Pruuu");
    }
    public void emitirSom(String frase){
        System.out.println(frase);
    }

    @Override
    public String toString() {
        return "Papagaio{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
}
