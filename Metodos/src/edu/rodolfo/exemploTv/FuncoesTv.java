package edu.rodolfo.exemploTv;

public class FuncoesTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void baixarVolume() {
        volume++;
    }

    public void aumentarcanal() {
        canal++;
    }

    public void diminuircanal() {
        canal--;

    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

}
