package com.oops;

 class Fazu
{
 private int age;
 private String name;
 private String email;
 public int getAge() {
	return age;
}
 public void setAge(int age) {
	this.age = age;
}
 public String getName() {
	return name;
}
 public void setName(String name) {
	this.name = name;
}
 public String getEmail() {
	return email;
}
 public void setEmail(String email) {
	this.email = email;
}
  
}

public class Encapsulation {

	public static void main(String[] args) {
		Fazu f = new Fazu();
		f.setAge(25);
		int a=f.getAge();
		f.setName("Fazil");
	    String b = f.getName();
	    f.setEmail("sdfghj@gmail.com");
		String c=f.getEmail();
		
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		

	}

}
