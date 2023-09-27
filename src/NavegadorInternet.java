public interface NavegadorInternet {
    void abrirPaginaWeb(String url);

    void fecharPaginaWeb();

    void navegarParaFrente();

    void navegarParaTras();

    void realizarPesquisa(String query);

    void salvarFavorito(String url, String titulo);
}
