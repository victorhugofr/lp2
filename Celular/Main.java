public class Main{
	public static void main(String[] args){
		Celular cel=new Celular();
		System.out.println("valor1: "+cel.getCreditos());
		cel.topUp(-10);
		System.out.println("valor2: "+cel.getCreditos());
	}
}
