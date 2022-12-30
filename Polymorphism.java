package com.oops;
class Plane
{
	public void takeOff()
	{
		System.out.println("plane is taking off");
	}
}

class CargoPlane extends Plane
{
	public void takeOff()
	{
		System.out.println("Cargo plane is taking off");
	}
}
class FighterPlane extends Plane
{
	public void takeOff()
	{
		System.out.println("FigherPlane is taking off");
	}
}
 class Airport
 {
	 public void permit(Plane p)
	 {
		 p.takeOff();
	 }
 }



public class Polymorphism {

	public static void main(String[] args) {
		
		CargoPlane cp = new CargoPlane();
		FighterPlane fp= new FighterPlane();
		Airport a = new Airport();
		a.permit(fp);
		a.permit(cp);
		
	}

}
