package health;

public class Main {

	public static void main(String[] args) {
		signup s=new signup();
		login log=new login();
		adminlogin admlog=new adminlogin();
		about ab=new about();
		homepage ob1=new homepage();
		pharma ph=new pharma();
		ob1.home(ob1,s, log, admlog, ab,ph);

	}

}
