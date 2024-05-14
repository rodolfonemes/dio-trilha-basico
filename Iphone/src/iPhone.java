public class iPhone implements ReprodutorDeMusica, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("LIGANDO......");
    }

    @Override
    public void atenderLigacao(String numero) {
        System.out.println("ALO");
    }

    @Override
    public void correioVoz(String mensagem, String destinatario) {
        System.out.println("DIGITANDO A MSG");
        System.out.println("SELECIONANDO O DESTINATARIO");
        System.out.println("ENVIANDO A MSG");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("ABRINDO PAGINA INICIAL");
    }

    @Override
    public void novaAba(String url) {
        System.out.println("ABRINDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");
    }

    @Override
    public void tocarMusica() {
        System.out.println("DANDO PLAY NA MUSICA");
    }

    @Override
    public void pausarMusica() {
        System.out.println("PAUSANDO A MUSICA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO A MUISCA PREFERIDA");
    }
}