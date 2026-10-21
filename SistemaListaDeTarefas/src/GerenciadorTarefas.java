import java.util.ArrayList;

public class GerenciadorTarefas {
    protected ArrayList<Tarefas> listaDeTarefas;

    public GerenciadorTarefas(){
        listaDeTarefas = new ArrayList<>(); // aqui precisamos de um contrutor para inicialiazar a lista na criacao do objeto
    }


    public void adicionarTarefa(String nomeNovaTarefa, String nomeNovaDescricao){  // adicionarTarefa recebe do lado de fora o nome da tarefa e a descricao
        Tarefas tarefa = new Tarefas(nomeNovaTarefa, nomeNovaDescricao);          // criacao do objeto "tarefa" do tipo "Tarefa"
        listaDeTarefas.add(tarefa);                                              // adicionando a tarefa na listaDeTarefas
    }

    public void removerTarefa(String nomeTarefa){       // removerTarefa recebe o nome da tarefa que o usuario qr remover
        for (Tarefas tarefa : listaDeTarefas){         // for-each para percorer a lista de tarefas "para cada tarefa, dentro de listaDeTarefas..."
            if (tarefa.getNome().equals(nomeTarefa)){ // tarefa.getNome(), retorna o nome da tarefa e compara com o nomeTarefa
                listaDeTarefas.remove(tarefa);       // Se forem iguais remova da listaDeTarefas
                break;                              // break para n percorer o resto da lista sem necessidade
            }
        }
    }

    public void visualizarTarefa(){
        for (Tarefas tarefa : listaDeTarefas){
            System.out.println(
                    "\n--------------" +
                    "\nNome da Tarefa: " + tarefa.getNome() +
                    "\nDescrição: " + tarefa.getDescricao() +
                    "\nSituação: " + tarefa.Situacao() +
                    "\n--------------"
            );
        }
    }

    public void concluirTarefa(String nomeTarefa){
        for (Tarefas tarefa : listaDeTarefas) {
            if (tarefa.getNome().equals(nomeTarefa)) {
                tarefa.setSituacao(true);
                break;
            }
        }
    }
}