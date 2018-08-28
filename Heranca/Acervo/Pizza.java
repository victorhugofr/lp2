public class Pizza extends NDuravel{
	private String sabor;
	
	public Pizza(){
	
	}
	public Pizza(String sabor){
		this.sabor=sabor;
		setGenero("alimenticio");
	}
	public void setSabor(String sabor){
		this.sabor=sabor;	
	}
	public String getSabor(){
		return sabor;
	}
}
