package br.edu.fesfafic.vetorGenericoCoringa.Vetor;

import br.edu.fesfafic.vetorGenericoCoringa.Model.Animal;

import java.util.Arrays;

public class VetorAnimal<T extends Animal> {
    public Animal[] vetor;

    public VetorAnimal(int tamanhoVetor){
        this.vetor = new Animal[tamanhoVetor];
    }

    public void insert(T animal){
        for (int i = 0; i < this.vetor.length; i++) {
            if (this.vetor[i] == null){
                this.vetor[i] = animal;
                break;
            }
        }
    }

    public void removeByPosition(int posicao){
        this.vetor[posicao] = null;
    }

    public Animal getByPosition(int posicao){
        return this.vetor[posicao];
    }

    @Override
    public String toString() {
        return Arrays.toString(vetor);
    }
}
