class BankAccount{

static double balance = 150000.0;
static int credit;
static int debit;

public static void credit(int creditedamount){

 balance = balance + creditedamount;
 return creditedamount;
 }
 public static void debit(int debitedamount){
	 if(balance >= debitedamount){
		 balance = balance - debitedamount;
		 return debitedamount;
	 }
	 else{
		 System.out.println("Minimum Balance = " + balance);
		 return debitedamount;
	 }
 }
}