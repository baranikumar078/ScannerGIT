package org.scan;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {

		Scanner b= new Scanner(System.in);
		
		System.out.println("Student ID?");
		long id= b.nextLong();
		
		System.out.println("Student Name?");
		String name=b.next();
		name +=b.nextLine();
		
		System.out.println("Student Email?");
		String email=b.next();
		
		System.out.println("Student Phone Number");
		long PhoneNumber=b.nextLong();
		
		System.out.println("Student Department?");
		String Department=b.next();
		
		System.out.println("Student Gender?");
		String Gender=b.next();
		
		System.out.println("Student City?");
		String City=b.next();
		
		System.out.println("pincode");
		int pincode = b.nextInt();
		
		System.out.println("Student ID is "+id);
		System.out.println("Student Name is "+name);
		System.out.println("Student email ID is "+email);
		System.out.println("Student Department is "+Department);
		System.out.println("Student Phone Number is "+PhoneNumber);
		System.out.println("Student Gender is "+Gender);
		System.out.println("Student City is "+City);
		System.out.println("Pincode is "+pincode);
		
		System.out.println("Mr."+name+" Thank you for Your Details");
		System.out.println("All the Best");
		
		
		
		
	}

}
