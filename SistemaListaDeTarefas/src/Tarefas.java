public class Tarefas {
    private String nome, descricao;
    private boolean situacao;

    // construtor das tarefas
    public Tarefas(String nomeTarefa, String descTarefa){
        nome = nomeTarefa;
        descricao = descTarefa;
        situacao = false;
    }

    // getter e setter de Nome
    public String getNome(){
        return nome;
    }
    public void setNome(String novoNome){
        nome = novoNome;
    }

    // getter e setter de Descrição
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String novaDescricao){
        descricao = novaDescricao;
    }

    // getter e setter de Situação
    public String Situacao(){
        if (situacao){
            return "Concluída";
        }
        else {
            return "Pendente";
        }
    }
    public void setSituacao(boolean novaSituacao){
        situacao = novaSituacao;
    }
}
