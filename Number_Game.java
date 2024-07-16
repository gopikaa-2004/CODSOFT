package CodSoft;
import java.util.*;
public class Number_Game {
	static int number;
	static int guess,num,max_attempts,attempts;
	static int score=0,rounds=0;
	static boolean guessed;
	public  void check()
	{
		System.out.println("--------WELCOME TO RANDOM NUMBER GAME!!!!--------");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the maximum range of numbers: ");
		num=sc.nextInt();

		System.out.println("Enter the number of chances to play the game per round:");
		max_attempts=sc.nextInt();
		
		System.out.println("Number of Rounds you want to play: ");
		rounds=sc.nextInt();
		for(int i=1;i<=rounds;i++)
		{
			attempts=0;
			guessed=false;
			Random rn=new Random();
			number=rn.nextInt((num)+1);
			System.out.println("Round: "+(i));



		
		while(attempts<max_attempts)
		{
		
		
		System.out.println("Chance: "+(attempts+1));
		System.out.println("Enter the guessing number:");
		guess=sc.nextInt();
		attempts++;
		if(number==guess)
		{
			System.out.println("Congratulations!!!Your guess is correct...!!");
			guessed=true;
			break;
		}
		else if(guess<number)
		{
			System.out.println("Too low!!The number is greater than "+ guess);

		}
		else if(guess>number)
		{
			System.out.println("Too high!!The number is lesser than "+ guess);

		}
		
	}
		if(!guessed)
		{
		System.out.println("No attempts left!!Sorry!Try again..!");
	}
		}
		rounds++;
		score+=(guessed?max_attempts-attempts+1:0);
		System.out.println("Your score is: "+score);
		System.out.println("Do you want to play again: ");
		String again=sc.next();
		if(again.equalsIgnoreCase("yes"))
		{
			check();
		}
		else
		{
			System.out.println("Thank you for playing the game..!!Your final score is: "+score);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_Game n=new Number_Game();
		n.check();
		

	}

}

