package com.oops;

import java.util.Scanner;

abstract class Shape
{
	float area;
	abstract public void input();
	abstract public void  compute();
	public void display()
	{
		System.out.println("the area is "+area);
	}
}

class Rectangles extends Shape
{
	float length;
	float breadth;
	
	
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of rectangle");
		length=scan.nextFloat();
		System.out.println("enter the breadth of rectangle");
		breadth=scan.nextFloat();
	}
	
	public void compute()
	{
		area = length*breadth;
	}
	
}

class Squares extends Shape
{
	float length;
	
	
	
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of square");
		length=scan.nextFloat();
		
	}
	public void compute()
	{
		area = length*length;
	}
	
}

class Circles extends Shape
{
    float radius;
    final float pi=3.14f;
	
	
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the area of circle");
		radius=scan.nextFloat();
		
	}
	public void compute()
	{
		area = pi*radius*radius;
	}
	
}

class Calcul
{
	public void permit(Shape a)
	{
	a.input();
	a.compute();
	a.display();
	}
}

public class SampleProject {

	public static void main(String[] args) {
		Shape r = new Rectangles();
		Shape s =  new Squares();
		Shape c = new Circles();
		
		Calcul ca = new Calcul();
		ca.permit(r);
		ca.permit(s);
		ca.permit(c);

	}

}
