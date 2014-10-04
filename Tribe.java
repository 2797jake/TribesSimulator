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
   private double researchValue;
   private double construction;
   private int builders;
   private String struc;
   private double maxConstruction;
   private boolean canKarma;
   private int daysOfCurse;
   private double popGrowth;
   private double woodCost;
   private double stoneCost;
   public Tribe(String n)
   {
      name = n;
      isNomadic = true;
      wood = 10;
      stone = 10;
      hasIron = false;
      hasCopper = false;
      happiness = .5;
      population = 18;
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
      karma = 1.0;
      positivechanceincrease = 0;
      negativechanceincrease = 0;
      defense = .3;
      canTrade = false;
      nomadicDecayPerTurn = .013;
      nomadicValue = 1;
      food = 30;
      isRain = false;
      isStorm = false;
      isRainbow = false;
      isWarm = false;
      weapons = 0;
      isDay = true;
      hasFlag = false;
      researchValue = 0;
      construction = 0;
      builders = 0;
      struc = "";
      maxConstruction = 0;
      canKarma = true;
      daysOfCurse = -1;
      popGrowth = 0;
      woodCost = 0;
      stoneCost = 0;
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
      System.out.println("|              "+Base.round(population, 2));   
      System.out.println("|Wood:");
      System.out.println("|              "+Base.round(wood, 2));   
      System.out.println("|Stone:");
      System.out.println("|              "+Base.round(stone, 2));
      System.out.println("|Food:");
      System.out.println("|              "+Base.round(food, 2));
      System.out.println("|Technologies:");
      System.out.print("|              ");
      System.out.print((hasCopper) ? "Copper" : "");
      System.out.print(" ");
      System.out.print((hasIron) ? "Iron" : "");
      System.out.print(" ");
      System.out.print((!isNomadic) ? "Farming" : "");
      System.out.println();
      System.out.println("|Happiness Value:");
      System.out.println("|              "+Base.round(happiness, 2));
      System.out.println("|Defense Value:");
      System.out.println("|              "+Base.round(defense, 2));
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
   
   public double getFoodProduction(int workers)
   {
      double foodProduction = 0;
      int f = 0;
      
      double rand = 0;
      for(int n = 0; n < workers; n++) // gets food production based solely on amount of farmers
      {
         f = 1;
         rand = -.08 + (Math.random()*.95);
         rand += 1;
         rand = rand - (.5-(nomadicValue/2));
         foodProduction += rand;
      }
      double happy = happiness;
      happy = (happy/4);
      for(int n = 0; n < workers; n++) // modifies total food based on happiness
      {
         rand = 0 + (Math.random()*happy);
         foodProduction += rand;
      }
      if(isRain) // if it is raining, increase food production
         foodProduction = foodProduction * 1.15;
      if(aqueducts == 1)
         foodProduction = foodProduction * 1.2;
      if(trenches == 1)
         foodProduction = foodProduction * 1.1;
      //17.63
      
      
      
      return foodProduction;
   }
   
   public double getStoneProduction(int workers)
   {
      double stoneProduction = 0;
      int f = 0;
      double rand = 0;
      for(int n = 0; n < workers; n++) // gets food production based solely on amount of farmers
      {
         f = 1;
         rand = -.15 + (Math.random()*.6);
         stoneProduction += rand + 1;
      }
      double happy = happiness;
      happy = (happy/5);
      for(int n = 0; n < workers; n++) // modifies total food based on happiness
      {
         rand = 0 + (Math.random()*happy);
         stoneProduction += rand;
      }
      if(quarry == 1)
         stoneProduction = stoneProduction * 1.15;
      if(quarry == 2)
         stoneProduction = stoneProduction * 1.3;
      if(quarry == 3)
         stoneProduction = stoneProduction * 1.45;

      
      return stoneProduction;
   }
   
   public double getWoodProduction(int workers)
   {
      double stoneProduction = 0;
      int f = 0;
      double rand = 0;
      for(int n = 0; n < workers; n++) // gets food production based solely on amount of farmers
      {
         f = 1;
         rand = -.15 + (Math.random()*.6);
         stoneProduction += rand + 1;
      }
      double happy = happiness;
      happy = (happy/5);
      for(int n = 0; n < workers; n++) // modifies total food based on happiness
      {
         rand = 0 + (Math.random()*happy);
         stoneProduction += rand;
      }
      if(cabin == 1)
         stoneProduction = stoneProduction * 1.15;
      if(cabin == 2)
         stoneProduction = stoneProduction * 1.3;
      if(cabin == 3)
         stoneProduction = stoneProduction * 1.45;

      
      return stoneProduction;
   }
   
   
   public void setKarmaProduction(int workers)
   {
      positivechanceincrease = 0;
      if(workers < 1 && canKarma)
      {
         karma -= .15;
      }
      else if(canKarma)
      {
         positivechanceincrease = 0;
         for(int n = 0; n < workers; n++)
         {
            positivechanceincrease += .012;
         }
         if(temple == 1)
         {
            positivechanceincrease += .08;
         }
         if(shrine == 1)
         {
            positivechanceincrease += .15;
         }
      }
   }
   
   public void setDefenseValue(int workers)
   {
      defense = .3;
      for(int n = 0; n < workers; n++)
      {
         defense += .019;
      }
      for(int n = 0; n < weapons; n++)
      {
         defense += .008;
      }
      if(walls == 1)
         defense += .08;
      if(barracks == 1)
         defense += .05;
      if(barracks == 2)
         defense += .05;
      for(int i = 0; i < torture; i++)
         defense += .03;
   }
   
   public double getResearch(int workers)
   {
      double production = 0;
      for(int n = 0; n < workers; n++ )
      {
         if((0 + (int)(Math.random()*100)) > 80)
         {
            production += .023;
         }
      }
      if(lab == 1)///lab allows for 30% more experiments per turn
      {
         for(int n = 0; n < workers/3; n++ )
         {
            if((0 + (int)(Math.random()*100)) > 80)
            {
               production += .023;
            }
         }
      }
      researchValue += production;
      return production;
      
   }
   
   
   
   
   public double getConstruction()
   {
      double c= 0;
      for(int n = 0; n < builders; n++)
      {
         c += .05;
      }
      if(school == 1)
         c *= 1.1;
      if(school == 2)
         c *= 1.2;
      construction += c;
      return c;
      
      
   }
   
   public double getConstruction2(int workers)
   {
      double c= 0;
      for(int n = 0; n < workers; n++)
      {
         c += .05;
      }
      if(school == 1)
         c *= 1.1;
      if(school == 2)
         c *= 1.2;
      return c;
      
      
   }
   
   public int getWood()
   {
      return (int)wood;
   }
   
   public int getStone()
   {
      return (int)stone;
   }
   
   public int getTime(String s, int workers)
   {
      int count = 0;
      double cons = 0;
      double max = getMaxConstruction2(s);
      while(cons < max)
      {
         count++;
         cons += getConstruction2(workers);
      }
      return count;
   }
   
   private double getMaxConstruction(String s)
   {
      if(s.equalsIgnoreCase("temple"))
      {
         if(stone <=4 )
            return -1;
         if(wood <= 3 )
            return -1;
         stoneCost += 4;
         woodCost +=3;
         return 1;
      }
      if(s.equalsIgnoreCase("barracks"))
      {
         if(stone <= 6 )
            return -1;
         if(wood <= 4 )
            return -1;
         stoneCost += 6;
         woodCost += 4;
         return 1.8;
      }
      if(s.equalsIgnoreCase("walls"))
      {
         if(stone <= 12 )
            return -1;
         if(wood <= 5 )
            return -1;
         stoneCost += 12;
         woodCost += 5;
         return 3;
      }
      if(s.equalsIgnoreCase("logger's cabin"))
      {
         if(stone <= 1 )
            return -1;
         if(wood <= 3 )
            return -1;
         stoneCost += 1;
         woodCost += 3;
         return 1.2;
      }
      if(s.equalsIgnoreCase("quarry"))
      {
         if(stone <= 3 )
            return -1;
         if(wood <= 1 )
            return -1;
         woodCost += 1;
         stoneCost += 3;
         return 1.2;
      }
      if(s.equalsIgnoreCase("shrine"))
      {
         if(stone <= 9 )
            return -1;
         if(wood <= 8 )
            return -1;
         woodCost += 8;
         stoneCost += 9;
         return 3;
      }
      if(s.equalsIgnoreCase("laboratory"))
      {
         if(stone <=14 )
            return -1;
         if(wood <= 5 )
            return -1;
         woodCost += 5;
         stoneCost += 14;
         return 3;
      }
      if(s.equalsIgnoreCase("school"))
      {
         if(stone <= 4 )
            return -1;
         if(wood <= 8 )
            return -1;
         woodCost += 8;
         stoneCost += 4;
         return 2;
      }
      if(s.equalsIgnoreCase("torture room"))
      {
         if(stone <= 6 )
            return -1;
         if(wood <= 3 )
            return -1;
         woodCost += 3;
         stoneCost += 6;
         return .9;
      }
      if(s.equalsIgnoreCase("tavern"))
      {
         if(stone <= 2 )
            return -1;
         if(wood <= 7 )
            return -1;
         woodCost += 7;
         stoneCost += 2;
         return 1.2;
      }
      if(s.equalsIgnoreCase("theater"))
      {
         if(stone <= 5 )
            return -1;
         if(wood <= 14 )
            return -1;
         woodCost += 14;
         stoneCost += 5;
         return 3;
      }
      if(s.equalsIgnoreCase("flag"))
      {
         if(stone <= 1 )
            return -1;
         if(wood <= 3 )
            return -1;
         woodCost += 3;
         stoneCost += 1;
         return 1.5;
      }
      if(s.equalsIgnoreCase("aqueducts"))
      {
         if(stone <= 12 )
         {
            return -1;}
         if(wood <= 6)
            return -1;
         woodCost += 6;
         stoneCost += 12;
         return 2.8;
      }
      if(s.equalsIgnoreCase("water trenches"))
      {
         if(stone <= 1 )
            return -1;
         if(wood <= 6 )
            return -1;
         woodCost += 6;
         stoneCost += 1;
         return 1.5;
      }
      if(s.equalsIgnoreCase("city hall"))
      {
         if(stone <= 4 )
            return -1;
         if(wood <= 8 )
            return -1;
         woodCost += 8;
         stoneCost += 4;
         return 2.5;
      }
      if(s.equalsIgnoreCase("leader's hut"))
      {
         if(stone <= 1 )
            return -1;
         if(wood <= 5 )
            return -1;
         stoneCost += 1;
         woodCost += 5;
         return 1.5;
      }
      if(s.equalsIgnoreCase("capitol"))
      {
         if(stone <= 16 )
            return -1;
         if(wood <= 8 )
            return -1;
         stoneCost += 16;
         woodCost += 8;
         return 3.5;
      }
      return 0;
   }  
   
   
   
   
   private double getMaxConstruction2(String s)
   {
      if(s.equalsIgnoreCase("temple"))
         return 1;
      if(s.equalsIgnoreCase("barracks"))
         return 1.8;
      if(s.equalsIgnoreCase("walls"))
         return 3;
      if(s.equalsIgnoreCase("logger's cabin"))
         return 1.2;
      if(s.equalsIgnoreCase("quarry"))
         return 1.2;
      if(s.equalsIgnoreCase("shrine"))
         return 3;
      if(s.equalsIgnoreCase("laboratory"))
         return 3;
      if(s.equalsIgnoreCase("school"))
         return 2;
      if(s.equalsIgnoreCase("torture room"))
         return .9;
      if(s.equalsIgnoreCase("tavern"))
         return 1.2;
      if(s.equalsIgnoreCase("theater"))
         return 3;
      if(s.equalsIgnoreCase("flag"))
         return 1.5;
      if(s.equalsIgnoreCase("aqueducts"))
         return 2.8;
      if(s.equalsIgnoreCase("water trenches"))
         return 1.5;
      if(s.equalsIgnoreCase("city hall"))
         return 2.5;
      if(s.equalsIgnoreCase("leader's hut"))
         return 1.5;
      if(s.equalsIgnoreCase("capitol"))
         return 3.5;
      return 0;
   }  
   
   
   
   
   public void completeStructure()
   {
      String s = struc;
      if(s.equalsIgnoreCase("temple"))
         temple++;;
      if(s.equalsIgnoreCase("barracks"))
         barracks++;;
      if(s.equalsIgnoreCase("walls"))
         walls++;;
      if(s.equalsIgnoreCase("logger's cabin"))
         cabin++;
      if(s.equalsIgnoreCase("quarry"))
         quarry++;
      if(s.equalsIgnoreCase("shrine"))
         shrine++;
      if(s.equalsIgnoreCase("laboratory"))
         lab++;
      if(s.equalsIgnoreCase("school"))
         school++;
      if(s.equalsIgnoreCase("torture room"))
         torture++;
      if(s.equalsIgnoreCase("torture room"))
         happiness -= .15;
      if(s.equalsIgnoreCase("tavern"))
         tavern++;
      if(s.equalsIgnoreCase("tavern"))
         happiness += .15;
      if(s.equalsIgnoreCase("theater"))
         theater++;
      if(s.equalsIgnoreCase("theater"))
         happiness+=.1;
      if(s.equalsIgnoreCase("flag"))
         flag++;
      if(s.equalsIgnoreCase("aqueducts"))
         aqueducts++;
      if(s.equalsIgnoreCase("water trenches"))
         trenches++;
      if(s.equalsIgnoreCase("city hall"))
         cityhall++;
      if(s.equalsIgnoreCase("leader's hut"))
         leaderhut++;
      if(s.equalsIgnoreCase("capitol"))
         capitol++;
   }
   
   
   
   public String executeDay(int farming, int worshipping, int defending, int researching, int woodcutting, int stonemining, int itemC)
   {
      String summary = "";
      int cc = itemC;
      if(itemC * .75 > stone)
      {
         System.out.println("Not enough resources");
         Base.cycle(this);
      }
      itemC = cc;
      if(itemC * .5 > wood)
      {
         System.out.println("Not enough resources");
         Base.cycle(this);
      }
      
      weapons += cc;
      wood -= cc*.5;
      stone -= cc*.75;
      summary += "Produced " + cc + " weapons\n";
      
      
      if(!struc.equals(""))
         summary += "Work done on new structure: " + Base.round(getConstruction(), 2) + " completed " + Base.round(construction,2) + " out of " + maxConstruction + "\n";
      if(construction >= maxConstruction && maxConstruction > 0)
      {
         completeStructure();
         construction = 0;
         maxConstruction = 0;
         summary += struc + " was completed, the " + builders + " workers are now available";
         builders = 0;
         struc = "";
      }
      
      
      //
      //
      //
      //
      
      
      
      
      
      
      
      double foodProduction = getFoodProduction(farming);
      food += foodProduction;
      summary += "Food Produced: " + Base.round(foodProduction, 2) + "\n";
      double stoneProduction = getStoneProduction(stonemining);
      stone += stoneProduction;
      summary += "Stone Produced: " + Base.round(stoneProduction, 2)+"\n";
      double woodProduction = getWoodProduction(woodcutting);
      wood += woodProduction;
      summary += "Wood Produced: " + Base.round(woodProduction, 2)+"\n";
      
      if(worshipping > 0)
      {
         setKarmaProduction(worshipping);
         summary += "Karma Produced: " + Base.round(positivechanceincrease, 2) + "\n";
      }
      if(worshipping == 0)
      {
         setKarmaProduction(0);
         summary += "Karma Produced: " + Base.round(positivechanceincrease, 2) + "\n";
      }
      setDefenseValue(defending);
      summary += "Defense Value: " + Base.round(defense, 2) + "\n";
      
      summary += "Research Produced: " + getResearch(researching)+"\n";
      
      //
      //
      
      
      //check if research is enough to upgrade
      
      
      
      
      //
      //
      if(karma <= 0)
      {
         summary += "You have fallen out of favor with the gods, your negative calculation odds are increased for the next 5 days. you cannot produce any karma until this curse is lifted\n";
         karma = 100;
         canKarma = false;
         daysOfCurse = 5;
         negativechanceincrease += -.15;
      }
      if(daysOfCurse > 0)
      {
         daysOfCurse--;
      }
      if(karma == 100)
      {
         summary += daysOfCurse + " days left until the curse is lifted\n";
      }
      
      food -= population;
      summary += population + " food was consumed to maintain your population\n";
      
      if(food < 0)
         Base.gameOver();
      double f = food;
      double p = population;
      System.out.println(f-p + "foods");
      popGrowth += f-p;
      int count = 0;
      if(population == 18&& popGrowth > 20)
      {
         summary += "Population grew by one\n";
         population ++;
      }
      else if(population > 18&& population < 23 && popGrowth > 45)
      {
         summary += "Population grew by one\n";
         population ++;
      }
      else if(population > 22&& population < 31 && popGrowth > 100)
      {
         summary += "Population grew by one\n";
         population ++;
      }
      else if(population > 30 && population < 36 && popGrowth > 230)
      {
         summary += "Population grew by one\n";
         population ++;
      }
      else if(population > 35 && population < 45 && popGrowth > 580)
      {
         summary += "Population grew by one\n";
         population ++;
      }
      else if(population > 44 && population < 55 && popGrowth > 900)
      {
         summary += "Population grew by one\n";
         population ++;
      }
      else if(population > 54 && population < 60 && popGrowth > 1700)
      {
         summary += "Population grew by one\n";
         population ++;
      }
      else if(population > 59 && popGrowth > 2800)
      {
         summary += "Population grew by one\n";
         population ++;
      }
      popGrowth = 0;
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      if(daysOfCurse == 0)//this and everything after it go at the end of the execute day function
      {
         summary += "Your curse has been lifted, you may now produce karma again\n";
         daysOfCurse = -1;
         canKarma = true;
         negativechanceincrease += .15;
         karma = 1;
      }
      happinessPerTurn = 0;
      if(Base.round(happiness, 2) > .5)
         happinessPerTurn = -.05;
      if(Base.round(happiness, 2) < .5 )
         happinessPerTurn = .05;
      if(Base.round(happiness, 2) == .5)
         happinessPerTurn = 0;
      if(theater == 1 && Base.round(happiness, 2) == .5)
         happinessPerTurn = .05;
      if(theater == 1 && Base.round(happiness, 2) < .5)
         happinessPerTurn = .1;
      if(theater == 1 && Base.round(happiness, 2) > .5)
         happinessPerTurn = 0;
      
      happiness += happinessPerTurn;  
      
      if(isNomadic)
         nomadicValue -= nomadicDecayPerTurn;
      
      return summary;
   }
   public String executeDayWithStructure(int working, int farming, int worshipping, int defending, int researching, int woodcutting, int stonemining, int itemC, String structure)
   {
      String summary = "";
      int cc = itemC;
      woodCost = 0;
      stoneCost = 0;
      woodCost += cc*.5;
      stoneCost += cc*.75;
      
      /*weapons += cc;
      wood -= cc*.5;
      stone -= cc*.75;
      summary += "Produced " + cc + " weapons\n";*/
      
      struc = structure;
      builders = working;
      construction = 0;
      maxConstruction = getMaxConstruction(structure);
      if(maxConstruction == -1)
      {
         maxConstruction = 0;
         builders = 0;
         struc = "";
         System.out.println("Not enough resources");
         Base.cycle(this);
      }
      
      if(stoneCost > stone || woodCost > wood)
      {
         maxConstruction = 0;
         builders = 0;
         struc = "";
         System.out.println("Not enough resources");
         Base.cycle(this);
      }
      wood -= woodCost;
      stone -= stoneCost;
      summary += "Work done on new structure: " + Base.round(getConstruction(), 2) + " out of " + maxConstruction + "\n";
      
      
      
      //
      //
      //
      //

      double foodProduction = getFoodProduction(farming);
      food += foodProduction;
      summary += "Food Produced: " + Base.round(foodProduction, 2) + "\n";
      double stoneProduction = getStoneProduction(stonemining);
      stone += stoneProduction;
      summary += "Stone Produced: " + Base.round(stoneProduction, 2)+"\n";
      double woodProduction = getWoodProduction(woodcutting);
      wood += woodProduction;
      summary += "Wood Produced: " + Base.round(woodProduction, 2)+"\n";
      
      if(worshipping > 0)
      {
         setKarmaProduction(worshipping);
         summary += "Karma Produced: " + Base.round(positivechanceincrease, 2) + "\n";
      }
      if(worshipping == 0)
      {
         setKarmaProduction(0);
         summary += "Karma Produced: " + Base.round(positivechanceincrease, 2) + "\n";
      }
      setDefenseValue(defending);
      summary += "Defense Value: " + Base.round(defense, 2) + "\n";
      
      summary += "Research Produced: " + getResearch(researching)+"\n";
      
      //
      //
      /*if(!struc.equals(""))
         summary += "Work done on new structure: " + Base.round(getConstruction(), 2) + " completed " + Base.round(construction,2) + " out of " + maxConstruction + "\n";
      if(construction >= maxConstruction && maxConstruction > 0)
      {
         completeStructure();
         construction = 0;
         maxConstruction = 0;
         summary += struc + " was completed, the " + builders + " workers are now available";
         builders = 0;
         struc = "";
      }*/
      
      //check if research is enough to upgrade
      
      if(karma <= 0)
      {
         summary += "You have fallen out of favor with the gods, your negative calculation odds are increased for the next 5 days. you cannot produce any karma until this curse is lifted\n";
         karma = 100;
         canKarma = false;
         daysOfCurse = 5;
         negativechanceincrease += -.15;
      }
      if(daysOfCurse > 0)
      {
         daysOfCurse--;
      }
      if(karma == 100)
      {
         summary += daysOfCurse + " days left until the curse is lifted";
         
      }
      
      food -= population;
      summary += population + " food was consumed to maintain your population\n";
      
      if(food < 0)
         Base.gameOver();
      double f = food;
      double p = population;
      System.out.println(f-p + "foods");
      popGrowth += f-p;
      int count = 0;
      if(population == 18&& popGrowth > 20)
      {
         summary += "Population grew by one\n";
         population ++;
      }
      else if(population > 18&& population < 23 && popGrowth > 45)
      {
         summary += "Population grew by one\n";
         population ++;
      }
      else if(population > 22&& population < 31 && popGrowth > 100)
      {
         summary += "Population grew by one\n";
         population ++;
      }
      else if(population > 30 && population < 36 && popGrowth > 230)
      {
         summary += "Population grew by one\n";
         population ++;
      }
      else if(population > 35 && population < 45 && popGrowth > 580)
      {
         summary += "Population grew by one\n";
         population ++;
      }
      else if(population > 44 && population < 55 && popGrowth > 900)
      {
         summary += "Population grew by one\n";
         population ++;
      }
      else if(population > 54 && population < 60 && popGrowth > 1700)
      {
         summary += "Population grew by one\n";
         population ++;
      }
      else if(population > 59 && popGrowth > 2800)
      {
         summary += "Population grew by one\n";
         population ++;
      }
      popGrowth = 0;
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      if(daysOfCurse == 0)//this and everything after it go at the end of the execute day function
      {
         summary += "Your curse has been lifted, you may now produce karma again\n";
         daysOfCurse = -1;
         canKarma = true;
         negativechanceincrease += .15;
         karma = 1;
      }
      
      happinessPerTurn = 0;
      if(Base.round(happiness, 2) > .5)
         happinessPerTurn = -.05;
      if(Base.round(happiness, 2) < .5 )
         happinessPerTurn = .05;
      if(Base.round(happiness, 2) == .5)
         happinessPerTurn = 0;
      if(theater == 1 && Base.round(happiness, 2) == .5)
         happinessPerTurn = .05;
      if(theater == 1 && Base.round(happiness, 2) < .5)
         happinessPerTurn = .1;
      if(theater == 1 && Base.round(happiness, 2) > .5)
         happinessPerTurn = 0;
      
      happiness += happinessPerTurn;
      
      if(isNomadic)
         nomadicValue -= nomadicDecayPerTurn;
      
      
      
      return summary;
   }
   
   public int getBuilders()
   {
      return builders;
   }  
}

//need to implement nomadicValue into resource production