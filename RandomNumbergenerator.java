import java.util.Random;
import java.util.Scanner;
public class RandomNumbergenerator{
int score = 0;
 
public void Game()
{
  for(int limit=5 ; limit>=1; limit--)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Lower range:");
    int min_range = sc.nextInt();
    System.out.println("Enter Upper range:");
    int max_range = sc.nextInt();
    System.out.println("Enter a Guess Number : ");
    int guess = sc.nextInt();
    
    Random rand = new Random();
    int a = rand.nextInt(max_range - min_range+1)+min_range;
    System.out.println(" ");
    System.out.println("<--------------------------------------------->");
    System.out.println("");
    System.out.println("Your guess:"+guess);
    System.out.println("Generated Number: " + a);
   
    if(guess>a)
    {
      System.out.println("Your Guess is High");

    }
    else if(guess<a)
    {
      System.out.println("Your Guess is Low");
  }
  else{
    System.out.println("Wow! You guessed the number");
    score++;
    
  }
   System.out.println("<--------------AVAILABLE ATTEMPTS:"+(limit-1)+"----------------->");
   System.out.println("");
   System.out.println("");

}
}

  public static void main(String[] args) {
    RandomNumbergenerator obj = new RandomNumbergenerator();
    obj.Game();
    System.out.println("~~~~~~~~~~~~~~~~YOUR FINAL SCORE:"+obj.score+" "+"OUT OF 5~~~~~~~~~~~~~~~~~~");
    System.out.println("");
    System.out.println("");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 1 : Play Again");
    System.out.println("Enter 2 : Exit");
    System.out.print("Enter Your Choice:");
    int choice = scanner.nextInt();
    System.out.println("");
    switch(choice)
    {
      case 1: obj.Game(); 
              break;
      case 2: System.exit(0); 
              break;
      default: System.out.println("Wrong choice");        
    }
  }
}