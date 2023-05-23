package br.edu.fesfafic.vetorGenericoCoringa.Model;

public class Cobra extends Reptil {
    public double comprimento;
    public Cobra(String nome, int idade, String cor, double comprimento) {
        super(nome, idade, cor);
        this.comprimento = comprimento;
    }

    @Override
    public void emitirSom() {
        System.out.println("pssssss");
    }

    @Override
    public String toString() {
        return "Cobra{" +
                "comprimento=" + comprimento +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
}
