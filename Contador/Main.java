import java.util.Scanner;
public class Main{
	public static void contagem(String[] frase1, int z){
		int cont = 0;
		for(int i=0; i<frase1.length;i++){
			if(frase1[i].equals(frase1[z])){
				cont++;
			}
		}
		
		System.out.println(frase1[z]+ ": "+cont);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		String[] frase1 = frase.split(" ");
		int contaux = 0;
		String aux1 = "";
		for(int i=0; i<frase1.length;i++){
			if(!aux1.contains(frase1[i])) {
				contagem(frase1,i);
				aux1 += frase1[i]+",";
			}
		}
	}
}
