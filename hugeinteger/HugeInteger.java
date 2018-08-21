import java.util.*;
public class HugeInteger
{
	private long x;
	public HugeInteger(String s){
		x = Long.parseLong(s);
	}
	public void inputHugeIntegers(){
		
	}
	public void outputHugeIntegers(){
		
	}
	public void addHugeIntegers(String s){
		long total;
		total = x + Long.parseLong(s);
		System.out.println("A soma desses inteiros eh "+total);
	}
	public void subtractHugeIntegers(String s){
		long total;
		total = x + Long.parseLong(s);
		System.out.println("A diferenca desses inteiros eh "+total);
	}
	public bool isEqualTo(String s){
		if(x==Long.parseLong(s))
			System.out.println("Sim"+total);
		
		else
			System.out.println("Nao "+total);
	}
	public bool isNotEqualTo(String s){
		if(x!=Long.parseLong(s))
		System.out.println("Sim"+total);
		
		else
			System.out.println("Nao "+total);
	}
	public bool isLessThanOrEqualTo(String s){
		if(x<=Long.parseLong(s))
		System.out.println("Sim"+total);
		
		else
			System.out.println("Nao "+total);
	}
	public bool isGreaterThan(){
		if(x>Long.parseLong(s))
			System.out.println("Sim"+total);
		
		else
			System.out.println("Nao "+total);
	}
	public bool isLessThan(){
		if(x<Long.parseLong(s))
		System.out.println("Sim"+total);
		
		else
			System.out.println("Nao "+total);
	}
	public bool isGreaterThanOrEqualTo(){
		if(x>=Long.parseLong(s))
			System.out.println("Sim"+total);
		
		else
			System.out.println("Nao "+total);
	}
	public bool isZero(){
		if(x==0)
			System.out.println("Sim"+total);
		
		else
			System.out.println("Nao "+total);
	}
}
