package com.corejava;

import java.util.Scanner;

public class Userdefclass {

	public static void main(String[] args) {
		int age;
		System.out.println("Enter Age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		if(age<18) {
			throw new Cantvote("You cannot vote ! underage");
		}
		else {
			System.out.println("You can vote");
		}
	}

}
class Cantvote extends RuntimeException
{

	public Cantvote(String msg) {
		super(msg);
	
	}


}