package practice;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array=new int[20][20];
		Scanner input= new Scanner(System.in);
		System.out.println("enter the array elements ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				array[i][j]=input.nextInt();
			}
		}
		int row = 0;
		int col=0;
		System.out.println("enter the key elements ");
		int key=input.nextInt();
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(array[i][j]==key)
				{
					row=i;
					col=j;
					break;
				}
			}
		}
		System.out.println("row and column is:"+row+" "+col);
	}

}
