

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String modelo;
    private int armazenamento;
    private int bateria;
    private boolean conectadoAInternet;

    public Iphone(String modelo, int armazenamento, int bateria) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.bateria = bateria;
        this.conectadoAInternet = false;
    }

    @Override
    public void play() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pause() {
        System.out.println("Pausando música...");
    }

    @Override
    public void stop() {
        System.out.println("Parando música...");
    }

    @Override
    public void nextTrack() {
        System.out.println("Próxima faixa...");
    }

    @Override
    public void previousTrack() {
        System.out.println("Faixa anterior...");
    }

    @Override
    public void ajustarVolume(int volume) {
        System.out.println("Ajustando volume para " + volume);
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero);
    }

    @Override
    public void receberChamada(String chamador) {
        System.out.println("Recebendo chamada de " + chamador);
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada");
    }

    @Override
    public void enviarMensagem(String destinatario, String mensagem) {
        System.out.println("Enviando mensagem para " + destinatario + ": " + mensagem);
    }

    @Override
    public void receberMensagem(String remetente, String mensagem) {
        System.out.println("Mensagem recebida de " + remetente + ": " + mensagem);
    }

    @Override
    public void abrirPaginaWeb(String url) {
        System.out.println("Abrindo página da web: " + url);
    }

    @Override
    public void fecharPaginaWeb() {
        System.out.println("Fechando página da web");
    }

    @Override
    public void navegarParaFrente() {
        System.out.println("Navegando para a página seguinte");
    }

    @Override
    public void navegarParaTras() {
        System.out.println("Navegando para a página anterior");
    }

    @Override
    public void realizarPesquisa(String query) {
        System.out.println("Realizando pesquisa: " + query);
    }

    @Override
    public void salvarFavorito(String url, String titulo) {
        System.out.println("Salvando favorito: " + titulo + " - " + url);
    }
}
