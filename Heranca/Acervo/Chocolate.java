public class Chocolate extends NDuravel{
	private String porcentagemcacau;
	
	public Chocolate(){
	
	}
	public Chocolate(String porcentagemcacau){
		this.porcentagemcacau=porcentagemcacau;
		setGenero("alimenticio");
	}
	public void setPorcentagemcacau(String porcentagemcacau){
		this.porcentagemcacau=porcentagemcacau;	
	}
	public String getSabor(){
		return porcentagemcacau;
	}
}
