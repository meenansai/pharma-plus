package health;
import java.util.Scanner;
public class pharma {
	String dis_name;
	String med[]=new String[10];
	int i=0,j=0,c=0,k=0;
	int qty[]=new int[10];
	int price[]=new int[10];
	void pharmacy(homepage ob1,signup s,login log,adminlogin admlog,about ab,pharma ph)
	{
		int t;
	    @SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		System.out.println("enter the disease name");
        dis_name=in.nextLine();
        System.out.println("select your choice....");
        System.out.println("1)suggestions");
        System.out.println("2)medicine");
        t=in.nextInt();
	    switch(t)
	    {
	    case 1:{
	    	suggestions(ob1,s,log,admlog,ab,ph);
	    	break;
	    }
	    case 2:{
	    	medicine(ob1,s,log,admlog,ab,ph);
	    	break;
	    }
	    default:System.out.println("there is no such option");
	    }
	}
	void suggestions(homepage ob1,signup s,login log,adminlogin admlog,about ab,pharma ph)
	{
		if(dis_name.equals("cold and cough")||dis_name.equals("cough and cold"))
		{
			System.out.println("-----------------------------------------------------------");
			System.out.println("* use vicks or zandu balm");
			System.out.println("");
			System.out.println("* have some ginger tea");
			System.out.println("");
			System.out.println("* in half spoon of honey,");
			System.out.println("add a few drop of lemon and a pinch of cinnamon. ");
			System.out.println("have this syrup twice a day to cure cold and cough");
			System.out.println("");
			System.out.println("* having mixture of flaxseed and lime juice with honey");
			System.out.println("-----------------------------------------------------------");
	    	extra(ob1,s,log,admlog,ab,ph);
	   }
	}
			void extra(homepage ob1,signup s,login log,adminlogin admlog,about ab,pharma ph)
			{
				int o;
			System.out.println("do you want medicine for this....??");
			System.out.println("1)yes"+"\n"+"2)no");
			@SuppressWarnings("resource")
			Scanner in=new Scanner(System.in);
			o=in.nextInt();
			if(o==1)
			{
				medicine(ob1,s,log,admlog,ab,ph);
			}
			if(o==2)
			{
				System.out.println("do you want to continue search...??");
				System.out.println("1)yes"+"\n"+"2)no");
				o=in.nextInt();
				if(o==1)
				{
				 pharmacy(ob1,s,log,admlog,ab,ph);
				}
				if(o==2)
				{
				  System.out.println("******THANK YOU FOR VISITING PHARMA PLUS******");
				}
			}
			
			
		}
	
	void medicine(homepage ob1,signup s,login log,adminlogin admlog,about ab,pharma ph)
	{
		int t;
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		System.out.println("--------------------------------------------------");
		System.out.println("DISCLAIMER:please consult a docter before using it");
        System.out.println("--------------------------------------------------");
        System.out.println();
		if(dis_name.equals("cold and cough")||dis_name.equals("cough and cold"))
		{
		 System.out.println("select prefered medicine");
	     System.out.println(" 1.alercet cold");
	     System.out.println(" 2.vicks action 500");
	     System.out.println();
	     t=in.nextInt();
		 switch(t)
		 {
		 case 1:{
			 med[i++]="alercet cold";
			 System.out.println("select the quantity");
			 qty[j++]=in.nextInt();
			 price[k++]=48;
			 c++;
			 break;
		 }
		 case 2:{
			 med[i++]="vicks action 500";
			 System.out.println("select the quantity");
			 qty[j++]=in.nextInt();
			 price[k++]=50;
			 c++;
			 break;
		 }
		 default:System.out.println("there is no such option");
		 }
		}
		System.out.println("do you wanna buy more medicine");
		System.out.println("1)yes"+"\n"+"2)no");
		t=in.nextInt();
		if(t==1)
		{
		 ph.pharmacy(ob1, s, log, admlog, ab, ph);
		}
		if(t==2)
		{
		bill(ob1,s,log,admlog,ab,ph);
		}
	}
	void bill(homepage ob1,signup s,login log,adminlogin admlog,about ab,pharma ph)
	{
     int sum=0;
	 System.out.println("-----------------------------------------------------");
     System.out.println("your selected medicine and qty are:-");
     for(i=0;i<c;i++)
     {
    	System.out.println("medicine name:-"+med[i]);
    	System.out.println("quantity:-"+qty[i]);
    	System.out.println("price:-"+price[i]);
     }
     
     for(i=0;i<c;i++)
     {
    	sum=sum+qty[i]*price[i];
     }
     System.out.println("**Total Amount:-"+sum);
     System.out.println();
     System.out.println("------------------------------");
     System.out.println("******THANK YOU FOR VISITING PHARMA PLUS******");
    
	}
	}

