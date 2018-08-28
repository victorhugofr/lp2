public class Duravel extends Produto{
	private String material;
	private String durabilidade;
	
	public Duravel(){
	
	}
	public void setMaterial(String material){
		this.material=material;
	}
	public void setDurabilidade(String durabilidade){
		this.durabilidade=durabilidade;
	}
	public String getMaterial(){
		return material;	
	}
	public String getDurabilidade(){
		return durabilidade;
	}
}
