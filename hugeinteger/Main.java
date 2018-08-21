public class Main(){
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		String s;
		s = sc.nextLine();
		
		HugeInteger x = new HugeInteger(s);
		x.addHugeIntegers("1");
		
		
		
	}
}
