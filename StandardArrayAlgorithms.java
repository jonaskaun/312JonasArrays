/*
 * Activity 3.1.4
 */
public class StandardArrayAlgorithms
{
  public static void main(String[] args)
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    Player[] players = {new Player("Alex", 12), new Player("Aiden", 13),
    new Player("Bobbie", 18), new Player("Blaine", 20),
    new Player("Chris", 15), new Player("Charlie", 15)};
    
    int sum = 0;
    for (int i = 0; i < goals.length; i++)
      //record each goal to a single sum int
      sum += goals[i];
    System.out.println("All goals: " + sum);
    // print average goals per game, no rounding
    double averageGoals = (sum)/((1.0)*(goals.length)); 
    System.out.println("Average goals: "+ averageGoals);


    // finding the max value
    int max = 0;
    for(int goal: goals){
      if (goal>max){
        max = goal;
      }
    }
    System.out.println("The max goal amount was: "+max);
  

    // finding a player 18 or older
    String oldPlayer = "";
    boolean hasValue = false;

    int t = 0;
    while(hasValue == false){
      
      if (players[t].getAge()>= 18){
        oldPlayer = players[t].getName();
        hasValue = true;
      }
      t++;
    }

    System.out.println(oldPlayer +" is 18 or older");


    System.out.println("the players are: ");
    t= 0;
    for(Player p: players){
      System.out.print(p.getName());

      if( t%2 == 0){
        System.out.print(" and ");
      }
      else{
        System.out.println("");
      }
      t++;
    }

    int[] cookingLevel = {6,7,67,21,8,9};
    System.out.println("\n\n\n\nchat are we cooked???: ");
    
    
    for(int sixSeven: cookingLevel){
      System.out.print(sixSeven+", ");
    }
    int tempRot;
    System.out.println("\n");
    for(t=0;t<cookingLevel.length-1;t++){
      tempRot = cookingLevel[t];
      cookingLevel[t] = cookingLevel[t+1];
      cookingLevel[t+1] = tempRot;
    }
    for(int sixSeven: cookingLevel){
      System.out.print(sixSeven+", ");
    }
    System.out.println("\n\n\n\n\n");

    String[] brainRot = {"tun tun tun sahur","assassino capuchino","bombini goosini","girraffe","frullili fruilla","glorbo"};
    for(t=brainRot.length;t>0;t--){
      System.out.println(brainRot[t-1]);
    }

  }
    
}

