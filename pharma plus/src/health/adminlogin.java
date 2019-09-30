package health;
import java.util.Scanner;
public class adminlogin {
	private String adm_id,adm_pw;
	@SuppressWarnings({ "resource" })
	void admin(homepage ob1,signup s,login log,adminlogin admlog,about ab,pharma ph)
   {
	    
		Scanner in=new Scanner(System.in);
		System.out.println("enter admin_id");
		adm_id=in.nextLine();
		System.out.println("enter the password");
		adm_pw=in.nextLine();
		if(adm_id.equals("meenan")&&adm_pw.equals("12345"))
		{
			System.out.println("logined successfully");
			edit();
		}
		else 
		{
			System.out.println("incorrect id or password");
		}
		
	}
	void edit()
	{
		System.out.println("edit");
	}
}
