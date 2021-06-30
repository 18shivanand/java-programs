import java.util.*;
import java.util.Scanner;


class Address
{
	int streetNum;
	String city;
	String state;
	String country;

	Address(int n, String cityname, String st, String C)
	{
		 streetNum=n;
		 city=cityname;
		 state=st;
		 country= C;
		 
	}
}



class Student
{
	String USN,name;
	Address addr;
	Student()
	{
		
	}
	
	Student(String no,String Name,Address Addr)
	{
		USN=no;
		name= Name;
		addr=Addr;
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("USN:"+USN);
		System.out.println(": "+addr.streetNum+""+addr.city+""+addr.state+""+addr.country);
	}
}


class Employee
{
	String name;
	String eid;
	Address addr;
	Employee()
	{
		
	}
	Employee(String Name,String Eid,Address Addr)
	{
		name=Name;
		eid=Eid;
	    addr=Addr;
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("USN:"+eid);
		System.out.println("Address: "+addr.streetNum+""+addr.city+""+addr.state+""+addr.country);
	}
}

class College{
    String name;
    Address addr;
    College(String Name, Address Addr){
        addr=Addr;
        name=Name;
    }
    void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Address: "+addr.streetNum+""+addr.city+""+addr.state+""+addr.country);
	}
}
   


public class Prog2 {

	public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the value of n");
	        int n=sc.nextInt();
	        Student[] students=new Student[n];
	        Employee[] employees=new Employee[n];
	        College[] colleges=new College[n];
	        Address ad;
	        String usn;
	        String sname;
	        String eid;
	        String ename;
	        
	        int x;String a,b,c;

	        for(int i=0;i<n;i++)
	        {
	            System.out.println("Enter the name of the student");
	            sname=sc.next();
	            System.out.println("Enter the usn of the student");
	            usn=sc.next();
	            System.out.println("Enter the street ,city ,state and country of the student");
	            x=sc.nextInt();
	            a=sc.next();
	            b=sc.next();
	            c=sc.next();
	            ad=new Address(x,a,b,c);
	            students[0]=new Student(sname,usn,ad);
	            
	            
	            System.out.println("Enter the name of the employee");
	            ename=sc.next();
	            System.out.println("Enter the id of the employee");
	            eid=sc.next();
	            System.out.println("Enter the street ,city ,state and country of the employee");
	            x=sc.nextInt();
	            a=sc.next();
	            b=sc.next();
	            c=sc.next();
	            ad=new Address(x,a,b,c);
	            employees[0]=new Employee(ename,eid,ad);
	            
	            System.out.println("Enter the name of the college");
	            String cname=sc.next();
	            System.out.println("Enter the street ,city ,state and country of the employee");
	            x=sc.nextInt();
	            a=sc.next();
	            b=sc.next();
	            c=sc.next();
	            ad=new Address(x,a,b,c);
	            colleges[0]=new College(cname,ad);
	        }
		
	        System.out.println("\nSTUDENT DATA\n");
	        for(int i=0;i<n;i++)
	        {
	            students[i].display();
	        }

	        System.out.println("\nEMPLOYEE DATA\n");
	        for(int i=0;i<n;i++)
	        {
	        	employees[i].display();
	        }
	        System.out.println("\nCOLLEGE DATA\n");
	        
	        System.out.println("NAME   ST. NUM.   CITY   STATE   COUNTRY");
	        for(int i=0;i<n;i++)
	        {
	            colleges[i].display();
	        }

	}

}
