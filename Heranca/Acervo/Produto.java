public class Produto{
	private String nome;
	private int preco;
	private String marca;
	private String descricao;
	private String datafab;
	
	public Produto(){
		
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setMarca(String marca){
		this.marca=marca;
	}
	public void setDescricao(String descricao){
		this.descricao=descricao;
	}
	public void setDatafab(String datafab){
		this.datafab=datafab;
	}
	public void setPreco(int preco){
		this.preco=preco;
	}
	public String getNome(){
		return nome;
	}
	public int getPreco(){
		return preco;
	}
	public String getMarca(){
		return marca;
	}
	public String getDescricao(){
		return descricao;
	}
	public String getDatafab(){
		return datafab;
	}
}
