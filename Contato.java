package entitadades;

import java.util.ArrayList;
import java.util.List;

public class Contato {
    private String nome;
    private Integer numero;

    private List<Contato> contatos = new ArrayList<>();

    public Contato(){
    }

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void addContato(Contato contato){
        contatos.add(contato);
    }

    public void removeContato(Contato contato){
        contatos.remove(contato);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
       // sb.append("Contatos: " );
        sb.append("Nome: ");
        sb.append(nome + ", ");
        sb.append("Número: ");
        sb.append(numero);

        return sb.toString();

    }


}
