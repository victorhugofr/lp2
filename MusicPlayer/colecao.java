import java.util.ArrayList;
public class colecao
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private ArrayList<String> inventario;
    public colecao(){
       
    }
    
    public void addFile(String file){
        inventario.add(file);
    }
    
    public void getNumbersOfFiles(){
        System.out.println("Existem: " + inventario.size() +" musicas");
    }
    
    public void listFiles(){
        for(int i=0;i<inventario.size();i++){
            System.out.println(i+": " + inventario[i]);
        }
    }
}
