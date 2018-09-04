import java.util.*;
public class Sistema{
	private List<Cliente> clientes;
	
	public Sistema(){
		clientes=new ArrayList<Cliente>();
	} 
	public void addCliente(Cliente x){
		clientes.add(x);
	}
	public void removeCliente(Cliente x){
		clientes.remove(x);	
	}
	public int qtdClientesTotal(){
	
		return clientes.size();
	}
	public int qtdClientesPF(){
		int aux = 0;
		for(int i = 0; i < clientes.size(); i++){
			if(clientes instanceof PF){
    				aux++;
			}
		}
		return aux;
	}
	public int qtdClientesPJ(){
		int aux = 0;
		for(int i = 0; i < clientes.size(); i++){
			if(clientes instanceof PJ){
    				aux++;
			}
		}
		return aux;
	}
	public void imprimir(){
		for(int i = 0; i < clientes.size(); i++){
			clientes.get(i).imprimirDados();
		}
	}
	
}
