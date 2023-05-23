package br.edu.fesfafic.vetorGenericoCoringa.Model;

public class Avestruz extends Ave{
    public Avestruz(String nome, int idade, String cor) {
        super(nome, idade, cor);
    }

    @Override
    public void emitirSom() {
        System.out.println("aahn");
    }

    @Override
    public void voar() {
        System.out.println("Não consegue voar");
    }

    public void correr(){
        System.out.println("Correndo velozmente.");
    }

    @Override
    public String toString() {
        return "Avestruz{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
}
