package com.oops;

abstract class Loan
{
	abstract public void DisplayInt();
}
class HomeLoan extends Loan
{
	public void DisplayInt()
	{
		System.out.println("HomeLoan");
	}
}
class EducationLoan extends Loan
{
	public void DisplayInt()
	{
		System.out.println("EducationLoan");
	}
}


public class Abstra {

	public static void main(String[] args) {
		Loan l = new HomeLoan();
		l.DisplayInt();
		Loan l1 = new EducationLoan();
        l1.DisplayInt();
	}

}
