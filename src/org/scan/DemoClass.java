package org.scan;

import java.util.Scanner;

public class DemoClass {

	public static void main(String[] args) {
		 
		Scanner s = new Scanner(System.in);
	
		System.out.println("what is your ID?");
		int studentId = s.nextInt();
		System.out.println("Student ID is "+studentId);
		
		System.out.println("what is your Name?");
		String name = s.next();
		 name += s.nextLine();
		System.out.println("Student Name is "+name);
		
		System.out.println("marks obtained in Maths?");
		byte maths = s.nextByte();
		System.out.println("Maths marks="+maths);
		
		System.out.println("marks obtained in Science?");
		byte science = s.nextByte();
		System.out.println("Science marks="+ science);
		
		System.out.println("markss obtained in Social?");
		byte Social = s.nextByte();
		System.out.println("Social marks="+Social);
		
		System.out.println("marks obtained in English?");
		byte English = s.nextByte();
		System.out.println("English marks="+English);
		
		System.out.println("marks obtained in Tamil?");
		byte Tamil = s.nextByte();
		System.out.println("Tamil marks="+Tamil);
		
		System.out.println("Thank you Mr."+name+ "Id " +studentId + "for giving your details and What is Your Total marks?");
}
}