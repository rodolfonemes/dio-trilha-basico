package edu.rodolfo.exemploTv;

public class Tv {
    public static void main(String[] args) {
        System.out.println("Este App vai controlar minha TV");

        FuncoesTv tv = new FuncoesTv();

        System.out.println("TV ligada ? " + tv.ligada);
        System.out.println("canal: " + tv.canal);
        System.out.println("volume:" + tv.volume);

        tv.ligar();
        System.out.println("Novo Status TV ligada ? " + tv.ligada);
        tv.aumentarVolume();
        System.out.println("volume:" + tv.volume);
        tv.aumentarVolume();
        System.out.println("volume:" + tv.volume);
        tv.baixarVolume();
        System.out.println("volume:" + tv.volume);
        tv.baixarVolume();
        System.out.println("volume:" + tv.volume);
        tv.aumentarcanal();
        System.out.println("canal: " + tv.canal);
        tv.diminuircanal();
        System.out.println("canal: " + tv.canal);
        tv.mudarCanal(25);
        System.out.println("canal: " + tv.canal);
    }

}
