public class ContaBancaria{
	private String cliente;
	private int nconta;
	private double saldo;
	
	public ContaBancaria(String cliente,int nconta,double saldo){
		this.cliente=cliente;
		this.nconta=nconta;
		this.saldo=saldo;
	}
	public void sacar(int valor){
		if(saldo>=valor && valor>0){
			saldo=saldo-valor;
			System.out.println("Sacou "+valor+" RS!");
		}else if(saldo<valor && valor>0){
			System.out.println("Saldo insuficiente ");
		}else{
			System.out.println("IMpossivel realizar saque negativo ");
		}
	}
	public void depositar(int valor){
		if(valor>0){
			saldo=saldo+valor;
			System.out.println("Depositou "+valor+" RS!");
		}
		else{
			System.out.println("IMpossivel realizar deposito negativo ");
		}
	}
}
