package OperacoesBasicas;

public class Tarefa {

    private String descrisao;

    public Tarefa(String descrisao) {
        this.descrisao = descrisao;
    }

    public String getDescrisao() {
        return descrisao;
    }

    @Override
    public String toString() {
        return descrisao;
    }

}
