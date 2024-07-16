package CodSoft;
import java.util.*;
public class Atm_interface {
int choice;
float amt,balance;
Scanner sc=new Scanner(System.in);
public void options()
{
	System.out.println("Enter the choice :1.deposit 2.withdraw 3.check balance ");
	choice =sc.nextInt();
	switch(choice)
	{
	case 1:
		deposit();
		break;
	case 2:
		withdraw();
		break;
	case 3:
		check();
		break;
	default:
		System.out.println("Enter the valid option..!!");
	}
}
public void deposit()
{
	System.out.println("Enter the balance amount:");
	balance=sc.nextFloat();
	System.out.println("Enter the amount to be deposited:");
	amt=sc.nextFloat();
	balance+=amt;
	System.out.println("The amount has been deposited successsfully..!!");
	System.out.println("Your current Balance: "+balance);
}
public void withdraw()
{
	System.out.println("Enter the balance amount:");
	balance=sc.nextFloat();
	System.out.println("Enter the amount to be withdrawed:");
	amt=sc.nextFloat();
	if(balance>amt)
	{
	balance-=amt;
	System.out.println("The amount has been withdrawed successsfully..!!");
	System.out.println("Your current Balance: "+balance);
	}
	else
	{
		System.out.println("There is no sufficient balance to withdraw..!!");
	}

}
public void check()
{
	System.out.println("Enter the balance amount:");
	balance=sc.nextFloat();
	System.out.println("Your current Balance: "+balance);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Atm_interface a=new Atm_interface();
		int a_no;
		String a_name;
		System.out.println("Enter the account number:");
		a_no=sc.nextInt();
		System.out.println("Enter the account holder name:");
		a_name=sc.next();
		a.options();

	}

}
