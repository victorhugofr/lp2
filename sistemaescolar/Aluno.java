
public class Aluno
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Prova prova1;
    private Prova prova2;

    public Aluno(double x,double y,double z,double w){
       prova1=new Prova(x,y);
       prova2=new Prova(z,w);
    }

    public double calcularMedia(){
        double media = (prova1.calcularNotaTotal() + prova2.calcularNotaTotal())/2;
        System.out.println("Media do aluno : " + media);
        return media;
    }
}
