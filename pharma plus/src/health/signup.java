package health;

import java.util.Scanner;

public class signup {
	public String user_id="d",user_pw="d",user_name,extra,temp_id,temp_pw;
	public void sign(homepage ob1,signup s,login log,adminlogin admlog,about ab,pharma ph)
	{
        @SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);	    
		System.out.println("enter you name");
		user_name=in.next();
		System.out.println("enter your user name");
		user_id=in.next();
		System.out.println("enter your prefered password");
		user_pw=in.next();
		System.out.println("re-enter the password");
		extra=in.next();
		if(extra.equals(user_pw))
		{
			System.out.println("you are allowed to login");
			ob1.home(ob1,s, log, admlog, ab,ph);
			
		}
		else
		{
			System.out.println("please check the re-enterd password");
			s.sign(ob1, s, log, admlog, ab, ph);
		}
	 }

}
