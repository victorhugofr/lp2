import java.util.ArrayList;
public class colecao
{
    // vari�veis de inst�ncia - substitua o exemplo abaixo pelo seu pr�prio
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
