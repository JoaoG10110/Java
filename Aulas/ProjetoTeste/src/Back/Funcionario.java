package Back;

import java.util.ArrayList;

public class Admin extends Funcionario {
    ArrayList<Funcionario> ListaFunc;
    ArrayList<Produto> ListaProd;
    
    public Admin(){
        ListaFunc = new ArrayList();
        ListaProd = new ArrayList();
    }
    public Admin(String user_funcionario, int registro_funcionario, String senha_acesso_funcionario) {
        super(user_funcionario, registro_funcionario, senha_acesso_funcionario);
        ListaFunc = new ArrayList();
        ListaProd = new ArrayList();
    }

    public ArrayList<Funcionario> getListaFunc() {
        return ListaFunc;
    }

    public void setListaFunc(ArrayList<Funcionario> ListaFunc) {
        this.ListaFunc = ListaFunc;
    }

    public ArrayList<Produto> getListaProd() {
        return ListaProd;
    }

    public void setListaProd(ArrayList<Produto> ListaProd) {
        this.ListaProd = ListaProd;
    }
    
    public void adicionarFuncionario(Funcionario F){
        ListaFunc.add(F);
    }
    
    public void removerFuncionario(Funcionario F){
        ListaFunc.remove(F);
    }
    
    public void adicionarProduto(Produto P){
        ListaProd.add(P);
    }
    
    public void removerProduto(Produto P){
        ListaProd.remove(P);
    }
}
