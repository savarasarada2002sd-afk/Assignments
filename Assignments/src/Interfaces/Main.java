package Interfaces;
//interface 1:
interface Account
{
	public void account_Details();
}
//interface 2
interface Loan
{
	public void loan_Details();
}
//interface 3
//An interface can extends any number of interfaces at a time
interface CustomerService extends Account,Loan
{
	public void get_Details();
}
class Bank implements CustomerService
{
	public void account_Details()
	{
		System.out.println("Get Account Details");
	}
	public void loan_Details()
	{
		System.out.println("Get Loan Deatils");
	}
	public void get_Details()
	{
		System.out.println("Service Executive Will Get the deatils");
	}
}

public class Main {
	public static void main(String[] args) {
		Bank b =new Bank();
		b.account_Details();
		b.loan_Details();
		b.get_Details();
	}
}
