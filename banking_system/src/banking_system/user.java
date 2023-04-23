package banking_system;

public class user {
	 private int id;
	    private String password;
	    private String mobileNum;
	    private double balance;

	    user(int id, String password){
	        this.id = id;
	        this.password = password;
	        balance = 100;
	    }
	    public int getId(){
	        return this.id;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public String getMobileNum() {
	        return mobileNum;
	    }

	    public void setMobileNum(String mobileNum) {
	        this.mobileNum = mobileNum;
	    }
	    public boolean verifyPassword(String password){
	        return this.password.equals(password);
	    }
	    
	    public void depositmoney(double amount) {
	    	this.balance = this.balance + amount;
	    }

}
