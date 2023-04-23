package banking_system;
import java.util.*;
import java.io.*;

public class bank {
	
	private HashMap<Integer, user> Users;

    bank(){
        Users = new HashMap<Integer, user>();
    }

    public void addUser(int id, String password){
        if(Users.containsKey(id)){
            System.out.println("User id already exists");
        }else{
            user newUser = new user(id,password);
            Users.put(id, newUser);
            System.out.println("Account successfully created");
        }
    }
    public void sendMoney(int id,String password,int destId,double amount){
    	
        user sender = Users.get(id);
        user receiver = Users.get(destId);
        if(receiver == null) {
    		System.out.println("Receiver bank account is not exist /Sorry, May be You entered wrong account number ");
    		return;
    	}
        
        if(sender.getBalance() >= amount) {
        	System.out.println("Transferring money......");
        	
        	receiver.setBalance(amount + receiver.getBalance());
        	sender.setBalance(sender.getBalance() - amount);
        	System.out.println("Money transferred succesfully ....");
        	System.out.println("Your current balance is : " + sender.getBalance());
        }
        else {
        	System.out.println("You dont have enough funds in your account to complete this tranction ");
        }
    }
    
    public boolean verifycredentials(int senderid , String sender_password) {
    	user sender = Users.get(senderid);
    	if(sender == null) {
    		return false;
    	}
    	return sender.verifyPassword(sender_password);
    }
    
    public void depositmoney(int id, double amount) {
    	user acc_user = Users.get(id);
    	acc_user.depositmoney(amount);
    	System.out.println("Money deposited successfully  \n Your new balance is :" + acc_user.getBalance());	
    }
}
