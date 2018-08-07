
public class Heater{
    private int temperature;
    private int min;
    private int max;
    private int increment;
    public Heater(int max, int min){
        temperature = 15;
        increment = 5;
        this.min=min;
        this.max=max;
    }
    public void Warmer(){
        if((temperature+increment)>max){
            System.out.println("Erro: Temperatura sera maior que o maximo permitido");
        }else{
            temperature=temperature+increment;
        }
    }
    public void Cooler(){
        if((temperature+increment)<min){
            System.out.println("Erro: Temperatura sera menor que o minimo permitido");
        }else{
            temperature=temperature-increment;
        }
    }
    public int getTemperature(){
        return temperature;
    }
    public void setIncrement(int increment){
        if(increment<0){
            System.out.println("Impossivel adicionar um incremeent negativo");
        }else{
            this.increment=increment;
        }
    }
}
