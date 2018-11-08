import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	private static Scanner leitor;
	private static Scanner leitor2;

	public static void main(String[] args) {
		Leitor arquivo = new Leitor();
		DataBase db=new DataBase();
		String[] teste;
		
		try {
			leitor = new Scanner(arquivo.leitura("src/device2.csv"));
			
			String linha = new String();
			leitor.nextLine();
			while(leitor.hasNext()){
				linha = leitor.nextLine();
				arquivo.setValoresEntreVirgulas(linha);
				teste= arquivo.quebrandoLinhas();
				Device de=new Device(teste[0],teste[1],teste[2],teste[3],teste[4]);
				db.verifica(de);
				
				
					
				//System.out.println(Arrays.toString(teste));		
			}
			leitor2 = new Scanner(arquivo.leitura("src/logon2.csv"));
			leitor2.nextLine();
			while(leitor2.hasNext()){
				linha = leitor2.nextLine();
				arquivo.setValoresEntreVirgulas(linha);
				teste= arquivo.quebrandoLinhas();
				Logon lo2=new Logon(teste[0],teste[1],teste[2],teste[3],teste[4]);
				db.verifica(lo2);	
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.print();
		
	}

}
