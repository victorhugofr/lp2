public class Main{
	public static void main(String[] args){
		Deposito acervo = new Deposito();
		Pizza p1 = new Pizza("calabresa");
		p1.setNome("labelle");
		p1.setValidade("5 anos");
		acervo.addProduto(p1);
		
		System.out.println(" O deposito possui "+acervo.qtdProdutos() + " produtos");
		System.out.println(" Pizza "+p1.getNome() + " possui uma validade de " + p1.getValidade());
		
		
	}
}
