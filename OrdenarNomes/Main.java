import java.util.*;
public class Main{
	public static void main( String[] args){
		ArrayList<String> nomeList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String nome = "";
		System.out.println("Para sair digite exit ");
		while(nome.equals("exit")!=true){
			System.out.println("Digite o nome: ");
			 nome = sc.nextLine();
			if(nome.equals("exit")!=true)
				nomeList.add(nome);
		}
		 Collections.sort(nomeList);
		System.out.println(nomeList);
	}
}
