import java.util.Scanner;
import java.util.ArrayList;

public class Strong_no
{
	public ArrayList<Integer> split_no(int N)
	{
		ArrayList<Integer> B=new ArrayList<Integer>();
		while(N>0)
		{
			B.add(N%10);
			N=N/10;
		}
		return B;
	}
	
	public int calc_fact(ArrayList<Integer> A)
	{
		int i,a1,sum=0;
		int len=A.size();	//to get length of arraylist
		for(i=0;i<len;i++)
		{
			a1=A.get(i);	//extract an element from arraylist
			int fact=1;
			while(a1>0)		//calculate factorial of extracted element from arraylist 
			{
				fact=fact*a1;
				a1--;
			}
			sum=sum+fact;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println("********STRONG NUMBER PROGRAM************");
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> A=new ArrayList<Integer>();
		Strong_no S=new Strong_no();
		
		System.out.println("Please enter a number ");
		int N=sc.nextInt();
		
		A=S.split_no(N);		//function to split the given number and store it into an arraylist
		
		int sum=S.calc_fact(A);		//function to get sum of factorials of splitted number
		
		if(sum==N)
			System.out.print(N+" is a Strong number");
		else
			System.out.print(N+" is not a Strong number");
	}

}
