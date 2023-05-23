package br.edu.fesfafic.vetorGenericoCoringa.Main;

import br.edu.fesfafic.vetorGenericoCoringa.Model.*;
import br.edu.fesfafic.vetorGenericoCoringa.Vetor.VetorAnimal;

public class Main {
    public static void main(String[] args){
        Avestruz avestruz = new Avestruz("Josefa", 3, "Preto");
        Papagaio papagaio = new Papagaio("Louro José", 10, "Verde");
        Passaro passaro = new Passaro("Rakan", 2, "Amarelo");
        Jacare jacare = new Jacare("Cuca", 5, "Verde");
        Cobra cobra = new Cobra("Orochimaru", 4, "Branco", 200);

        VetorAnimal<Animal> zoologico = new VetorAnimal<>(5);

        zoologico.insert(avestruz);

        System.out.println(zoologico);

        zoologico.insert(papagaio);
        zoologico.insert(cobra);
        zoologico.insert(passaro);
        zoologico.insert(jacare);

        System.out.println(zoologico);

        zoologico.removeByPosition(3);

        System.out.println(zoologico);


        System.out.println(zoologico.getByPosition(2));
    }
}
