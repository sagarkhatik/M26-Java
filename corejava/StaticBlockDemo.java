package com.corejava;

public class StaticBlockDemo {

	public static void main(String[] args) {
		System.out.println("Im Main");
		m();

	}
	static void m() {
		System.out.println("Static M");
	}
	
	//	Static methods will be executed firstly even before main;
	static {
		System.out.println("Good morn");
	}
	static {
		System.out.println("Good Eve");
	}

}
