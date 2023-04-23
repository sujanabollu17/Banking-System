package banking_system;
import java.util.*;
import java.io.*;

public class banking_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*login --> user,password
	    create account ->>user id,password,amount
	    send money from 1 account to another ->user id no.,password,amount,destination account account number
	    add balance -> user,password,amount
	    check balance -> user,password
	    withdraw money ->user,password,amount
	    delete account -> user,password
	    */  
	        bank SBIbank  = new bank();
	        System.out.println("Welcome to SBIbank");
	        int option;

	        do{
	            System.out.println("Choose the option");
	            System.out.println("1. Create an account");
	            System.out.println("2. To transfer money to another account");
	            System.out.println("3. To deposit money");
	            System.out.println("9. Exit");
	            Scanner sc = new Scanner(System.in);
	            option = sc.nextInt();

	            switch (option){
	                case 1 :
	                    System.out.println("Enter the new User id");
	                    int id = sc.nextInt();
	                    System.out.println("Enter new password");
	                    String password = sc.next();

	                    SBIbank.addUser(id,password);
	                    break;
	                    
	                case 2:
	                	System.out.println("Enter the User id");
	                	int sender_id = sc.nextInt();
	                	System.out.println("Enter the password");
	                	String sender_password = sc.next();
	                	
	                	boolean login = SBIbank.verifycredentials(sender_id,sender_password);
	                	
	                	if(login ==true) {
	                		System.out.println("Enter receiver id : ");
	                		int receiver_id = sc.nextInt();
	                		System.out.println("enter the amount to be transferred : ");
	                		int sending_amount = sc.nextInt();
	                		SBIbank.sendMoney(sender_id,sender_password,receiver_id,sending_amount);
	                		
	                	}else {
	                		System.out.println("Oops ! you have eneterd the bad credentials ");
	                 }
	                	break;
	                	
	                case 3:
	                	System.out.println("Enter your user id :");
	                	id = sc.nextInt();
	                	System.out.println("enter your password :");
	                	password = sc.next();
                        login = SBIbank.verifycredentials(id,password);
	                	
	                	if(login ==true) {
	                		System.out.println("Enter the amount to be deposited ");
	                		int amount = sc.nextInt();
	                		SBIbank.depositmoney(id, amount);
	                	}
	                	else {
	                		System.out.println("Oops ! you have eneterd the bad credentials ");
	                 }
	                	break;
	                	
	                case 8:
	                    break;
	                    
	                default:
	                    break;

	            }
	        }while(option !=9);
	}

}
