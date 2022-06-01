package Classes_func_prod;

import java.util.ArrayList;

public class Funcionario {
    private String nomeFuncionario;
    private int idFuncionario;
    private String senhaFuncionario;
    ArrayList<Funcionario> ListaFunc;

    public Funcionario() {
        ListaFunc = new ArrayList();
    }
    public Funcionario(String userFuncionario, int registroFuncionario, String senhaAcessoFuncionario) {
        this.nomeFuncionario = userFuncionario;
        this.idFuncionario = registroFuncionario;
        this.senhaFuncionario = senhaAcessoFuncionario;
        ListaFunc = new ArrayList();
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    public ArrayList<Funcionario> getListaFunc() {
        return ListaFunc;
    }

    public void setListaFunc(ArrayList<Funcionario> ListaFunc) {
        this.ListaFunc = ListaFunc;
    }
    
    public void addFunc(Funcionario F){
        ListaFunc.add(F);
    }
}
