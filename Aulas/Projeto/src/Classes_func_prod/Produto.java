package Classes_func_prod;
import java.util.ArrayList;
public class Produto {

    private String nomeProduto;
    private int codigoProduto;
    private float precoProduto;
    private String classificacaoProduto;
    private String categoriaProduto;
    private String desenvolvedorProduto;
    private String tipoProduto;
    ArrayList<Produto> listaProd;

    public Produto(){
        listaProd = new ArrayList();
    }

    public Produto(String nome_produto, int codigo_produto, float preco_produto, String classificacao_produto, String categoria_produto, String desenvolvedor_produto, String tipo_produto) {
        this.nomeProduto = nome_produto;
        this.codigoProduto = codigo_produto;
        this.precoProduto = preco_produto;
        this.classificacaoProduto = classificacao_produto;
        this.categoriaProduto = categoria_produto;
        this.desenvolvedorProduto = desenvolvedor_produto;
        this.tipoProduto = tipo_produto;
        listaProd = new ArrayList();
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getClassificacaoProduto() {
        return classificacaoProduto;
    }

    public void setClassificacaoProduto(String classificacaoProduto) {
        this.classificacaoProduto = classificacaoProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public String getDesenvolvedorProduto() {
        return desenvolvedorProduto;
    }

    public void setDesenvolvedorProduto(String desenvolvedorProduto) {
        this.desenvolvedorProduto = desenvolvedorProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public ArrayList<Produto> getListaProd() {
        return listaProd;
    }

    public void setListaProd(ArrayList<Produto> listaProd) {
        this.listaProd = listaProd;
    }
    

    public String mostrar_produto_cadastrado() {
        return "Nome do produto : " + nomeProduto
                + "\nCodigo produto: C" + codigoProduto
                + "\nPreco base: R$" + precoProduto
                + "\nClassificacao indicativa: " + classificacaoProduto
                + "\nCategoria (Genero): " + categoriaProduto
                + "\nDesenvolvedor: " + desenvolvedorProduto
                + "\nTipo do produto: " + tipoProduto
                + "\n----\n";
    }
    
    public void adicionarProduto(Produto P){
        listaProd.add(P);
    }
    
    public void removerProduto(Produto P){
        listaProd.remove(P);
    }
}