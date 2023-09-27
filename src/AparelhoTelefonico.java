public interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void receberChamada(String chamador);
    void encerrarChamada();
    void enviarMensagem(String destinatario, String mensagem);
    void receberMensagem(String remetente, String mensagem);
}