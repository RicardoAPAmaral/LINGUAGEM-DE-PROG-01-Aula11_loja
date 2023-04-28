package application;

import entidades.Livro;
import entidades.Loja;

public class App {
    public static void main(String[] args) {
        Loja loja_lagoa=new Loja();

        //criando um livro
        Livro livro1=new Livro("Linux para todos","livro de Linux","Sobell",250.99);
        Livro livro2=new Livro("Windows","livro de windows","willians",99.0);

        System.out.println("Aqui está adicionando os livros.");
        loja_lagoa.adiconarProdutos(livro1);
        loja_lagoa.adiconarProdutos(livro2);
        System.out.println("Aqui está listando os produtos.");
        loja_lagoa.mostrarProdutos();
    }

}
