package com.corejava;

public class Interfaces {

	public static void main(String[] args) {
//		All methods in an interfaces will be public and abstract methods.
//		Declartaion and will have no implementaion.

		c1 obj = new c1();
		obj.displayA();
		obj.displayB();
   
	}

}

//	Multiple inhertance through the interfaces:-

interface a1{
	void displayA();
}
interface b1{
	void displayB();
}
class c1 implements a1,b1{
	@Override
	public void displayA() {
		System.out.println("I am from interface A");
	}
	@Override
	public void displayB() {
		System.out.println("I am from interface B");
	}
	
}