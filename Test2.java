package cw2;
//2252421017_A_Spondon
class BankAccount {
	private double bal=0;
	private String acc_no,customer_name,acc_open_date;
	public void setAcc(String x) {
		acc_no = x;
	}
	public void setName(String x) {
		customer_name = x;
	}
	public void setdate(String x) {
		acc_open_date = x;
	}
	public double getBal() {
		return bal;
	}
	public String getAcc() {
		return acc_no;
	}
	public String getDate() {
		return acc_open_date;
	}
	public String getName() {
		return customer_name;
	}
	public void withdraw(double x) {
		bal-=x;
		System.out.println("Debited Amount :"+x+"\nCurrent Balance: "+getBal());
	}
	public void deposit(double x) {
		bal+=x;
		System.out.println("Credited Amount :"+x+"\nCurrent Balance: "+getBal());
	}
}
public class Test2 {

	public static void main(String[] args) {
		BankAccount a=new BankAccount();
		a.setAcc("225242A132");
		a.setName("John");
		a.setdate("29/03/2022");
		a.deposit(50000);
		System.out.println("Account Details :\nName : "+a.getName()+"\nAccount No : "+a.getAcc()+ "\nBalance: "+a.getBal());
		a.withdraw(20000);
	}

}
