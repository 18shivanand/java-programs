import java.lang.*;
package CSE;



public class Thirdsem {
	
	
		public void Welcomemsg()
		{
			System.out.println("Welcome to Cse dept 3rd sem Young budding engineers");
			
		}
		
		
		public void Public_override()
		{
			System.out.println("Public Overriding is accepted");
		}
		
		
		private void Privateoveride()
		{
			System.out.println("Private Overriding is accepted");
		}
		
		void Defaultoverride()
		{
			System.out.println(" Default overriding is accepted");
		}

		
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      
	       Thirdsem thirdsem=new Thirdsem();
	       
	       thirdsem.Welcomemsg();
	       //public override
	       thirdsem.Public_override();
	       //private override
	       thirdsem.Privateoveride();
	       //default override
	       thirdsem.Defaultoverride();
		}

}

