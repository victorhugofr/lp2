
public class Celular{
    private int creditos;
    public Celular() {
        // inicializa variáveis de instância
        creditos = 1000;
    }
    public Celular(int x){
        creditos=x;
    }
    public int getCreditos(){
        return creditos;
    }
    public void setCreditos(int x){
        if(x<0){
            System.out.println("Erro: Impossivel colocar creditos negativos");
        }else{
            creditos=x;
        }
    }
    public void topUp(int x){
        if(x<0){
            System.out.println("Erro: Impossivel adicionar creditos negativo");
        }else{
            creditos=creditos+x;
        }
    }
    public void call(){
        if(creditos<100){
            System.out.println("Erro: Voce nao tem creditos suficientes");
        }else{
            creditos=creditos-100;
        }
    }
}
