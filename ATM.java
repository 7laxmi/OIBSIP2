import java.util.Scanner;
public class ATM
{
public static void main( String args[] ) {
//declare and initialize balance, withdraw, and deposit
int balance = 500000;
int withdraw, deposit, transfer;
//create scanner class object to get choice of user
Scanner sc = new Scanner(System.in);
while(true)
{
System.out.println( "Welcome to ATM ... " );
System.out.println( "Select 1 for Withdraw" );
System.out.println( "Select 2 for Deposit" );
System.out.println( "Select 3 for Transfer" );
System.out.println( "Select 4 for Transaction History" );
System.out.println( "Select 5 for EXIT" );
System.out.print( "Select the appropriate options you want to perform:" );
//get the user selected option
int op = sc.nextInt( );
switch( op )
{
case 1: System.out.print( "Enter the amount to be withdrawn :" );
// accept the withdraw amount from the user
withdraw = sc.nextInt();
//check whether the balance is greater than or equal to the withdrawal amount
withdraw( balance, withdraw);
break;
case 2: System.out.print( "Enter the amount to be deposited :" );
//accept the deposit amount from the user
deposit = sc.nextInt();
// call the function and add the deposit amount to the total balance
deposit( balance, deposit );
break;
case 3:System.out.println( "Enter the amount to be transferred : " );
// Transfer of money
transfer = sc.nextInt();
transfer( balance, transfer );
break;
case 4:System.out.println("The transaction history is as follows : ");
getTransaction();
break;
//Transaction History
case 5:
// exit from the menu
System.exit( 0 );
sc.close();
}
}
}
// function to print the current balance in an account
public static void printBalance(int balance)
{
System.out.println(" The Current Balance : " + balance);
System.out.println();
}
// The function to Withdraw an amount and update the balance
public static int withdraw(int balance, int withdrawAmount)
{
System.out.println( "Withdrawn Operation :" );
System.out.println("The withdrawing Amount is : " + withdrawAmount);
if (balance >= withdrawAmount) {
balance = balance - withdrawAmount;
Transaction = -withdrawAmount;
System.out.println( "Please collect your money and remove the card" );
printBalance( balance );
}
else {
System.out.println( "Sorry! the balanace is insufficient." );
System.out.println( );
}
return balance;
}
// The function to deposit an amount and update the balance
public static int transfer(int balance, int transfer)
{
    if (balance > transfer) {
            balance = balance- transfer;
            System.out.println("The amount has been transferred succesfully!!");
            printBalance( balance );
        } else {
            System.out.println("=================================");
            System.out.println("Transfer Fails due to insufficient balance!");
            System.out.println("=================================");
        }
        return balance;
}
public static int deposit(int balance, int depositAmount)
{
System.out.println( "Deposit Operation :" );
System.out.println(" The depositing amount is : " + depositAmount);
balance = balance + depositAmount;
Transaction = depositAmount;
System.out.println( "Your Money has been successfully deposited" );
printBalance(balance);
return balance;
}
static int Transaction;
public static void getTransaction()
{
    if (Transaction > 0) {
            System.out.println("Deposited: " +Transaction);
        } else if (Transaction < 0) {
            System.out.println("Withdraw: " + Math.abs(Transaction));
        } else {
            System.out.println("No Transaction Occured ");
        }
}
}