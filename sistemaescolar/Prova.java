
public class Prova
{
    private double p1;
    private double p2;
    
    public Prova(double x,double y){
        p1 = x;
        p2 = y;
    }
    public double calcularNotaTotal(){
        double nota = p1+p2;
        System.out.println("Nota total : "+nota);
        return p1 + p2;
    }
}
