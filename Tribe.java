public class Tribe
{
   private String name;
   private boolean isNomadic;
   private double wood;
   private double stone;
   private boolean hasIron;
   private boolean hasCopper;
   private double happiness;
   private double population;
   private int temple;
   private int barracks;
   private int walls;
   private int cabin;
   private int quarry;
   private int shrine;
   private int lab;
   private int school;
   private int torture;
   private int tavern;
   private int theater;
   private int flag;
   private int aqueducts;
   private int trenches;
   private int leaderhut;
   private int cityhall;
   private int capitol;
   private double happinessPerTurn;
   private double karmaPerTurn;
   private double karma; // This is the one that decreases each turn there is no religion production
   private double positivechanceincrease;
   private double negativechanceincrease;
   private double defense;
   private boolean canTrade;
   private double nomadicDecayPerTurn;
   private double nomadicValue;
   private double food;
   private boolean isRain;
   private boolean isStorm;
   private boolean isRainbow;
   private boolean isWarm;
   private int weapons;
   private boolean isDay;
   private boolean hasFlag;

   public Tribe(String n)
   {
      name = n;
      isNomadic = true;
      wood = 10;
      stone = 10;
      hasIron = false;
      hasCopper = false;
      happiness = 50;
      population = 15;
      temple = 0;
      barracks = 0;
      walls = 0;
      cabin = 0;
      quarry = 0;
      shrine = 0;
      lab = 0;
      school = 0;
      torture = 0;
      tavern = 0;
      theater = 0;
      flag = 0;
      aqueducts = 0;
      trenches = 0;
      cityhall = 0;
      leaderhut = 0;
      capitol = 0;
      happinessPerTurn = 0;
      karmaPerTurn = 0;
      karma = 100;
      positivechanceincrease = 0;
      negativechanceincrease = 0;
      defense = 50;
      canTrade = false;
      nomadicDecayPerTurn = 1;
      nomadicValue = 100;
      food = 20;
      isRain = false;
      isStorm = false;
      isRainbow = false;
      isWarm = false;
      weapons = 0;
      isDay = true;
      hasFlag = false;
   }
   
   public int getPopulation()
   {
      return (int)population;
   }
   
   public void displayStats()
   {
      System.out.println("Tribe Statistics:");
      System.out.println("----------------------------------");
      System.out.println("|Population:");
      System.out.println("|              "+population);   
      System.out.println("|Wood:");
      System.out.println("|              "+wood);   
      System.out.println("|Stone:");
      System.out.println("|              "+stone);
      System.out.println("|Technologies:");
      System.out.print("|              ");
      System.out.print((hasCopper) ? "Copper" : "");
      System.out.print(" ");
      System.out.print((hasIron) ? "Iron" : "");
      System.out.print(" ");
      System.out.print((!isNomadic) ? "Farming" : "");
      System.out.println();
      System.out.println("|Happiness Value:");
      System.out.println("|              "+happiness);
      System.out.println("|Defense Value:");
      System.out.println("|              "+defense);
      System.out.print("|");
      System.out.print(canTrade ? "Trading Available" : "Cannot Trade");
      System.out.println();
      System.out.print("|");
      System.out.print(isRain ? "It is raining" : "");
      System.out.print(isStorm ? "It is storming" : "");
      System.out.print(isRainbow ? "There is a rainbow" : "");
      System.out.print(isWarm ? "It is a nice day" : "");
      System.out.print((!isRain && !isWarm && !isStorm && !isRainbow) ? "Clear skies" : "");
      System.out.println();
      System.out.print("|");
      System.out.print(isDay ? "It is daytime" : "It is nighttime");
      System.out.println();
      System.out.println("|Structures:");
      System.out.print((temple == 1) ? "|              Temple\n              " : "");
      System.out.print((barracks == 1) ? "|              Barracks\n              " : "");
      System.out.print((barracks == 2) ? "|              Barracks\n|              Barracks\n" : "");
      System.out.print((walls == 1) ? "|              Walls\n              " : "" );
      System.out.print((cabin == 1) ? "|              Logger's Cabin\n              " : "");
      System.out.print((cabin == 2) ? "|              Logger's Cabin\n|              Logger's Cabin\n" : "");
      System.out.print((quarry == 1) ? "|              Quarry\n              " : "");
      System.out.print((quarry == 2) ? "|              Quarry\n|              Quarry\n" : "");
      System.out.print((shrine == 1) ? "|              Shrine\n              " : "");
      System.out.print((lab == 1) ? "|              Laboratory\n              " : "");
      System.out.print((lab == 2) ? "|              Laboratory\n|              Laboratory\n" : "");
      System.out.print((school == 1) ? "|              School\n              " : "");
      System.out.print((school == 2) ? "|              School\n|              School\n" : "");
      System.out.print((quarry == 1) ? "|              Torture Room\n              " : "");
      System.out.print((quarry == 2) ? "|              Torture Room\n|              Torture Room\n" : "");
      System.out.print((quarry == 3) ? "|              Torture Room\n|              Torture Room\n|              Torture Room\n" : "");
      System.out.print((tavern == 1) ? "|              Tavern\n              " : "");
      System.out.print((tavern == 2) ? "|              Tavern\n|              Tavern\n" : "");
      System.out.print((theater == 1) ? "|              Theater\n              " : "");
      System.out.print((flag == 1) ? "|              Flag\n              " : "");
      System.out.print((aqueducts == 1) ? "|              Aqueducts\n              " : "");
      System.out.print((trenches == 1) ? "|              Water Trenches\n              " : "");
      System.out.print((cityhall == 1) ? "|              City Hall\n              " : "");
      System.out.print((leaderhut == 1) ? "|              Leader's Hut\n              " : "");
      System.out.print((capitol == 1) ? "|              Capitol Building\n              " : "");
      System.out.println("----------------------------------");
   }
}