import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        String nome, descricao;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println(" - - - - - LISTA DE TAREFAS - - - - - ");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Remover Tarefa");
            System.out.println("3 - Visualizar Tarefa");
            System.out.println("4 - Concluir Tarefa");
            System.out.println("0 - Encerrar");
            System.out.print("Opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome da tarefa: ");
                    nome = sc.nextLine();
                    System.out.print("Informe a descrição: ");
                    descricao = sc.nextLine();
                    gerenciador.adicionarTarefa(nome, descricao);
                    break;
                case 2:
                    System.out.print("Informe o nome da tarefa que quer remover: ");
                    nome = sc.nextLine();
                    gerenciador.removerTarefa(nome);
                    System.out.println(" ---- A Tarefa: " + nome + " foi removida ✓ ---- ");
                    break;
                case 3:
                    gerenciador.visualizarTarefa();
                    break;
                case 4:
                    System.out.print("Informe o nome da tarefa que quer concluir: ");
                    nome = sc.nextLine();
                    gerenciador.concluirTarefa(nome);
                    System.out.println(" ---- A Tarefa: " + nome + " foi concluída ✓ ---- ");
                    break;
                case 0:
                    System.out.println(" ---- Seção Finalizada com Sucesso ---- ");
                    break;
            }
        }
    }
}