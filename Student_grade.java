package CodSoft;
import java.util.*;
public class Student_grade {
	int num,i,total=0,average;
	int mark[] =new int[50];
	Scanner sc=new Scanner (System.in);
	public void in_marks()
	{
		System.out.println("Enter the number of subjects:");
		num=sc.nextInt();

		for(i=1;i<=num;i++)
		{
			System.out.println("Enter the mark of subject  "+i+" (out of 100):");
			mark[i]=sc.nextInt();
		}
	}
	public void calc_total()
	{
		for(i=1;i<=num;i++)
		{
			total+=mark[i];
		}
		System.out.println("The total marks obtained: "+total);
	}
	public void calc_average()
	{
		average=(total/num);
		System.out.println("The average percentage obtained is: "+average+" %");
	}
	public void grade()
	{
		if(average>=90)
		{
			System.out.println("Grade S");
		}
		else if(average>=80 && average<90)
		{
			System.out.println("Grade A");
		}
		else if(average>=70 && average<80)
		{
			System.out.println("Grade B");
		}
		else if(average>=60 && average<70)
		{
			System.out.println("Grade C");
		}
		else if(average>=50 && average<60)
		{
			System.out.println("Grade D");
		}
		else if(average>=40 && average<50)
		{
			System.out.println("Fail!!Do the best next time");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_grade s=new Student_grade();
		s.in_marks();
		s.calc_total();
		s.calc_average();
		s.grade();

	}

}
