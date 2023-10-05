package Atm;
import java.util.Scanner;
public class Main {

   
   public static void main(String[] args) {
     Customer c1 = new Customer();
      
     while(true)

     {
    System.out.println("<<------------------------------------------------>>");
     System.out.println("Press 1: DEPOSITE MONEY:");
     System.out.println("Press 2: WITHDRAW MONEY:");
     System.out.println("Press 3: CHANGE PIN: ");
     System.out.println("Press 4: CHECK BALANCE: ");
     System.out.println("Press 5: SHOW DETAILS: ");
     System.out.println("Press 6: EXIT: ");
     System.out.println("<<------------------------------------------------>>");


     Scanner sc= new Scanner(System.in);
     System.out.print("Enter any Operation Number : ");
     int choice=sc.nextInt();

    
    switch(choice){
    
              
     case 1:
            c1.DepositAmount();
                 break;

     case 2: c1.withdrawMoney();
                 break;

     case 3: c1.changePin();
                 break;

     case 4: c1.checkBalance();
                 break;

        case 5: c1.Display(); 
                 break; 
            
        case 6: System.exit(0);     
        default: System.out.println("Wrong Input");            
       }
                 
    }
   }
   }
     
     
