public class Horista extends Professor{
	private int total_horas;
	private String salariohora;
	
	public int getTotalhoras(){
		return total_horas;
	}
	public void setTotalhoras(int total){
		total_horas=total;
	}
	public String getSalariohora(){
		return salariohora;
	}
	public void setSalariohora(String salario){
		salariohora=salario;
	}
	public int salario(){
		return (Integer.parseInt(salariohora)*total_horas);	
	}
}
