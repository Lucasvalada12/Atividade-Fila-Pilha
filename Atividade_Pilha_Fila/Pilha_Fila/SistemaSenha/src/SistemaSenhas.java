import java.util.LinkedList;
import java.util.Queue;

public class SistemaSenhas {
    private Queue<Integer> filaSenhas;
    private LinkedList<Integer> historico;
    private int proximaSenha;

    public SistemaSenhas() {
        filaSenhas = new LinkedList<>();
        historico = new LinkedList<>();
        proximaSenha = 1;
    }

    public void gerarSenha() {
        filaSenhas.add(proximaSenha);
        System.out.println("Senha gerada: " + proximaSenha);
        proximaSenha++;
    }

    public void chamarProximo() {
        if (filaSenhas.isEmpty()) {
            System.out.println("Nenhum paciente na fila.");
            return;
        }
        int senha = filaSenhas.poll();
        historico.add(senha);
        System.out.println("Chamando senha: " + senha);
    }

    public void exibirHistorico() {
        System.out.println("Histórico de senhas chamadas: " + historico);
    }
}
