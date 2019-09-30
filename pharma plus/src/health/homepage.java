package health;
import java.util.Scanner;

public class homepage {
	int o;
	public String user_id,user_pw,user_name;

    void home(homepage ob1,signup s,login log,adminlogin admlog,about ab,pharma ph)
	{
	System.out.println("WELCOME TO PHARMA PLUS");
	System.out.println("------- -- ------ ----");
	System.out.println("select your choice....");
	System.out.println("");
	System.out.println("1)signup");
	System.out.println("2)login");
	System.out.println("3)adminlogin");
	System.out.println("4)about");
	System.out.println("5)exit");
	@SuppressWarnings("resource")
	Scanner in=new Scanner(System.in);
	o=in.nextInt();
	switch(o)
	{
	case 1:{
		   s.sign(ob1, s, log, admlog, ab,ph);		   break;
	       }
	case 2:{
		    log.login1(ob1, s, log, admlog, ab,ph);
		    break;
	        }
	case 3 :{
		     admlog.admin(ob1, s, log, admlog, ab,ph);
		     break;
	        }
	case 4:{
		    ab.abo(ob1, s, log, admlog, ab,ph);
	        break;
	        }
	case 5:{
		    System.out.println("thank you for visiting PHARMA PLUS!!!!");
		    System.exit(0);
		    break;
	       }
	default:System.out.println("selected option is not available");
	}
	}
 
   
}
