package practice;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] arr=new int[20];
		Scanner input= new Scanner(System.in);
		System.out.print("enter the input");
		int n= input.nextInt();
		System.out.println("enter the array elements");
		
		for(int i=0;i<n;i++)
		{
		 arr[i]=input.nextInt();
		}
      int count=0;
      int temp;
		for(int i=0;i<n;i++)
			
		{
			if(arr[i]%2 !=0 )
			{
				temp=arr[count];
				arr[count]=arr[i];
				arr[i]=temp;
				count++;
			}
		}
		
		System.out.println("the array elements are");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
