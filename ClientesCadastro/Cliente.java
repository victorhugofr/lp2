public class Cliente{
	private String nome;
	private String endereco;
	private String telefone;
	
	public Cliente(String nome,String endereco,String telefone){
		this.nome=nome;
		this.endereco=endereco;
		this.telefone=telefone;
	}
	public String getNome(){
		return nome;
	}
	public String getEndereco(){
		return endereco;
	}
	public String getTelefone(){
		return telefone;
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setEndereco(String Endereco){
		this.endereco=endereco;
	}
	public void setTelefone(String telefone){
		this.telefone=telefone;
	}
	public void print(){
		System.out.println("Nome : "+nome);
		System.out.println("Endereco : "+endereco);
		System.out.println("Telefone : "+telefone);
	}
	
}