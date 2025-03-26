import java.util.Stack;

public class Navegador {
        private Stack<String> voltar;
        private Stack<String> avancar;
        private String paginaAtual;

        public Navegador() {
            voltar = new Stack<>();
            avancar = new Stack<>();
            paginaAtual = null;
        }

        public void acessarPagina(String url) {
            if (paginaAtual != null) {
                voltar.push(paginaAtual);
            }
            paginaAtual = url;
            avancar.clear(); // Sempre que acessa uma nova página, limpa o avançar
            System.out.println("Página atual: " + paginaAtual);
            exibirStatus();
        }

        public void botaoVoltar() {
            if (voltar.isEmpty()) {
                System.out.println("Botão voltar desativado.");
                return;
            }
            avancar.push(paginaAtual);
            paginaAtual = voltar.pop();
            System.out.println("Página atual: " + paginaAtual);
            exibirStatus();
        }

        public void botaoAvancar() {
            if (avancar.isEmpty()) {
                System.out.println("Botão avançar desativado.");
                return;
            }
            voltar.push(paginaAtual);
            paginaAtual = avancar.pop();
            System.out.println("Página atual: " + paginaAtual);
            exibirStatus();
        }

        private void exibirStatus() {
            System.out.println("Voltar: " + voltar);
            System.out.println("Avançar: " + avancar);
        }
    }
