package atm_machine;
 import java.util.*;
public class atmwork {
	
	public static void main(String[] args) {
		
   int balance=30000,Account,Deposite,withdraw,Total,num;
   Scanner sc=new Scanner(System.in);
  do
   {
	   System.out.println("WelCome to ATM-Machine\n");
	   System.out.println("1.Withdraw");
	   System.out.println("2.Deposite");
	   System.out.println("3.Check Balance");
	   System.out.println("4.EXIT");
	   num=sc.nextInt();
	   switch(num)
	   {
	   case 1:
		   System.out.println("Enter amount with th withdraw:");
		   withdraw=sc.nextInt();
		     if(withdraw<=balance)
		     {
		    	 balance=balance-withdraw;
		    	 System.out.println("Available balance is   "+balance);
		    	 System.out.println("withdrawal Amount is "+withdraw);
		         System.out.println("please collect money");
		     }
		     else
		     {
		    	 System.out.println("You don't have enough money for withdraw");
		     }
		     System.out.println(" ");
		     break;
	   case 2:
		   System.out.println("enter amount to deposite");
		   Deposite=sc.nextInt();
		   balance=balance+Deposite;
		   System.out.println("balance amount is   "+balance);
		   System.out.println("Money has been deposite successfully....");
		   System.out.println("  ");
		   break;
	   case 3:
		   System.out.println("Total Balance is your account  "+balance);
		   System.out.println("  ");
		   break;
	   case 4:
		   System.exit(0);
		   System.out.println("  ");
		   break;
	   }
   }while(num!=5);
}
}
