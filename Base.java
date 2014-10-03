import java.util.*;
public class Base
{
   public static void main(String args[])
   {
      newTribe();

   }
   
   public static void newTribe()
   {
      System.out.println("|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|");
      System.out.println("|                      |");
      System.out.println("|Tribes Simulator 0.1.1|");
      System.out.println("|                      |");
      System.out.println("|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|");
      Scanner scan = new Scanner(System.in);
      System.out.print("Name your village:");
      String name = scan.nextLine();
      Tribe tribe = new Tribe(name);
      tribe.displayStats();
      cycle(tribe);
      
   }
   
   public static void cycle(Tribe tribe)
   {
      Scanner scan = new Scanner(System.in);
      //Display stats
      
      //Get Instructions for the turn
      System.out.println("Would you like to build anything?");
      String in = scan.nextLine();
      int working = 0;
      String struc = "";
      if(in.equalsIgnoreCase("yes"))
      {
         if(tribe.getBuilders() > 0)
            cycle(tribe);
         //how many workers to assign and what structure, display amount of turns it will take and ask if they are sure
         System.out.println("Amount of population dedicated to construction:");
         working = scan.nextInt();
         if (working < 1)
            cycle(tribe);
         System.out.println("What structure?");
         scan.nextLine();
         struc = scan.nextLine();
         
         
         System.out.println("Estimated days until completion: " + tribe.getTime(struc, working)+"\nWould you like to continue?");
         String iin = scan.next();
         if(iin.equalsIgnoreCase("no"))
            cycle(tribe);
         
         
         
         System.out.println("Note: " + working + " of your population is working on construction and are not available");
          
      }
      else if(in.equalsIgnoreCase("no"))
      {
      }
      else
      {
         System.out.println("Input not recognized");
         cycle(tribe);
      }
      
      if(!in.equalsIgnoreCase("yes"))
         System.out.println("Note: " + tribe.getBuilders() + " of your population is working on construction and are not available");
      System.out.println("Amount of population dedicated to hunting/gathering or farming:");
      int farming = scan.nextInt();
      System.out.println("Amount of population dedicated to Worship:");
      int worshiping = scan.nextInt();
      System.out.println("Amount of population dedicated to defense:");
      int defending = scan.nextInt();
      System.out.println("Amount of population dedicated to research:");
      int researching = scan.nextInt();
      System.out.println("Amount of population dedicated to stone mining:");
      int stoneMining = scan.nextInt();
      System.out.println("Amount of population dedicated to wood cutting:");
      int woodCutting = scan.nextInt();
      int count = tribe.getBuilders() + working + farming + worshiping + defending + researching + stoneMining + woodCutting;
      if(count > tribe.getPopulation())
      {
         System.out.println("You assigned more workers than you have");
         cycle(tribe);
      }
      if(count < tribe.getPopulation())
      {
         System.out.println("You assigned less workers than you have");
         cycle(tribe);
      }
      //Execute Day(the function not only executes the day, but returns a string summarizing everything done in the way, same goes for executeNight)
      if(struc.equals(""))
      {
      
         System.out.println(tribe.executeDay(farming, worshiping, defending, researching, woodCutting, stoneMining));
      }
      if(!struc.equals(""))
      {
         System.out.println(tribe.executeDayWithStructure(working, farming, worshiping, defending, researching, stoneMining, woodCutting, struc));
      }
      

      //Display Stats
      tribe.displayStats();
      //Execute Night
      //System.out.println(tribe.executeNight(defending));
      //Repeat
      cycle(tribe);
   }
   
   public static double round(double value, int places) {
    if (places < 0) throw new IllegalArgumentException();

    long factor = (long) Math.pow(10, places);
    value = value * factor;
    long tmp = Math.round(value);
    return (double) tmp / factor;
   }

}