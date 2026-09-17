import java.util.Scanner;

public class Practice091126 {
   public static void main(String[] args) {
      int numFBPlayers = 40;
      double averagePlayerTime = 12.56;
      boolean lastGameWin = true;
      String teamName = "Ballard Beavers";
      
      System.out.println("Please enter in your team name");
      Scanner scan = new Scanner(System.in);
      teamName = scan.nextLine();
      System.out.println("You entered\tthe team name \"" + teamName + "\"");
      scan.close();
   }

}