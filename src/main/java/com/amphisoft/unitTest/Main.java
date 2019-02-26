package com.amphisoft.unitTest;

import java.util.Scanner;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		User user = new User();
		String dummyObj;
		UserBO userBO = new UserBO();
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter the username");
		user.setUsername(scan.nextLine());
		System.out.println("Enter the password");
		user.setPassword(scan.nextLine());
		do {
			System.out.println("Enter the email");
			String email = scan.nextLine();
			
        	if(userBO.validateEmail(email) == true) {
        		user.setEmail(email);
        	}
		}while(user.getEmail() == null);
        System.out.println("User details:");
        System.out.println(user);
        try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}