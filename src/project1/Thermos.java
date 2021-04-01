package project1;

public class Thermos {
	float qty;
	String brand;
	String liquid;
	
	Thermos(String liquid,double qty,String brand)
	{
		this.liquid =liquid;
		this.qty=qty;
		this.brand=brand;
	}
	void add(double val)
	{
		qty = qty = val;
	}
	void display()
	{
		System.out.println("Liquid is "+liquid);
	}
	
	public static void main(String args[]) {
		
	}
	

}
