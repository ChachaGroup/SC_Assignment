package pack;

import java.util.Scanner;

public class Hubaib {

public String username;
public String password;
public String role;

		Scanner scn = new Scanner(System.in);

	public void register(){
		System.out.println("Enter username");
		username = scn.next();
		System.out.println("Enter password");
		password = scn.next();
		System.out.println("Enter Role");
		role = scn.next();
		
		
		System.out.println("Succesfully registered");
	}
	public void login(String user, String pswd){
		if(user==username && pswd==password)
			System.out.println("Successfully login");
		else
			System.out.println("Invalid credentials");
	}
}
