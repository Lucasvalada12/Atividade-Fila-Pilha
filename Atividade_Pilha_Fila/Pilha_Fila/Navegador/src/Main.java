public class Main {
    public static void main(String[] args) {
        Navegador navegador = new Navegador();
        navegador.acessarPagina("google.com");
        navegador.acessarPagina("inkarnate.com");
        navegador.acessarPagina("outlook.live.com");
        navegador.botaoVoltar();
        navegador.botaoVoltar();
        navegador.botaoAvancar();
    }
}