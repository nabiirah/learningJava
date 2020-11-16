/** This program will use two objects connected to the BankAccount class. It will print the contents of the two objects, modify them and then print the modified version of the objects.
 * @author Nabiirah
 * @version 16/11/2020
 */

public class BankApp
{

    public static void main(String[] args)
    {
        //TEMPLATE: Class ObjectName = new Constructor ( parameter?);
        
        //CREATING OBJECTS STEPS 1 & 2: 
        BankAccount acc1 = new BankAccount("111 ", "Batman");
        BankAccount acc2 = new BankAccount("222 ", "Robin");
        
        //CHECK BALLANCE: displayMethod x2 
        System.out.println("BEFORE DEPOSITS");
        displayAccount(acc1);
        displayAccount(acc2);
        System.out.println();
        
        //DEPOSIT MONEY: usung the deposit method
        acc1.deposit(100);
        acc2.deposit(50);
        
        //CHECK BALANCE AFTER DEPOSITS: displayMethod x 2
        System.out.println("AFTER DEPOSITS");
        displayAccount(acc1);
        displayAccount(acc2);
        System.out.println();
        
        //WITHDRAW
        acc1.withdraw(75);
        acc2.withdraw(75);
        
//        //RESULTS FROM WITHDRAWAL: Uncomment this section and comment out the WITHDRAW section above to see the results of the withdrawal using a boolean evaluation.  
//        System.out.println("RESULTS OF WITHDRAW");
//        boolean ok = acc1.withdraw(75); //results for acc1
//        if (ok == true)
//        {
//            System.out.println(acc1.getAccountName() + "'s withdraw was successful");
//        }
//        else
//        {
//            System.out.println(acc1.getAccountName() + "'s withdraw unsuccessful");
//        }
//        
//        ok = acc2.withdraw(75); // results for acc2
//        if (ok == true)
//        {
//            System.out.println(acc2.getAccountName() + "'s withdraw was successful");
//        }
//        else
//        {
//            System.out.println(acc2.getAccountName() + "'s withdraw unsuccessful");
//        }
//        System.out.println();
        
        //CHECK BALANCE AFTER WITHDRAW/ CALL METHODS: displayMethod x 2
        System.out.println("AFTER WITHDRAWALS");
        displayAccount(acc1);
        displayAccount(acc2);
        System.out.println();
    }
    
    static void displayAccount(BankAccount oneIn)
    {
        //Print number, name and balance
        System.out.print("Account Name: " + oneIn.getAccountName());
        System.out.print(" Account No.: " + oneIn.getAccountNumber());
        System.out.print(" Bank Balance: " + oneIn.getBalance());
        System.out.println();
        
        
        
    }
}
