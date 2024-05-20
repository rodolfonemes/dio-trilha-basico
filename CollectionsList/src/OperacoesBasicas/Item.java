package OperacoesBasicas;

public class Item {

    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preco = preço;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item [nome=" + nome + ", preço=" + preco + ", quantidade=" + quantidade + "]";
    }

}
