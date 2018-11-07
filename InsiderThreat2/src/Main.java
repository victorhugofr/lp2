import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Leitor arquivo = new Leitor();
		DataBase db=new DataBase();
		String[] teste;
		try {
			Scanner leitor = new Scanner(arquivo.leitura("src/device2.csv"));
			String linha = new String();
			leitor.nextLine();
			while(leitor.hasNext()){
				linha = leitor.nextLine();
				arquivo.setValoresEntreVirgulas(linha);
				teste= arquivo.quebrandoLinhas();
				Device de=new Device(teste[0],teste[1],teste[2],teste[3],teste[4]);
				db.verifica(de);
				db.print();
				
				
					
				//System.out.println(Arrays.toString(teste));		
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
