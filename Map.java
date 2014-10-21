import java.util.*;
import java.io.*;

public class Map
{
   private String rawMap; 
   private int mapNo;
   public Map(int mapNum) throws FileNotFoundException
   {
      rawMap = "";
      mapNo = mapNum;
      Scanner in = new Scanner(new FileReader("Map" + mapNo +".txt"));
      while(in.hasNext())
      {
         rawMap += in.next();
      }
      System.out.println(rawMap);
   }
   
   public void sort()
   {
      rawMap = rawMap.replace("[", "");
      String[] str0 = rawMap.split("]");
      String[][] str1 = new String[10][10];
      
      
      //NEED TO CONVERT STR0 INTO A 2D ARRAY, STR1
      String[] row1 = str0[0].split(",");
      String[] row2 = str0[1].split(",");
      String[] row3 = str0[2].split(",");
      String[] row4 = str0[3].split(",");
      String[] row5 = str0[4].split(",");
      String[] row6 = str0[5].split(",");
      String[] row7 = str0[6].split(",");
      String[] row8 = str0[7].split(",");
      String[] row9 = str0[8].split(",");
      String[] row10 = str0[9].split(",");
      str1[0] = row1;
      str1[1] = row2;
      str1[2] = row3;
      str1[3] = row4;
      str1[4] = row5;
      str1[5] = row6;
      str1[6] = row7;
      str1[7] = row8;
      str1[8] = row9;
      str1[9] = row10;
      
      
      
      
      
      
      
       for(int i = 0; i < str1.length; i++)
{
    for(int j = 0; j < str1[i].length; j++)
    {
        System.out.print(str1[i][j]);
        if(j < str1[i].length - 1) System.out.print(" ");
    }
    System.out.println();
}  
      
      
      
      
      
      
      
      
   }
}