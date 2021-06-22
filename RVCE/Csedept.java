package RVCE;
import CSE.Thirdsem;


 public class Csedept extends Thirdsem {
	
	public void Public_override()
	{
		
		
		System.out.println("Public Overriding");
	}
	private void Privateoveride()
	{
		System.out.println("Private Overriding");
	}
	void Defaultoverride()
	{
		System.out.println("Default Overriding");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Csedept csedept= new Csedept();
       Thirdsem thirdsem=new Thirdsem();
       
       thirdsem.Welcomemsg();
       //public override
      csedept.Public_override();
       //private override
     csedept.Privateoveride();
       //default override
     csedept.Defaultoverride();
	}
		
 }


