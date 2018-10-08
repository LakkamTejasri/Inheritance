package heirachical;

public class Main {
	public static void main(String args)
	{
		Bike b=new Bike(111,"royalinfield","red");
		Car c=new Car(121,"maruthi",145);
		c.handle();
		b.breaks(10);
		b.running(110);

	}

}
