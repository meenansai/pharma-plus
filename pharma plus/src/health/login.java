package health;

import java.util.Scanner;

public class login {
	void login1(homepage ob1,signup s,login log,adminlogin admlog,about ab,pharma ph)
	{
		 if(s.user_id.equals("d")&&s.user_pw.equals("d"))
		    {
		    	System.out.println("signup before login");
		    	System.out.println("");
		    	ob1.home(ob1, s, log, admlog, ab,ph);
		    }
		System.out.println("enter your user_id:- ");
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		s.temp_id=in.next();
		System.out.println("");
		System.out.println("enter your password:- ");
		s.temp_pw=in.next();
		System.out.println("");
		if(s.temp_id.equals(s.user_id)&&s.temp_pw.equals(s.user_pw))
	    {
	    	System.out.println("successfully logined");
	    	System.out.println("");
	    	ph.pharmacy(ob1, s, log, admlog, ab, ph);
	    }
	    else
	    {
	    	System.out.println("incorrect user_id or password");
	    	System.out.println("retry.....");
	    	System.out.println("");
	    	log.login1(ob1, s, log, admlog, ab, ph);
	    }
	}

}
