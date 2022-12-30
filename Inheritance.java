package com.oops;
class Parent
{
	int a, b;
	 Parent()
	{
	a=10;
	b=20;
	System.out.println("parent cons");
	}
}

class Child extends Parent
{
	int x,y;
	Child()
	{
		x= 30;
		y=40;
	System.out.println("child consutor");
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}




public class Inheritance {

	public static void main(String[] args) {

Child ch= new Child();
ch.display();


	}

}
