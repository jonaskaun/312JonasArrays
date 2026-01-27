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
    boolean foundPlayer = false;
    int t = 0;
    while(t<players.length){
      while (foundPlayer = false){
        if (players[t].getAge >= 18){

      }
    }

    }
    
  }

  

  
}