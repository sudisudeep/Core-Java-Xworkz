class BankAccount1{

static double balance;
public static boolean credit(int amount){
boolean isCredited = false;
if(amount >= 0){
balance = balance + amount;
isCredited = true;
}
return isCredited;
}
public static boolean debit(int amount){
boolean isDebited = false;
if(amount <= 0){
balance = balance - amount;
isDebited = true;
return isDebited;
}
}
}