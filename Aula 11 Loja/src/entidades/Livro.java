package entidades;


import interfaces.Produtos;

public class Livro implements Produtos {

    private String nome;
    private String descricao;
    private  double preco;
    private String autor;

    public Livro(String nome,
                 String descricao,
                 String autor,
                 double preco){
        this.nome=nome;
        this.autor=autor;
        this.descricao=descricao;
        this.preco=preco;


    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }
}
