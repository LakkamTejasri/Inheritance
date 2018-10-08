package heirachical;

public class Bike extends Vehical{
    String color;
	public Bike(int v_id,String veh_brand,String color)
	{
		super(v_id,veh_brand);
		System.out.println(v_id);
		System.out.println(veh_brand);
		System.out.println(color);
		
	}
	public void breaks(int model)
	{
		System.out.println("model number");
	}


}
