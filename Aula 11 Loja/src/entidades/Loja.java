package entidades;
import interfaces.Produtos;
import java.util.ArrayList;

public class Loja {
    private ArrayList<Produtos>listaProdutos;

    public Loja(){

        this.listaProdutos= new ArrayList<>();
    }
    public void mostrarProdutos(){
        for (Produtos p: this.listaProdutos ){
            System.out.println("O meu produto é: "+p.getNome());
        }

    }
    public void adiconarProdutos(Produtos produtos){
        this.listaProdutos.add(produtos);
    }
}
