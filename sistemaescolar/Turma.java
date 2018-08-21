
public class Turma
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Aluno a1;
    private Aluno a2;
    private Aluno a3;
    
    public Turma(Aluno a, Aluno b , Aluno c){
        a1=a;
        a2=b;
        a3=c;
    }
    public void setNota(double x, double y, double z, double w){
        
    }
    public double calcularMedia(){
        double media = (a1.calcularMedia() + a2.calcularMedia() + a3.calcularMedia())/3;
        System.out.println("Media da turma : " + media);
        return media;
    }
}
