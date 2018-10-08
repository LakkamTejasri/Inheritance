package heirachical;

public class Car extends Vehical
{
public	int carid;
public Car(int v_id,String veh_brand,int carid)
{
	super(v_id,veh_brand);
	this.carid=carid;
}
public static void  handle()
{
	System.out.println("handle the car");
}


}

