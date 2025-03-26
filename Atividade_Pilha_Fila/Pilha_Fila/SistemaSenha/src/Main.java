public class Main {
    public static void main(String[] args) {
        SistemaSenhas sistema = new SistemaSenhas();
        sistema.gerarSenha();
        sistema.gerarSenha();
        sistema.gerarSenha();
        sistema.chamarProximo();
        sistema.chamarProximo();
        sistema.exibirHistorico();
    }
}