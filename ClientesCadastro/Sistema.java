import java.util.*;
public class Sistema{
	private List<PF> clientespf;
	private List<PJ> clientespj;
	
	public Sistema(){
		clientespf=new ArrayList<PF>();
		clientespj=new ArrayList<PJ>();
	} 
	public void addClientepf(PF x){
		clientespf.add(x);
	}
	public void addClientepj(PJ x){
		clientespj.add(x);
	}
	public void removeClientepf(PF x){
		clientespf.remove(x);	
	}
	public void removeClientepj(PJ x){
		clientespj.remove(x);	
	}
	public int qtdClientesTotal(){
		return (clientespf.size()+clientespj.size());
	}
	public int qtdClientesPF(){
		return clientespf.size();
	}
	public int qtdClientesPJ(){
		return clientespj.size();
	}
	public void imprimirpfs(){
		for(int i = 0; i < clientespf.size(); i++){
    			clientespf.get(i).imprimirDados();
		}
	}
	public void imprimirpjs(){
		for(int i = 0; i < clientespj.size(); i++){
   			clientespj.get(i).imprimirDados();
		}
	}
	
}
