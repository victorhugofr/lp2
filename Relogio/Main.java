public class Main{
	public static void main(String[] args){
		ClockDisplay relogio=new ClockDisplay();
		relogio.setTime(23,54);
		relogio.timeTick();
		System.out.println(relogio.getTime());
	}
}