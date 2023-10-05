package Atm;
import java.util.Scanner;

public class Customer {
   private String customerName  = "Aryan";
   private String BankName = "Xyz bank";
   private int accountNumber = 9292;
   private int customerId = 22727;
   private int balance = 2000;
   private int pin =1234;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//     <<<<<<<<<<<<<<-----------------------------Atm pin = 1234 ------------------------------>>>>>>>>>>>>>>
// <<<<<<<<<<<<<--------------------------------- Account No: 9292 ----------------------------->>>>>>>>>>>>>>>>
  public void Display()
  {
    System.out.println("Customer Name: " + customerName);
    System.out.println("Bank Name: " + BankName);
    System.out.println("Balance: " + balance);
    System.out.println("Customer ID: " + customerId);
    System.out.println("Account Number " + accountNumber);
  }

     Scanner sc = new Scanner(System.in);

   //<<<------------------------------------------>>
   //<<-- method for deposit money----->>
   /////////////////////////////////////////////////////////////////////////////////////////////////////////////
   ////////////////////////////////////////////////////////////////////////////////////////////////////
  public int  DepositAmount()
  {
     System.out.println("Please enter your account number :");
     int accountNumber = sc.nextInt(); 
   
    if (this.accountNumber == accountNumber)
    {
      System.out.print("Enter Amount to deposit:");
      int amount = sc.nextInt();
      if(amount>=0)
      {
        this.balance = this.balance+balance; 
       System.out.println("Your Amount " + amount + "deposited in " +" " + accountNumber + "" + " account Number:" );
      }
      else{
        System.out.println("Please enter correct Amount");
      }
     
    
    }
    else{
      System.out.println("Please enter correct Account Number");
    }
   return 0;
  }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////


  //                                         <<<--------method For Withdraw Money-------->>>>>


  //////////////////////////////////////////////////////////////////////////////
   public void withdrawMoney()
   {
      int amount ,pin,accountNumber;
      System.out.print("Enter Your Account Number : ");
      accountNumber = sc.nextInt();
      if(this.accountNumber == accountNumber)
       {
         System.out.print("Enter ATM pin : ");
         pin = sc.nextInt();
        if(this.pin == pin)
        {
            System.out.print("Enter the Amount : ");
            amount = sc.nextInt();
            if((amount<=balance) && (amount>=0))
            {
              balance = balance-amount;
              System.out.println("Please ! Collect you money :");
            }
            else
            {
                System.out.println("Insufficient balance : ");
            }
        }
        else
        {
           System.out.println("Please enter correct PIN : ");
        }
       }
     
     else
     {
        System.out.println("Please enter correct account Number: ");
     }
}


////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////


// method For check Balance
//  <<<<------------------------------->>>

////////////////////////////////////////////////////////////////////////////////////////////////////
public void checkBalance()
{
  System.out.print("Enter Atm Pin:");
                int pin = sc.nextInt();
                if(this.pin== pin)
                {
                    System.out.println("BALANCE:"+balance);
                }
                else{
                    System.out.println("Enter Correct Pin");
                }
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////


//    <<<<<<<------------------method  for change atm pin-------------------------->>>>>>


///////////////////////////////////////////////////////////////////////////////////////////////////////////
public void changePin()
{
  
         
          System.out.println("Change Your Pin");
          System.out.print("Enter Your Current Pin:");
          int old_pin = sc.nextInt();
          if(old_pin == pin)
          {
             System.out.println("Enter New Pin:");
             int new_pin = sc.nextInt();
             pin = new_pin;
             System.out.println("Your pin Changed:");

          }
          else{
            System.out.println("Enter Correct Pin:");
          }
}

}
