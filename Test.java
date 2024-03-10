package cw1;
//2252421017_A_Spondon
class BankAccount {
	private int bal;
	private String acc_no,name;
	public void setBal(int x) {
		bal = x;
	}
	public void setAcc(String x) {
		acc_no = x;
	}
	public void setName(String x) {
		name = x;
	}
	public int getBal() {
		return bal;
	}
	public String getAcc() {
		return acc_no;
	}
	public String getName() {
		return name;
	}
}
public class Test{
	public static void main(String[] args) {
		BankAccount a = new BankAccount();
		a.setBal(53475);
		a.setAcc("225242A132");
		a.setName("John");
		System.out.println("Account Details :\nName : "+a.getName()+"\nAccount No : "+a.getAcc()+ "\nBalance: "+a.getBal());
		}
}