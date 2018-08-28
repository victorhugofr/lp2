import java.util.*;
public class Deposito{
	private List<Produto> produtos;
	
	public Deposito(){
		produtos=new ArrayList<Produto>();
	}
	public void addProduto(Produto x){
		produtos.add(x);
	}
	public void removeProduto(Produto x){
		produtos.remove(x);	
	}
	public int qtdProdutos(){
		return produtos.size();
	}
	public boolean estaVazio(){
		return produtos.isEmpty();
	} 
}
