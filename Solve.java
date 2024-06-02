package problem2;
class test1{
	private String Name,City;
	private int age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	void display() {
		System.out.println("Parent Method\nName:"+getName()+"\nAge:"+getAge()+"\nCity:"+getCity());
	}
}
class Solve extends test1{
	int credit,debit,balance;
	void setBalance(int x) {
		balance=x;
	}
	void display() {
		super.display();
		int sum=balance -debit +credit;
		System.out.println("Child Method\nBalance "+sum);
	}
	public static void main(String[] args) {
		Solve x=new Solve();
		x.setName("Spondon");
		x.setAge(23);
		x.setCity("Dhaka");
		x.setBalance(5000);
		x.credit=1000;
		x.debit=100;
		x.display();
		
	}
}

