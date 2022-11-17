package com.corejava;

public class OuterClassDemo {

	static int x =50;
		static class Inner{
			void display() {
				System.out.println(x);
			}
		}
	
	
	
	public static void main(String[] args) {
		OuterClassDemo.Inner obj = new OuterClassDemo.Inner();
		obj.display();

		 
	}

}
