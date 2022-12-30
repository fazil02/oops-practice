package com.oops;

import java.util.Scanner;

abstract class Shapes
{
  float area;
  abstract public void input();
  abstract public void calculation();
  
  public void display()
  {
	  System.out.println("area is "+area); 
  }
}

class Rectangle extends Shapes
{
	float length;
	float breadth;
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of rectangle");
         length =scan.nextFloat();
         System.out.println("enter the breadth of rectangle");
         breadth = scan.nextFloat();
	}
	
	public void calculation()
	{
		area = length*breadth;
	}
	
}

class Square extends Shapes
{
	float length;
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of square");
         length =scan.nextFloat();
       
	}
	
	public void calculation()
	{
		area = length*length;
	}
	

}

class Circle extends Shapes
{
	float radius;
	final float pi = 3.14f;

	
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the area of circle");
         radius =scan.nextFloat();
        
	}
	
	public void calculation()
	{
		area = pi*radius*radius;
	}
	
	
}

class GeoMetry
{
	public void permit(Shapes s)
	{
		s.input();
		s.calculation();
		s.display();
	}
}


public class OopsProject {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		Square ss = new Square();
		Circle c = new Circle();
      
		GeoMetry gm = new GeoMetry();
		gm.permit(r);
		gm.permit(ss);
		gm.permit(c);

	}

}
