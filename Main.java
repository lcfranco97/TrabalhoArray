package aplicacao;

import entitadades.Contato;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Contato> contato = new ArrayList<>();
        contato.add(new Contato("Maria", 1));
        contato.add(new Contato("José", 2));
        contato.add(new Contato("Carlos", 3));
        contato.add(new Contato("Carla", 4));
        contato.add(new Contato("Pedro", 5));

        for (Contato obj : contato) {
            System.out.println(obj.toString());
        }

        System.out.println("-----------");
        System.out.println("Lista removida: ");
        contato.remove(0);
        System.out.println(contato);
        System.out.println("-----------");
        System.out.println("Tamanho da lista: ");
        System.out.println("Número de contatos atual da lista: " + contato.size());







    }
}
