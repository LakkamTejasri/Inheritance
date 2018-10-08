package multilevelinhi;

public class AltoMaruthi extends CelorioMaruthi{
	public String A_color;
	public AltoMaruthi(String A_color,long ce_price,String c_name)
	{
		super(ce_price,c_name);
		
		System.out.println("car name is: "+c_name);
		System.out.println("car color is : "+A_color);
		System.out.println("car price is: "+ce_price);
	}
	public static void accelator()
	{
		System.out.println("car accelator");
	}
	
	
	

}
