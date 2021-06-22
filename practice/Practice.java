package practice;
import java.util.Scanner;


public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		Scanner input= new Scanner(System.in);
		System.out.print("enter the input");
		int n = input.nextInt();
		
		int count=1;
		for(i=1;i<n;i++)
		{
			
			for(j=1;j<=i;j++)
			{
				if(count<=n)
				{
				System.out.print("$");
				count++;
				}
			
			}
			System.out.println();
		}
		

	}

}
