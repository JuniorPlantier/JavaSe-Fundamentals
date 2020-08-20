import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(4,"Arroz", 2.9);
		Produto p2 = new Produto(3,"Feijão", 4.5);
		Produto p3 = new Produto(1,"Macarrão", 7.5);
		Produto p4 = new Produto(5,"Lasanha", 2.9);
		Produto p5 = new Produto(2,"Picanha", 4.78);
		Produto p6 = new Produto(6,"Arroz", 2.9);
		
		//Set<Produto> produtos =  new TreeSet<>(); // exclui duplicado
		//Set<Produto> produtos =  new TreeSet<>(new DescricaoComparator());
		List<Produto> produtos = new ArrayList<>(); // Mantêm a ordem de inserção
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		produtos.add(p6);
		
		//Collections.sort(produtos);
		Collections.sort(produtos, new DescricaoComparator());
		
		for(Produto produto : produtos) {
			System.out.println(produto);
		}
	}
}